package com.kiwabolab.andromeda.vista;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kiwabolab.andromeda.R;
import com.kiwabolab.andromeda.modelo.ProveedorSecop;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetalleSecop extends Activity {
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

    private ProveedorSecop proveedorSecop;
    //----------------------------------------------------------------------------------------------
    //Constructor
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallesecop2);
        ButterKnife.bind(this);
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

    }
    //----------------------------------------------------------------------------------------------
    //
    public void Exit(View view){
        finish();
    }
}