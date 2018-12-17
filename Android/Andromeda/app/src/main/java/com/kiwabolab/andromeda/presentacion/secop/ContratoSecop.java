package com.kiwabolab.andromeda.presentacion.secop;

import com.kiwabolab.andromeda.modelo.Contrato;

import java.util.List;

public interface ContratoSecop {
    //----------------------------------------------------------------------------------------------
    //vista
    interface ContratoSecopVista{
        void showLoading();
        void closeLoading();

        void obtenerContratosSecop(String nit);
        void obtenerContratosOk(List<Contrato> proveedorSecops);
        void obtenerContratosError();
    }
    //----------------------------------------------------------------------------------------------
    //presentador
    interface ContratoSecopPresentador{
        void showLoading();
        void closeLoading();

        void obtenerContratosSecop(String nit);
        void obtenerContratosOk(List<Contrato> proveedorSecops);
        void obtenerContratosError();
    }
    //----------------------------------------------------------------------------------------------
    //interactuador
    interface ContratoSecopInteractor{
        void obtenerContratosSecop(String nit);
    }
}