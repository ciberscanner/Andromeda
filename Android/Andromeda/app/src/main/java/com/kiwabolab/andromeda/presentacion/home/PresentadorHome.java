package com.kiwabolab.andromeda.presentacion.home;

import com.kiwabolab.andromeda.modelo.Procuraduria;
import com.kiwabolab.andromeda.modelo.Rues;

public class PresentadorHome implements ContratoHome.HomePresentador{
    //----------------------------------------------------------------------------------------------
    //Variables
    ContratoHome.HomeVista vista;
    ContratoHome.HomeInteractor interactor;
    //----------------------------------------------------------------------------------------------
    //Constructor
    public PresentadorHome(ContratoHome.HomeVista vista) {
        this.vista = vista;
        this.interactor = new InteractorHome(this);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerRues(String nit) {
        showLoading();
        interactor.obtenerRues(nit);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerRuesOk(Rues rues) {
        vista.obtenerRuesOk(rues);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerRuesError() {
        vista.obtenerRuesError();
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcuraduria(String nit) {
        interactor.obtenerProcuraduria(nit);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcuraduriaOk(Procuraduria procuraduria) {
        vista.obtenerProcuraduriaOk(procuraduria);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcuraduriaError() {
        vista.obtenerProcuraduriaError();
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void showLoading() {
        vista.showLoading();
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void closeLoading() {
        vista.closeLoading();
    }
}