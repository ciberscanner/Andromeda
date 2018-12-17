package com.kiwabolab.andromeda.presentacion.secop;

import com.kiwabolab.andromeda.modelo.Contrato;
import com.kiwabolab.andromeda.network.retrofit.RestApiAdapter;
import com.kiwabolab.andromeda.network.retrofit.RestClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.kiwabolab.andromeda.network.Servidor.ServidorDatosAbiertos;

public class InteractorSecop implements ContratoSecop.ContratoSecopInteractor {
    //----------------------------------------------------------------------------------------------
    //variables
    ContratoSecop.ContratoSecopPresentador presentador;
    //----------------------------------------------------------------------------------------------
    //Constructor
    public InteractorSecop(ContratoSecop.ContratoSecopPresentador presentador) {
        this.presentador = presentador;
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerContratosSecop(String nit) {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        RestClient endpointsApi = restApiAdapter.EstablecerConexion(ServidorDatosAbiertos);
        Call<List<Contrato>> contactoResponseCall = endpointsApi.getSecopContratos(nit);
        contactoResponseCall.enqueue(new Callback<List<Contrato>>() {
            @Override
            public void onResponse(Call<List<Contrato>> call, Response<List<Contrato>> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        presentador.obtenerContratosOk(response.body());
                    }
                } else {
                    presentador.obtenerContratosError();
                    presentador.closeLoading();
                }
            }
            @Override
            public void onFailure(Call<List<Contrato>> call, Throwable t) {
                presentador.obtenerContratosError();
                presentador.closeLoading();
            }
        });
    }
}
