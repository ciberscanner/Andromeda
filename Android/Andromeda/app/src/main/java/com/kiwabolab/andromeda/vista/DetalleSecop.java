package com.kiwabolab.andromeda.vista;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.kiwabolab.andromeda.R;
import com.kiwabolab.andromeda.modelo.Contrato;
import com.kiwabolab.andromeda.modelo.ProveedorSecop;
import com.kiwabolab.andromeda.presentacion.secop.ContratoSecop;
import com.kiwabolab.andromeda.presentacion.secop.PresentadorSecop;
import com.valdesekamdem.library.mdtoast.MDToast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetalleSecop extends Activity implements ContratoSecop.ContratoSecopVista {
    //----------------------------------------------------------------------------------------------
    //Variables
    @BindView(R.id.dotRues)ImageView dotSecop;
    @BindView(R.id.dotSecop2)ImageView dotSecop2;
    @BindView(R.id.titledetalle)TextView title;
    @BindView(R.id.nombre)TextView nombre;
    @BindView(R.id.mypime)TextView mypime;
    @BindView(R.id.fecha)TextView fecha;
    @BindView(R.id.footer)LinearLayout footer;
    @BindView(R.id.btnconsultar)ImageView consultar;
    @BindView(R.id.progressBar)ProgressBar progressBar;
    @BindView(R.id.contratostotales)TextView contratostotales;
    @BindView(R.id.contratosvigentes)TextView contratosvigentes;
    @BindView(R.id.totalcontratado)TextView totalcontratado;

    private PresentadorSecop presentador;
    private ProveedorSecop proveedorSecop;
    private List<Contrato> contratos;
    //----------------------------------------------------------------------------------------------
    //Constructor
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallesecop2);
        ButterKnife.bind(this);
        presentador = new PresentadorSecop(this);
        proveedorSecop = (ProveedorSecop)getIntent().getSerializableExtra("proveedorSecop");
        setVista();
    }
    //----------------------------------------------------------------------------------------------
    //
    private void setVista(){
        title.setText("SECOP II");
        footer.setVisibility(View.GONE);
        dotSecop.setImageResource(R.mipmap.dot_green);
        dotSecop2.setImageResource(R.mipmap.dot_green);
        nombre.setText(proveedorSecop.getNombre());
        mypime.setText(proveedorSecop.getEspyme());
        if(proveedorSecop.getFechaCreacion().length()>10){
            fecha.setText(proveedorSecop.getFechaCreacion().substring(0,10));
        }else{
            fecha.setText(proveedorSecop.getFechaCreacion());
        }
    }
    //----------------------------------------------------------------------------------------------
    //
    public void consultarContratacion(View v){
        obtenerContratosSecop(proveedorSecop.getNit());
    }
    //----------------------------------------------------------------------------------------------
    //
    public void Exit(View view){
        finish();
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void closeLoading() {
        progressBar.setVisibility(View.GONE);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerContratosSecop(String nit) {
        presentador.obtenerContratosSecop(nit);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerContratosOk(List<Contrato> proveedorSecops) {
        contratos = proveedorSecops;
        if(contratos.isEmpty()){
            MDToast mdToast = MDToast.makeText(getApplicationContext(), "No hay Contratos SECOP", MDToast.LENGTH_SHORT, MDToast.TYPE_SUCCESS);
            mdToast.show();
        }else{
            consultar.setVisibility(View.GONE);
            footer.setVisibility(View.VISIBLE);
            MDToast mdToast = MDToast.makeText(getApplicationContext(), "Contratos SECOP", MDToast.LENGTH_SHORT, MDToast.TYPE_SUCCESS);
            mdToast.show();
            procesarSecop();
        }
        closeLoading();
    }
    //----------------------------------------------------------------------------------------------
    //
    private void procesarSecop(){
        contratostotales.setText(contratos.size()+"");
        long total=0;
        for(Contrato contrato : contratos){
            total+=(Float.parseFloat(contrato.getValorDelContrato()));
        }
        totalcontratado.setText(addPuntos(total+""));
    }
    //----------------------------------------------------------------------------------------------
    //
    private String addPuntos(String text){
        String x=text;
        switch (text.length()){
            case 4:
                x = text.substring(0, 1) + "." + text.substring(1, text.length());
                break;
            case 5:
                x = text.substring(0, 2) + "." + text.substring(2, text.length());
                break;
            case 6:
                x = text.substring(0, 3) + "." + text.substring(3, text.length());
                break;
            case 7:
                x = text.substring(0, 1) + "." + text.substring(1, text.length());
                x = x.substring(0, 5) + "." + x.substring(5, x.length());
                break;
            case 8:
                x = text.substring(0, 2) + "." + text.substring(2, text.length());
                x = x.substring(0, 6) + "." + x.substring(6, x.length());
                break;
            case 9:
                x = text.substring(0, 3) + "." + text.substring(3, text.length());
                x = x.substring(0, 7) + "." + x.substring(7, x.length());
                break;
        }
        return x;
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerContratosError() {
        consultar.setVisibility(View.VISIBLE);
        footer.setVisibility(View.GONE);
        MDToast mdToast = MDToast.makeText(getApplicationContext(), "Error en Contratos SECOP", MDToast.LENGTH_SHORT, MDToast.TYPE_ERROR);
        mdToast.show();
    }
}