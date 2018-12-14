package com.kiwabolab.andromeda.presentacion.home;

import com.kiwabolab.andromeda.modelo.Contrato;
import com.kiwabolab.andromeda.modelo.Procuraduria;
import com.kiwabolab.andromeda.modelo.ProveedorSecop;
import com.kiwabolab.andromeda.modelo.Rues;

import java.util.List;

public interface ContratoHome {
    //----------------------------------------------------------------------------------------------
    //Vista
    interface HomeVista{
        void obtenerRues(String nit);
        void obtenerRuesOk(Rues rues);
        void obtenerRuesError();

        void obtenerProcuraduria(String nit);
        void obtenerProcuraduriaOk(Procuraduria procuraduria);
        void obtenerProcuraduriaError();

        void obtenerProveedoresSecop(String nit);
        void obtenerProveedoresSecopOk(List<ProveedorSecop> proveedorSecops);
        void obtenerProveedoresSecopError();

        void obtenerContratosSecop(String nit);
        void obtenerContratosOk(List<Contrato> proveedorSecops);
        void obtenerContratosError();

        void showLoading();
        void closeLoading();
    }
    //----------------------------------------------------------------------------------------------
    //Presentador
    interface HomePresentador{
        void obtenerRues(String nit);
        void obtenerRuesOk(Rues rues);
        void obtenerRuesError();

        void obtenerProcuraduria(String nit);
        void obtenerProcuraduriaOk(Procuraduria procuraduria);
        void obtenerProcuraduriaError();

        void obtenerProveedoresSecop(String nit);
        void obtenerProveedoresSecopOk(List<ProveedorSecop> proveedorSecops);
        void obtenerProveedoresSecopError();

        void obtenerContratosSecop(String nit);
        void obtenerContratosOk(List<Contrato> proveedorSecops);
        void obtenerContratosError();


        void showLoading();
        void closeLoading();
    }
    //----------------------------------------------------------------------------------------------
    //Interactor
    interface HomeInteractor{
        void obtenerRues(String nit);
        void obtenerProcuraduria(String nit);
        void obtenerContratosSecop(String nit);
        void obtenerProcesosSecop();
        void obtenerProveedoresSecop(String nit);
    }
}