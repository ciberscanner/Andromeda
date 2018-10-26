package com.kiwabolab.andromeda.vista;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kiwabolab.andromeda.R;
import com.kiwabolab.andromeda.modelo.ProveedorSecop;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetalleSecop extends Activity {
    //----------------------------------------------------------------------------------------------
    //Variables
    @BindView(R.id.dotSecop)ImageView dotSecop;
    @BindView(R.id.dotSecop2)ImageView dotSecop2;

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
        dotSecop.setImageResource(R.mipmap.dot_green);
        dotSecop2.setImageResource(R.mipmap.dot_green);
    }
    //----------------------------------------------------------------------------------------------
    //
    public void Exit(View view){
        finish();
    }
}
