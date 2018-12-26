package com.kiwabolab.andromeda.presentacion.secop;

import com.kiwabolab.andromeda.modelo.Contrato;
import com.kiwabolab.andromeda.modelo.ProcesoSecop2;

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

        void obtenerProcesosSecop2(String nit);
        void obtenerProcesosSecop2Ok(List<ProcesoSecop2> procesos);
        void obtenerProcesosSecop2Error();
    }
    //----------------------------------------------------------------------------------------------
    //presentador
    interface ContratoSecopPresentador{
        void showLoading();
        void closeLoading();

        void obtenerContratosSecop(String nit);
        void obtenerContratosOk(List<Contrato> proveedorSecops);
        void obtenerContratosError();

        void obtenerProcesosSecop2(String nit);
        void obtenerProcesosSecop2Ok(List<ProcesoSecop2> procesos);
        void obtenerProcesosSecop2Error();
    }
    //----------------------------------------------------------------------------------------------
    //interactuador
    interface ContratoSecopInteractor{
        void obtenerContratosSecop(String nit);
        void obtenerProcesosSecop2(String nit);
    }
}