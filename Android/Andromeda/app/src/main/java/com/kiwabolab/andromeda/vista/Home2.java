package com.kiwabolab.andromeda.vista;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;

import com.kiwabolab.andromeda.R;
import com.kiwabolab.andromeda.modelo.Contrato;
import com.kiwabolab.andromeda.modelo.Procuraduria;
import com.kiwabolab.andromeda.modelo.ProveedorSecop;
import com.kiwabolab.andromeda.modelo.Rues;
import com.kiwabolab.andromeda.presentacion.home.ContratoHome;
import com.kiwabolab.andromeda.presentacion.home.PresentadorHome;
import com.valdesekamdem.library.mdtoast.MDToast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Home2 extends Activity implements ContratoHome.HomeVista{
    //----------------------------------------------------------------------------------------------
    //Variables
    @BindView(R.id.txtnumero)EditText numero;
    @BindView(R.id.spinner)Spinner spinner;
    @BindView(R.id.progressBar)ProgressBar progressBar;

    private PresentadorHome presentadorHome;
    private String tipodocumento ="0";

    private Rues rues;
    private Procuraduria procuraduria;
    private List<ProveedorSecop> proveedoresSecop;

    private boolean okRues = false;
    private boolean okProcuraduria = false;
    private boolean okProveedoresSecop = false;
    //----------------------------------------------------------------------------------------------
    //Constructor
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this ,R.color.colorPrimaryDark));
        }
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        inicializarValores();
    }
    //----------------------------------------------------------------------------------------------
    //
    private void inicializarValores(){
        presentadorHome = new PresentadorHome(this);
        String opciones[] = {"NIT","CÉDULA"};
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, opciones);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinner.setAdapter(spinnerArrayAdapter);

        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                        switch (pos){
                            case 0:
                                tipodocumento=""+pos;
                                break;
                            case 1:
                                tipodocumento=""+pos;
                                break;
                        }
                    }
                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });
    }
    //----------------------------------------------------------------------------------------------
    //
    public void obtenerRues(View view){
        if(numero.getText().toString().isEmpty()){
            numero.setError("Este campo es necesario");
            return;
        }if(tipodocumento.isEmpty()){
            MDToast mdToast = MDToast.makeText(getApplicationContext(), "Debe seleccionar un tipo de documento", MDToast.LENGTH_LONG, MDToast.TYPE_WARNING);
            mdToast.show();
        }
        else {
            obtenerRues(numero.getText().toString());
            obtenerProcuraduria(numero.getText().toString());
            obtenerProveedoresSecop(numero.getText().toString());
            new AsyncTaskRunner().execute("1");
        }
    }
    //----------------------------------------------------------------------------------------------
    //
    private void gotoDetalle(){
        Intent intent = new Intent(this, Analisis.class);
        intent.putExtra("rues",rues);
        intent.putExtra("procuraduria", procuraduria);
        if(proveedoresSecop == null || proveedoresSecop.isEmpty()){
            intent.putExtra("proveedorsecop2","null");
        }else{
            intent.putExtra("proveedorsecop2",proveedoresSecop.get(0));
        }

        startActivity(intent);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerRues(String nit) {
        presentadorHome.obtenerRues(nit);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerRuesOk(Rues rues) {
        this.rues = rues;
        this.okRues = true;
        MDToast mdToast = MDToast.makeText(getApplicationContext(), "RUES", MDToast.LENGTH_SHORT, MDToast.TYPE_SUCCESS);
        mdToast.show();
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerRuesError() {
        this.okRues = true;
        MDToast mdToast = MDToast.makeText(getApplicationContext(), "Error RUES", MDToast.LENGTH_LONG, MDToast.TYPE_ERROR);
        mdToast.show();
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcuraduria(String nit) {
        presentadorHome.obtenerProcuraduria(nit);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcuraduriaOk(Procuraduria procuraduria) {
        this.procuraduria=procuraduria;
        this.okProcuraduria = true;
        MDToast mdToast = MDToast.makeText(getApplicationContext(), "PROCURADURÍA", MDToast.LENGTH_SHORT, MDToast.TYPE_SUCCESS);
        mdToast.show();
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcuraduriaError() {
        this.okProcuraduria = true;
        this.procuraduria = null;
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
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //----------------------------------------------------------------------------------------------
    //

    @Override
    public void obtenerContratosSecop(String nit) {

    }

    @Override
    public void obtenerContratosOk(List<Contrato> proveedorSecops) {

    }

    @Override
    public void obtenerContratosError() {

    }

    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProveedoresSecop(String nit) {
        presentadorHome.obtenerProveedoresSecop(nit);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProveedoresSecopOk(List<ProveedorSecop> proveedoresSecop) {
        MDToast mdToast = MDToast.makeText(getApplicationContext(), "PROVEEDORSECOP", MDToast.LENGTH_SHORT, MDToast.TYPE_SUCCESS);
        mdToast.show();
        okProveedoresSecop=true;
        this.proveedoresSecop = proveedoresSecop;
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProveedoresSecopError() {
        okProveedoresSecop=true;
        MDToast mdToast = MDToast.makeText(getApplicationContext(), "Atención! No se encontro registros", MDToast.LENGTH_LONG, MDToast.TYPE_INFO);
        mdToast.show();
    }
    //----------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------
    //
    private class AsyncTaskRunner extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... params) {
            int time = 1000;
            while (!okRues || !okProcuraduria|| !okProveedoresSecop){
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return "ok";
        }
        @Override
        protected void onPostExecute(String result) {
            closeLoading();
            okRues=false;
            okProcuraduria=false;
            okProveedoresSecop=false;
            gotoDetalle();
        }
    }
}