package com.kiwabolab.andromeda.presentacion.home;

import android.util.Log;

import com.kiwabolab.andromeda.modelo.Procuraduria;
import com.kiwabolab.andromeda.modelo.Rues;
import com.kiwabolab.andromeda.network.retrofit.RestApiAdapter;
import com.kiwabolab.andromeda.network.retrofit.RestClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.kiwabolab.andromeda.network.Servidor.ServidorAndromeda;

public class InteractorHome implements ContratoHome.HomeInteractor {
    //----------------------------------------------------------------------------------------------
    //Variables
    private final ContratoHome.HomePresentador presentador;
    //----------------------------------------------------------------------------------------------
    //Constructor
    public InteractorHome(ContratoHome.HomePresentador presentador) {
        this.presentador = presentador;
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerRues(String nit) {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        RestClient endpointsApi = restApiAdapter.EstablecerConexion(ServidorAndromeda);
        Call<Rues> contactoResponseCall = endpointsApi.getRues(nit);
        contactoResponseCall.enqueue(new Callback<Rues>() {
            @Override
            public void onResponse(Call<Rues> call, Response<Rues> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        presentador.obtenerRuesOk(response.body());
                    }
                } else {
                    presentador.obtenerRuesError();
                    Log.v("ERROR","NULO");
                }
            }
            @Override
            public void onFailure(Call<Rues> call, Throwable t) {
                presentador.obtenerRuesError();
                Log.v("ERROR","PROBLEMA");
            }
        });
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcuraduria(String nit) {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        RestClient endpointsApi = restApiAdapter.EstablecerConexion(ServidorAndromeda);
        Call<Procuraduria> contactoResponseCall = endpointsApi.getProcuraduriaNIT(nit);
        contactoResponseCall.enqueue(new Callback<Procuraduria>() {
            @Override
            public void onResponse(Call<Procuraduria> call, Response<Procuraduria> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        presentador.obtenerProcuraduriaOk(response.body());
                    }
                } else {
                    presentador.obtenerProcuraduriaError();
                }
            }
            @Override
            public void onFailure(Call<Procuraduria> call, Throwable t) {
                presentador.obtenerProcuraduriaError();
            }
        });
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerContratosSecop() {

    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcesosSecop() {

    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProveedoresSecop() {

    }
}
