package com.kiwabolab.andromeda.presentacion.home;

import com.kiwabolab.andromeda.modelo.Contrato;
import com.kiwabolab.andromeda.modelo.Procuraduria;
import com.kiwabolab.andromeda.modelo.ProveedorSecop;
import com.kiwabolab.andromeda.modelo.Rues;

import java.util.List;

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
    public void obtenerProcuraduria(String nit, int op) {
        interactor.obtenerProcuraduria(nit,op);
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
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProveedoresSecop(String nit) {
        interactor.obtenerProveedoresSecop(nit);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProveedoresSecopOk(List<ProveedorSecop> proveedorSecops) {
        vista.obtenerProveedoresSecopOk(proveedorSecops);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProveedoresSecopError() {
        vista.obtenerProveedoresSecopError();
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
}