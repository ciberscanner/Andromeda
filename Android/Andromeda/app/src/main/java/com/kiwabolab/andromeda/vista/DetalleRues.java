package com.kiwabolab.andromeda.vista;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kiwabolab.andromeda.R;
import com.kiwabolab.andromeda.modelo.Rues;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetalleRues extends Activity {
    //----------------------------------------------------------------------------------------------
    //Variables
    @BindView(R.id.estado)TextView estado;
    @BindView(R.id.registro)TextView registro;
    @BindView(R.id.categoria)TextView categoria;
    @BindView(R.id.sociedad)TextView tipo;
    @BindView(R.id.camara)TextView camara;

    @BindView(R.id.dotRues)ImageView dotRues;
    @BindView(R.id.dotRues2)ImageView dotRues2;


    private Rues rues;
    //----------------------------------------------------------------------------------------------
    //Constructor
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallrues);
        ButterKnife.bind(this);

        rues = (Rues)getIntent().getSerializableExtra("rues");
        setVista();
    }
    //----------------------------------------------------------------------------------------------
    //
    private void setVista(){
        estado.setText(rues.getRows().get(0).getEstado());
        registro.setText(rues.getRows().get(0).getMatricula());
        categoria.setText(rues.getRows().get(0).getCategoriaMatricula());
        tipo.setText(rues.getRows().get(0).getOrganizacionJuridica());
        camara.setText(rues.getRows().get(0).getNombreCamara());

        if(rues.getRows().get(0).getEstado().equals("ACTIVA")){
            dotRues.setImageResource(R.mipmap.dot_green);
            dotRues2.setImageResource(R.mipmap.dot_green);
        }else{
            dotRues.setImageResource(R.mipmap.dot_red);
            dotRues2.setImageResource(R.mipmap.dot_red);

        }
    }
    //----------------------------------------------------------------------------------------------
    //
    public void Exit(View view){
        finish();
    }
}