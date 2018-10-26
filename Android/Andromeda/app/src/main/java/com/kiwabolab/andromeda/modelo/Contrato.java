
package com.kiwabolab.andromeda.modelo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contrato implements Serializable
{

    @SerializedName("codigo_de_categoria_principal")
    @Expose
    private String codigoDeCategoriaPrincipal;
    @SerializedName("descripci_n_del_proceso")
    @Expose
    private String descripciNDelProceso;
    @SerializedName("docproveedor")
    @Expose
    private String docproveedor;
    @SerializedName("es_grupo")
    @Expose
    private String esGrupo;
    @SerializedName("espostconflicto")
    @Expose
    private String espostconflicto;
    @SerializedName("estado_bpin")
    @Expose
    private String estadoBpin;
    @SerializedName("estado_contrato")
    @Expose
    private String estadoContrato;
    @SerializedName("fecha_de_fin_de_ejecucion")
    @Expose
    private String fechaDeFinDeEjecucion;
    @SerializedName("fecha_de_fin_del_contrato")
    @Expose
    private String fechaDeFinDelContrato;
    @SerializedName("fecha_de_firma")
    @Expose
    private String fechaDeFirma;
    @SerializedName("fecha_de_inicio_de_ejecucion")
    @Expose
    private String fechaDeInicioDeEjecucion;
    @SerializedName("fecha_de_inicio_del_contrato")
    @Expose
    private String fechaDeInicioDelContrato;
    @SerializedName("habilita_pago_adelantado")
    @Expose
    private String habilitaPagoAdelantado;
    @SerializedName("idcontrato")
    @Expose
    private String idcontrato;
    @SerializedName("liquidacion")
    @Expose
    private String liquidacion;
    @SerializedName("nit_entidad")
    @Expose
    private String nitEntidad;
    @SerializedName("nombre_entidad")
    @Expose
    private String nombreEntidad;
    @SerializedName("obligaciones_ambientales")
    @Expose
    private String obligacionesAmbientales;
    @SerializedName("obligaciones_postconsumo")
    @Expose
    private String obligacionesPostconsumo;
    @SerializedName("proceso_de_compra")
    @Expose
    private String procesoDeCompra;
    @SerializedName("proveedor_adjudicado")
    @Expose
    private String proveedorAdjudicado;
    @SerializedName("referencia_del_contrato")
    @Expose
    private String referenciaDelContrato;
    @SerializedName("reversion")
    @Expose
    private String reversion;
    @SerializedName("tipo_de_contrato")
    @Expose
    private String tipoDeContrato;
    @SerializedName("tipo_de_proceso")
    @Expose
    private String tipoDeProceso;
    @SerializedName("tipodocproveedor")
    @Expose
    private String tipodocproveedor;
    @SerializedName("valor_amortizado")
    @Expose
    private String valorAmortizado;
    @SerializedName("valor_de_pago_adelantado")
    @Expose
    private String valorDePagoAdelantado;
    @SerializedName("valor_del_contrato")
    @Expose
    private String valorDelContrato;
    @SerializedName("valor_facturado")
    @Expose
    private String valorFacturado;
    @SerializedName("valor_pagado")
    @Expose
    private String valorPagado;
    @SerializedName("valor_pendiente_de_amortizacion")
    @Expose
    private String valorPendienteDeAmortizacion;
    @SerializedName("valor_pendiente_de_ejecucion")
    @Expose
    private String valorPendienteDeEjecucion;
    @SerializedName("valor_pendiente_de_pago")
    @Expose
    private String valorPendienteDePago;
    @SerializedName("condiciones_de_entrega")
    @Expose
    private String condicionesDeEntrega;
    private final static long serialVersionUID = 649447752357564759L;

    public String getCodigoDeCategoriaPrincipal() {
        return codigoDeCategoriaPrincipal;
    }

    public void setCodigoDeCategoriaPrincipal(String codigoDeCategoriaPrincipal) {
        this.codigoDeCategoriaPrincipal = codigoDeCategoriaPrincipal;
    }

    public String getDescripciNDelProceso() {
        return descripciNDelProceso;
    }

    public void setDescripciNDelProceso(String descripciNDelProceso) {
        this.descripciNDelProceso = descripciNDelProceso;
    }

    public String getDocproveedor() {
        return docproveedor;
    }

    public void setDocproveedor(String docproveedor) {
        this.docproveedor = docproveedor;
    }

    public String getEsGrupo() {
        return esGrupo;
    }

    public void setEsGrupo(String esGrupo) {
        this.esGrupo = esGrupo;
    }

    public String getEspostconflicto() {
        return espostconflicto;
    }

    public void setEspostconflicto(String espostconflicto) {
        this.espostconflicto = espostconflicto;
    }

    public String getEstadoBpin() {
        return estadoBpin;
    }

    public void setEstadoBpin(String estadoBpin) {
        this.estadoBpin = estadoBpin;
    }

    public String getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(String estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    public String getFechaDeFinDeEjecucion() {
        return fechaDeFinDeEjecucion;
    }

    public void setFechaDeFinDeEjecucion(String fechaDeFinDeEjecucion) {
        this.fechaDeFinDeEjecucion = fechaDeFinDeEjecucion;
    }

    public String getFechaDeFinDelContrato() {
        return fechaDeFinDelContrato;
    }

    public void setFechaDeFinDelContrato(String fechaDeFinDelContrato) {
        this.fechaDeFinDelContrato = fechaDeFinDelContrato;
    }

    public String getFechaDeFirma() {
        return fechaDeFirma;
    }

    public void setFechaDeFirma(String fechaDeFirma) {
        this.fechaDeFirma = fechaDeFirma;
    }

    public String getFechaDeInicioDeEjecucion() {
        return fechaDeInicioDeEjecucion;
    }

    public void setFechaDeInicioDeEjecucion(String fechaDeInicioDeEjecucion) {
        this.fechaDeInicioDeEjecucion = fechaDeInicioDeEjecucion;
    }

    public String getFechaDeInicioDelContrato() {
        return fechaDeInicioDelContrato;
    }

    public void setFechaDeInicioDelContrato(String fechaDeInicioDelContrato) {
        this.fechaDeInicioDelContrato = fechaDeInicioDelContrato;
    }

    public String getHabilitaPagoAdelantado() {
        return habilitaPagoAdelantado;
    }

    public void setHabilitaPagoAdelantado(String habilitaPagoAdelantado) {
        this.habilitaPagoAdelantado = habilitaPagoAdelantado;
    }

    public String getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(String idcontrato) {
        this.idcontrato = idcontrato;
    }

    public String getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(String liquidacion) {
        this.liquidacion = liquidacion;
    }

    public String getNitEntidad() {
        return nitEntidad;
    }

    public void setNitEntidad(String nitEntidad) {
        this.nitEntidad = nitEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getObligacionesAmbientales() {
        return obligacionesAmbientales;
    }

    public void setObligacionesAmbientales(String obligacionesAmbientales) {
        this.obligacionesAmbientales = obligacionesAmbientales;
    }

    public String getObligacionesPostconsumo() {
        return obligacionesPostconsumo;
    }

    public void setObligacionesPostconsumo(String obligacionesPostconsumo) {
        this.obligacionesPostconsumo = obligacionesPostconsumo;
    }

    public String getProcesoDeCompra() {
        return procesoDeCompra;
    }

    public void setProcesoDeCompra(String procesoDeCompra) {
        this.procesoDeCompra = procesoDeCompra;
    }

    public String getProveedorAdjudicado() {
        return proveedorAdjudicado;
    }

    public void setProveedorAdjudicado(String proveedorAdjudicado) {
        this.proveedorAdjudicado = proveedorAdjudicado;
    }

    public String getReferenciaDelContrato() {
        return referenciaDelContrato;
    }

    public void setReferenciaDelContrato(String referenciaDelContrato) {
        this.referenciaDelContrato = referenciaDelContrato;
    }

    public String getReversion() {
        return reversion;
    }

    public void setReversion(String reversion) {
        this.reversion = reversion;
    }

    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public String getTipoDeProceso() {
        return tipoDeProceso;
    }

    public void setTipoDeProceso(String tipoDeProceso) {
        this.tipoDeProceso = tipoDeProceso;
    }

    public String getTipodocproveedor() {
        return tipodocproveedor;
    }

    public void setTipodocproveedor(String tipodocproveedor) {
        this.tipodocproveedor = tipodocproveedor;
    }

    public String getValorAmortizado() {
        return valorAmortizado;
    }

    public void setValorAmortizado(String valorAmortizado) {
        this.valorAmortizado = valorAmortizado;
    }

    public String getValorDePagoAdelantado() {
        return valorDePagoAdelantado;
    }

    public void setValorDePagoAdelantado(String valorDePagoAdelantado) {
        this.valorDePagoAdelantado = valorDePagoAdelantado;
    }

    public String getValorDelContrato() {
        return valorDelContrato;
    }

    public void setValorDelContrato(String valorDelContrato) {
        this.valorDelContrato = valorDelContrato;
    }

    public String getValorFacturado() {
        return valorFacturado;
    }

    public void setValorFacturado(String valorFacturado) {
        this.valorFacturado = valorFacturado;
    }

    public String getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(String valorPagado) {
        this.valorPagado = valorPagado;
    }

    public String getValorPendienteDeAmortizacion() {
        return valorPendienteDeAmortizacion;
    }

    public void setValorPendienteDeAmortizacion(String valorPendienteDeAmortizacion) {
        this.valorPendienteDeAmortizacion = valorPendienteDeAmortizacion;
    }

    public String getValorPendienteDeEjecucion() {
        return valorPendienteDeEjecucion;
    }

    public void setValorPendienteDeEjecucion(String valorPendienteDeEjecucion) {
        this.valorPendienteDeEjecucion = valorPendienteDeEjecucion;
    }

    public String getValorPendienteDePago() {
        return valorPendienteDePago;
    }

    public void setValorPendienteDePago(String valorPendienteDePago) {
        this.valorPendienteDePago = valorPendienteDePago;
    }

    public String getCondicionesDeEntrega() {
        return condicionesDeEntrega;
    }

    public void setCondicionesDeEntrega(String condicionesDeEntrega) {
        this.condicionesDeEntrega = condicionesDeEntrega;
    }

}
