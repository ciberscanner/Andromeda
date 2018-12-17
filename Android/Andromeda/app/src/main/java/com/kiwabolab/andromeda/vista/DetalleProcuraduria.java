package com.kiwabolab.andromeda.vista;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kiwabolab.andromeda.R;
import com.kiwabolab.andromeda.modelo.Procuraduria;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetalleProcuraduria extends Activity {
    //----------------------------------------------------------------------------------------------
    //Variables
    @BindView(R.id.dotRues)ImageView dotProcuraduria;
    @BindView(R.id.dotProcuraduria2)ImageView dotProcuraduria2;
    @BindView(R.id.descripcion)TextView descripcion;
    @BindView(R.id.titledetalle)TextView title;


    private Procuraduria procuraduria;
    //----------------------------------------------------------------------------------------------
    //Constructor
    //----------------------------------------------------------------------------------------------
    //Constructor
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalleprocuraduria);
        ButterKnife.bind(this);

        //rues = (Rues)getIntent().getSerializableExtra("rues");
        procuraduria = (Procuraduria) getIntent().getSerializableExtra("procuraduria");
        title.setText("PROCURADURÍA");
        setVista();
    }
    //----------------------------------------------------------------------------------------------
    //
    private void setVista(){
        descripcion.setText(procuraduria.getAntecedente());
        if(procuraduria.getAntecedente().contains("no presenta antecedentes")){
            dotProcuraduria.setImageResource(R.mipmap.dot_green);
            dotProcuraduria2.setImageResource(R.mipmap.dot_green);
        }else if(procuraduria.getAntecedente().isEmpty()){
            dotProcuraduria.setImageResource(R.mipmap.dot_orange);
            dotProcuraduria2.setImageResource(R.mipmap.dot_orange);
        }
        else{
            dotProcuraduria.setImageResource(R.mipmap.dot_red);
            dotProcuraduria2.setImageResource(R.mipmap.dot_red);
        }
    }
    //----------------------------------------------------------------------------------------------
    //
    public void Exit(View view){
        finish();
    }

}
