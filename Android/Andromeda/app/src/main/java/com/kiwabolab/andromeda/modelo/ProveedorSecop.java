
package com.kiwabolab.andromeda.modelo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProveedorSecop implements Serializable
{

    @SerializedName("codigo_categoria_principal")
    @Expose
    private String codigoCategoriaPrincipal;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("descripcion_categoria_principal")
    @Expose
    private String descripcionCategoriaPrincipal;
    @SerializedName("espyme")
    @Expose
    private String espyme;
    @SerializedName("fecha_creacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("municipio")
    @Expose
    private String municipio;
    @SerializedName("nit")
    @Expose
    private String nit;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("pais")
    @Expose
    private String pais;
    @SerializedName("tipo_empresa")
    @Expose
    private String tipoEmpresa;
    @SerializedName("ubicacion")
    @Expose
    private String ubicacion;
    private final static long serialVersionUID = -7410247349339404637L;

    public String getCodigoCategoriaPrincipal() {
        return codigoCategoriaPrincipal;
    }

    public void setCodigoCategoriaPrincipal(String codigoCategoriaPrincipal) {
        this.codigoCategoriaPrincipal = codigoCategoriaPrincipal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDescripcionCategoriaPrincipal() {
        return descripcionCategoriaPrincipal;
    }

    public void setDescripcionCategoriaPrincipal(String descripcionCategoriaPrincipal) {
        this.descripcionCategoriaPrincipal = descripcionCategoriaPrincipal;
    }

    public String getEspyme() {
        return espyme;
    }

    public void setEspyme(String espyme) {
        this.espyme = espyme;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
