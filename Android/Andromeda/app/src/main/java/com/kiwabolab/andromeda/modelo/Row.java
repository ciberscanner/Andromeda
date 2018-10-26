
package com.kiwabolab.andromeda.modelo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row implements Serializable
{

    @SerializedName("categoria_matricula")
    @Expose
    private String categoriaMatricula;
    @SerializedName("clase_identificacion")
    @Expose
    private String claseIdentificacion;
    @SerializedName("codigo_camara")
    @Expose
    private String codigoCamara;
    @SerializedName("codigo_estado")
    @Expose
    private String codigoEstado;
    @SerializedName("identificacion")
    @Expose
    private String identificacion;
    @SerializedName("estado")
    @Expose
    private String estado;
    @SerializedName("matricula")
    @Expose
    private String matricula;
    @SerializedName("nombre_camara")
    @Expose
    private String nombreCamara;
    @SerializedName("organizacion_juridica")
    @Expose
    private String organizacionJuridica;
    @SerializedName("razon_social")
    @Expose
    private String razonSocial;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("enlaceVer")
    @Expose
    private String enlaceVer;
    private final static long serialVersionUID = -5772845084116081732L;

    public String getCategoriaMatricula() {
        return categoriaMatricula;
    }

    public void setCategoriaMatricula(String categoriaMatricula) {
        this.categoriaMatricula = categoriaMatricula;
    }

    public String getClaseIdentificacion() {
        return claseIdentificacion;
    }

    public void setClaseIdentificacion(String claseIdentificacion) {
        this.claseIdentificacion = claseIdentificacion;
    }

    public String getCodigoCamara() {
        return codigoCamara;
    }

    public void setCodigoCamara(String codigoCamara) {
        this.codigoCamara = codigoCamara;
    }

    public String getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreCamara() {
        return nombreCamara;
    }

    public void setNombreCamara(String nombreCamara) {
        this.nombreCamara = nombreCamara;
    }

    public String getOrganizacionJuridica() {
        return organizacionJuridica;
    }

    public void setOrganizacionJuridica(String organizacionJuridica) {
        this.organizacionJuridica = organizacionJuridica;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEnlaceVer() {
        return enlaceVer;
    }

    public void setEnlaceVer(String enlaceVer) {
        this.enlaceVer = enlaceVer;
    }

}
