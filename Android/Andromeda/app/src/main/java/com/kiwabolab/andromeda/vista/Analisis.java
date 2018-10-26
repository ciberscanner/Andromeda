package com.kiwabolab.andromeda.vista;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kiwabolab.andromeda.R;
import com.kiwabolab.andromeda.modelo.Procuraduria;
import com.kiwabolab.andromeda.modelo.Rues;
import com.valdesekamdem.library.mdtoast.MDToast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Analisis extends Activity {
    //----------------------------------------------------------------------------------------------
    //Variables
    @BindView(R.id.txtNameScore)TextView nombrecore;
    @BindView(R.id.txtNitScore)TextView nitscore;
    @BindView(R.id.dotRues)ImageView dotRues;
    @BindView(R.id.dotProcuraduria)ImageView dotProcuraduria;
    @BindView(R.id.scorebar)ImageView scorebar;
    @BindView(R.id.dotgreen)TextView greenScore;
    @BindView(R.id.dotorange)TextView orangeScore;
    @BindView(R.id.dotred)TextView redScore;
    @BindView(R.id.scoreCalificacion)TextView score;


    private float green=0;
    private float orange=0;
    private float red=0;


    private Rues rues;
    private Procuraduria procuraduria;
    //----------------------------------------------------------------------------------------------
    //Constructor
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisis);
        ButterKnife.bind(this);

        rues = (Rues)getIntent().getSerializableExtra("rues");
        procuraduria = (Procuraduria) getIntent().getSerializableExtra("procuraduria");

        setVista();
    }
    //----------------------------------------------------------------------------------------------
    //
    private void setVista(){
        if(rues.getCodigoError().equals("0000")){
            nombrecore.setText(rues.getRows().get(0).getRazonSocial());
            nitscore.setText(rues.getRows().get(0).getIdentificacion());

            if(rues.getRows().get(0).getEstado().equals("ACTIVA")){
                dotRues.setImageResource(R.mipmap.dot_green);
                green++;
            }
        }else{
            nombrecore.setText("No Hay Registro En RUES");
            nombrecore.setTextColor(Color.RED);
            dotRues.setImageResource(R.mipmap.dot_red);
            red++;
        }


        if(procuraduria.getAntecedente().contains("no presenta antecedentes")){
            dotProcuraduria.setImageResource(R.mipmap.dot_green);
            green++;
        }else if(procuraduria.getAntecedente().isEmpty()){
            dotProcuraduria.setImageResource(R.mipmap.dot_orange);
            orange++;
        }
        else{
            dotProcuraduria.setImageResource(R.mipmap.dot_red);
            red++;
        }

        greenScore.setText(" "+green);
        redScore.setText(" "+red);
        orangeScore.setText(" "+orange);

        float aux = green+orange+red;
        double calificacion = (green*5 + orange*2.5)/aux;
        score.setText(""+calificacion);

        int margen = (int)(calificacion/0.382);

        switch (margen){
            case 1:
                scorebar.setImageResource(R.mipmap.calificacion_valor_1);
                break;
            case 2:
                scorebar.setImageResource(R.mipmap.calificacion_valor_2);
                break;
            case 3:
                scorebar.setImageResource(R.mipmap.calificacion_valor_3);
                break;
            case 4:
                scorebar.setImageResource(R.mipmap.calificacion_valor_4);
                break;
            case 5:
                scorebar.setImageResource(R.mipmap.calificacion_valor_5);
                break;
            case 6:
                scorebar.setImageResource(R.mipmap.calificacion_valor_6);
                break;
            case 7:
                scorebar.setImageResource(R.mipmap.calificacion_valor_7);
                break;
            case 8:
                scorebar.setImageResource(R.mipmap.calificacion_valor_8);
                break;
            case 9:
                scorebar.setImageResource(R.mipmap.calificacion_valor_9);
                break;
            case 10:
                scorebar.setImageResource(R.mipmap.calificacion_valor_10);
                break;
            case 11:
                scorebar.setImageResource(R.mipmap.calificacion_valor_11);
                break;
            case 12:
                scorebar.setImageResource(R.mipmap.calificacion_valor_12);
                break;
            case 13:
                scorebar.setImageResource(R.mipmap.calificacion_valor_13);
                break;
        }
    }
    //----------------------------------------------------------------------------------------------
    //
    public void GotoRues(View view){
        if(rues.getCodigoError().equals("0000")){
            Intent intent = new Intent(this, DetalleRues.class);
            intent.putExtra("rues",rues);
            startActivity(intent);
        }else {
            MDToast mdToast = MDToast.makeText(getApplicationContext(), "Error! No existe registro", MDToast.LENGTH_LONG, MDToast.TYPE_ERROR);
            mdToast.show();
        }
    }
    //----------------------------------------------------------------------------------------------
    //
    public void GotoProcuraduria(View view){
        if(!procuraduria.getNombre().isEmpty()){
            Intent intent = new Intent(this, DetalleProcuraduria.class);
            intent.putExtra("procuraduria",procuraduria);
            startActivity(intent);
        }else {
            MDToast mdToast = MDToast.makeText(getApplicationContext(), "Atención! No existe registro", MDToast.LENGTH_LONG, MDToast.TYPE_WARNING);
            mdToast.show();
        }

    }
    //----------------------------------------------------------------------------------------------
    //
    public void GotoExternas(View view){
        if(rues.getCodigoError().equals("0000")){
            Intent intent = new Intent(this, Externas.class);
            intent.putExtra("rues",rues);
            startActivity(intent);
        }else {
            MDToast mdToast = MDToast.makeText(getApplicationContext(), "Atención! No existe registro sin RUES", MDToast.LENGTH_LONG, MDToast.TYPE_WARNING);
            mdToast.show();
        }
    }
}
