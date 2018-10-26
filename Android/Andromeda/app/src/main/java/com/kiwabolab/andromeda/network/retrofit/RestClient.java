package com.kiwabolab.andromeda.network.retrofit;

import com.kiwabolab.andromeda.modelo.Contrato;
import com.kiwabolab.andromeda.modelo.Procuraduria;
import com.kiwabolab.andromeda.modelo.ProveedorSecop;
import com.kiwabolab.andromeda.modelo.Rues;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Diego Fernando 25/10/2018.
 */
public interface RestClient {
    //----------------------------------------------------------------------------------------------
    //RUES NIT
    @GET("rues_nit/{id}")
    Call<Rues> getRues(@Path("id") String id);
    //----------------------------------------------------------------------------------------------
    //PROCURADURIA NIT
    @GET("procuraduriaNIT/{id}")
    Call<Procuraduria> getProcuraduriaNIT(@Path("id") String id);
    //----------------------------------------------------------------------------------------------
    //PROCURADURIA CED
    @GET("procuraduriaCED/{id}")
    Call<Procuraduria> getProcuraduriaCED(@Path("id") String id);
    //----------------------------------------------------------------------------------------------
    //SECOP CONTRATOS /PORTAL DATOS ABIERTOS
    @GET("9f3w-id9a.json")
    Call<List<Contrato>> getSecopContratos(@Query("docproveedor") String id);
    //----------------------------------------------------------------------------------------------
    //SECOP PROCESOS /Información de los procesos de compra/PORTAL DATOS ABIERTOS
    @GET("ParametrosOperacion/ObtenerResponsableFalla/{id}")
    Call<List<Contrato>> getResponsableFalla(@Path("id") String id);
    //----------------------------------------------------------------------------------------------
    //SECOP PROVEEDORES /Información Básica de los proveedores registrados en SECOP II/PORTAL DATOS ABIERTOS
    @GET("cui9-qx99.json")
    Call<List<ProveedorSecop>> getProveedoresSecop(@Query("NIT") String id);
    //----------------------------------------------------------------------------------------------
    //
}