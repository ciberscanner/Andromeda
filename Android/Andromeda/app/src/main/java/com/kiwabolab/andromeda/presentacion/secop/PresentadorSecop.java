package com.kiwabolab.andromeda.presentacion.secop;

import com.kiwabolab.andromeda.modelo.Contrato;
import com.kiwabolab.andromeda.modelo.ProcesoSecop2;

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
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcesosSecop2(String nit) {
        interactor.obtenerProcesosSecop2(nit);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcesosSecop2Ok(List<ProcesoSecop2> procesos) {
        vista.obtenerProcesosSecop2Ok(procesos);
    }
    //----------------------------------------------------------------------------------------------
    //
    @Override
    public void obtenerProcesosSecop2Error() {
        vista.obtenerProcesosSecop2Error();
    }
}