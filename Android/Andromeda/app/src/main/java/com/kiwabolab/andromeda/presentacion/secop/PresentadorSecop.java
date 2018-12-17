package com.kiwabolab.andromeda.presentacion.secop;

import com.kiwabolab.andromeda.modelo.Contrato;

import java.util.List;

public class PresentadorSecop implements ContratoSecop.ContratoSecopPresentador{
    //----------------------------------------------------------------------------------------------
    //Variables
    ContratoSecop.ContratoSecopVista vista;
    ContratoSecop.ContratoSecopInteractor interactor;
    //----------------------------------------------------------------------------------------------
    //Constructor
    public PresentadorSecop(ContratoSecop.ContratoSecopVista vista) {
        this.vista = vista;
        interactor = new InteractorSecop(this);
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
    public void obtenerContratosSecop(String nit) {
        showLoading();
        interactor.obtenerContratosSecop(nit);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerContratosOk(List<Contrato> proveedorSecops) {
        vista.obtenerContratosOk(proveedorSecops);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerContratosError() {
        vista.obtenerContratosError();
    }
}