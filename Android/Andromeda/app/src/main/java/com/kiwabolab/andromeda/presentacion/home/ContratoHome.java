package com.kiwabolab.andromeda.presentacion.home;

import com.kiwabolab.andromeda.modelo.Procuraduria;
import com.kiwabolab.andromeda.modelo.Rues;

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



        void showLoading();
        void closeLoading();
    }
    //----------------------------------------------------------------------------------------------
    //Interactor
    interface HomeInteractor{
        void obtenerRues(String nit);
        void obtenerProcuraduria(String nit);
        void obtenerContratosSecop();
        void obtenerProcesosSecop();
        void obtenerProveedoresSecop();
    }
}