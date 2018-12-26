
package com.kiwabolab.andromeda.modelo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProcesoSecop2 implements Parcelable
{

    @SerializedName("adjudicado")
    @Expose
    private String adjudicado;
    @SerializedName("annobpin")
    @Expose
    private String annobpin;
    @SerializedName("categorias_adicionales")
    @Expose
    private String categoriasAdicionales;
    @SerializedName("ciudad_de_la_unidad_de_negocio")
    @Expose
    private String ciudadDeLaUnidadDeNegocio;
    @SerializedName("codigo_pci")
    @Expose
    private String codigoPci;
    @SerializedName("codigo_principal_de_categoria")
    @Expose
    private String codigoPrincipalDeCategoria;
    @SerializedName("codigobpin")
    @Expose
    private String codigobpin;
    @SerializedName("codigoproveedor")
    @Expose
    private String codigoproveedor;
    @SerializedName("conteo_de_respuestas_a_ofertas")
    @Expose
    private String conteoDeRespuestasAOfertas;
    @SerializedName("descripci_n_del_procedimiento")
    @Expose
    private String descripciNDelProcedimiento;
    @SerializedName("duracion")
    @Expose
    private String duracion;
    @SerializedName("entidad")
    @Expose
    private String entidad;
    @SerializedName("espostconflicto")
    @Expose
    private String espostconflicto;
    @SerializedName("estado_de_apertura_del_proceso")
    @Expose
    private String estadoDeAperturaDelProceso;
    @SerializedName("estado_del_procedimiento")
    @Expose
    private String estadoDelProcedimiento;
    @SerializedName("estadobpin")
    @Expose
    private String estadobpin;
    @SerializedName("fase")
    @Expose
    private String fase;
    @SerializedName("fecha_adjudicacion")
    @Expose
    private String fechaAdjudicacion;
    @SerializedName("fecha_de_apertura_efectiva")
    @Expose
    private String fechaDeAperturaEfectiva;
    @SerializedName("fecha_de_publicacion_del_proceso")
    @Expose
    private String fechaDePublicacionDelProceso;
    @SerializedName("fecha_de_publicacion_fase_seleccion")
    @Expose
    private String fechaDePublicacionFaseSeleccion;
    @SerializedName("fecha_de_recepcion_de_respuestas")
    @Expose
    private String fechaDeRecepcionDeRespuestas;
    @SerializedName("fecha_de_ultima_publicaci_n")
    @Expose
    private String fechaDeUltimaPublicaciN;
    @SerializedName("id_adjudicacion")
    @Expose
    private String idAdjudicacion;
    @SerializedName("id_del_portafolio")
    @Expose
    private String idDelPortafolio;
    @SerializedName("id_del_proceso")
    @Expose
    private String idDelProceso;
    @SerializedName("id_estado_del_procedimiento")
    @Expose
    private String idEstadoDelProcedimiento;
    @SerializedName("modalidad_de_contratacion")
    @Expose
    private String modalidadDeContratacion;
    @SerializedName("nit_del_proveedor_adjudicado")
    @Expose
    private String nitDelProveedorAdjudicado;
    @SerializedName("nit_entidad")
    @Expose
    private String nitEntidad;
    @SerializedName("nombre_de_la_unidad_de_negocio")
    @Expose
    private String nombreDeLaUnidadDeNegocio;
    @SerializedName("nombre_del_adjudicador")
    @Expose
    private String nombreDelAdjudicador;
    @SerializedName("nombre_del_procedimiento")
    @Expose
    private String nombreDelProcedimiento;
    @SerializedName("nombre_del_proveedor_adjudicado")
    @Expose
    private String nombreDelProveedorAdjudicado;
    @SerializedName("numero_de_lotes")
    @Expose
    private String numeroDeLotes;
    @SerializedName("precio_base")
    @Expose
    private String precioBase;
    @SerializedName("proveedores_con_invitacion_directa")
    @Expose
    private String proveedoresConInvitacionDirecta;
    @SerializedName("proveedores_invitados")
    @Expose
    private String proveedoresInvitados;
    @SerializedName("proveedores_que_manifestaron_interes")
    @Expose
    private String proveedoresQueManifestaronInteres;
    @SerializedName("proveedores_unicos_con_respuestas")
    @Expose
    private String proveedoresUnicosConRespuestas;
    @SerializedName("referencia_del_proceso")
    @Expose
    private String referenciaDelProceso;
    @SerializedName("respuestas_al_procedimiento")
    @Expose
    private String respuestasAlProcedimiento;
    @SerializedName("respuestas_externas")
    @Expose
    private String respuestasExternas;
    @SerializedName("subtipo_de_contrato")
    @Expose
    private String subtipoDeContrato;
    @SerializedName("tipo_de_contrato")
    @Expose
    private String tipoDeContrato;
    @SerializedName("unidad_de_duracion")
    @Expose
    private String unidadDeDuracion;
    @SerializedName("urlproceso")
    @Expose
    private String urlproceso;
    @SerializedName("valor_total_adjudicacion")
    @Expose
    private String valorTotalAdjudicacion;
    @SerializedName("visualizaciones_del_procedimiento")
    @Expose
    private String visualizacionesDelProcedimiento;
    public final static Creator<ProcesoSecop2> CREATOR = new Creator<ProcesoSecop2>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ProcesoSecop2 createFromParcel(Parcel in) {
            return new ProcesoSecop2(in);
        }

        public ProcesoSecop2 [] newArray(int size) {
            return (new ProcesoSecop2[size]);
        }

    }
    ;

    protected ProcesoSecop2(Parcel in) {
        this.adjudicado = ((String) in.readValue((String.class.getClassLoader())));
        this.annobpin = ((String) in.readValue((String.class.getClassLoader())));
        this.categoriasAdicionales = ((String) in.readValue((String.class.getClassLoader())));
        this.ciudadDeLaUnidadDeNegocio = ((String) in.readValue((String.class.getClassLoader())));
        this.codigoPci = ((String) in.readValue((String.class.getClassLoader())));
        this.codigoPrincipalDeCategoria = ((String) in.readValue((String.class.getClassLoader())));
        this.codigobpin = ((String) in.readValue((String.class.getClassLoader())));
        this.codigoproveedor = ((String) in.readValue((String.class.getClassLoader())));
        this.conteoDeRespuestasAOfertas = ((String) in.readValue((String.class.getClassLoader())));
        this.descripciNDelProcedimiento = ((String) in.readValue((String.class.getClassLoader())));
        this.duracion = ((String) in.readValue((String.class.getClassLoader())));
        this.entidad = ((String) in.readValue((String.class.getClassLoader())));
        this.espostconflicto = ((String) in.readValue((String.class.getClassLoader())));
        this.estadoDeAperturaDelProceso = ((String) in.readValue((String.class.getClassLoader())));
        this.estadoDelProcedimiento = ((String) in.readValue((String.class.getClassLoader())));
        this.estadobpin = ((String) in.readValue((String.class.getClassLoader())));
        this.fase = ((String) in.readValue((String.class.getClassLoader())));
        this.fechaAdjudicacion = ((String) in.readValue((String.class.getClassLoader())));
        this.fechaDeAperturaEfectiva = ((String) in.readValue((String.class.getClassLoader())));
        this.fechaDePublicacionDelProceso = ((String) in.readValue((String.class.getClassLoader())));
        this.fechaDePublicacionFaseSeleccion = ((String) in.readValue((String.class.getClassLoader())));
        this.fechaDeRecepcionDeRespuestas = ((String) in.readValue((String.class.getClassLoader())));
        this.fechaDeUltimaPublicaciN = ((String) in.readValue((String.class.getClassLoader())));
        this.idAdjudicacion = ((String) in.readValue((String.class.getClassLoader())));
        this.idDelPortafolio = ((String) in.readValue((String.class.getClassLoader())));
        this.idDelProceso = ((String) in.readValue((String.class.getClassLoader())));
        this.idEstadoDelProcedimiento = ((String) in.readValue((String.class.getClassLoader())));
        this.modalidadDeContratacion = ((String) in.readValue((String.class.getClassLoader())));
        this.nitDelProveedorAdjudicado = ((String) in.readValue((String.class.getClassLoader())));
        this.nitEntidad = ((String) in.readValue((String.class.getClassLoader())));
        this.nombreDeLaUnidadDeNegocio = ((String) in.readValue((String.class.getClassLoader())));
        this.nombreDelAdjudicador = ((String) in.readValue((String.class.getClassLoader())));
        this.nombreDelProcedimiento = ((String) in.readValue((String.class.getClassLoader())));
        this.nombreDelProveedorAdjudicado = ((String) in.readValue((String.class.getClassLoader())));
        this.numeroDeLotes = ((String) in.readValue((String.class.getClassLoader())));
        this.precioBase = ((String) in.readValue((String.class.getClassLoader())));
        this.proveedoresConInvitacionDirecta = ((String) in.readValue((String.class.getClassLoader())));
        this.proveedoresInvitados = ((String) in.readValue((String.class.getClassLoader())));
        this.proveedoresQueManifestaronInteres = ((String) in.readValue((String.class.getClassLoader())));
        this.proveedoresUnicosConRespuestas = ((String) in.readValue((String.class.getClassLoader())));
        this.referenciaDelProceso = ((String) in.readValue((String.class.getClassLoader())));
        this.respuestasAlProcedimiento = ((String) in.readValue((String.class.getClassLoader())));
        this.respuestasExternas = ((String) in.readValue((String.class.getClassLoader())));
        this.subtipoDeContrato = ((String) in.readValue((String.class.getClassLoader())));
        this.tipoDeContrato = ((String) in.readValue((String.class.getClassLoader())));
        this.unidadDeDuracion = ((String) in.readValue((String.class.getClassLoader())));
        this.urlproceso = ((String) in.readValue((String.class.getClassLoader())));
        this.valorTotalAdjudicacion = ((String) in.readValue((String.class.getClassLoader())));
        this.visualizacionesDelProcedimiento = ((String) in.readValue((String.class.getClassLoader())));
    }

    public ProcesoSecop2() {
    }

    public String getAdjudicado() {
        return adjudicado;
    }

    public void setAdjudicado(String adjudicado) {
        this.adjudicado = adjudicado;
    }

    public String getAnnobpin() {
        return annobpin;
    }

    public void setAnnobpin(String annobpin) {
        this.annobpin = annobpin;
    }

    public String getCategoriasAdicionales() {
        return categoriasAdicionales;
    }

    public void setCategoriasAdicionales(String categoriasAdicionales) {
        this.categoriasAdicionales = categoriasAdicionales;
    }

    public String getCiudadDeLaUnidadDeNegocio() {
        return ciudadDeLaUnidadDeNegocio;
    }

    public void setCiudadDeLaUnidadDeNegocio(String ciudadDeLaUnidadDeNegocio) {
        this.ciudadDeLaUnidadDeNegocio = ciudadDeLaUnidadDeNegocio;
    }

    public String getCodigoPci() {
        return codigoPci;
    }

    public void setCodigoPci(String codigoPci) {
        this.codigoPci = codigoPci;
    }

    public String getCodigoPrincipalDeCategoria() {
        return codigoPrincipalDeCategoria;
    }

    public void setCodigoPrincipalDeCategoria(String codigoPrincipalDeCategoria) {
        this.codigoPrincipalDeCategoria = codigoPrincipalDeCategoria;
    }

    public String getCodigobpin() {
        return codigobpin;
    }

    public void setCodigobpin(String codigobpin) {
        this.codigobpin = codigobpin;
    }

    public String getCodigoproveedor() {
        return codigoproveedor;
    }

    public void setCodigoproveedor(String codigoproveedor) {
        this.codigoproveedor = codigoproveedor;
    }

    public String getConteoDeRespuestasAOfertas() {
        return conteoDeRespuestasAOfertas;
    }

    public void setConteoDeRespuestasAOfertas(String conteoDeRespuestasAOfertas) {
        this.conteoDeRespuestasAOfertas = conteoDeRespuestasAOfertas;
    }

    public String getDescripciNDelProcedimiento() {
        return descripciNDelProcedimiento;
    }

    public void setDescripciNDelProcedimiento(String descripciNDelProcedimiento) {
        this.descripciNDelProcedimiento = descripciNDelProcedimiento;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getEspostconflicto() {
        return espostconflicto;
    }

    public void setEspostconflicto(String espostconflicto) {
        this.espostconflicto = espostconflicto;
    }

    public String getEstadoDeAperturaDelProceso() {
        return estadoDeAperturaDelProceso;
    }

    public void setEstadoDeAperturaDelProceso(String estadoDeAperturaDelProceso) {
        this.estadoDeAperturaDelProceso = estadoDeAperturaDelProceso;
    }

    public String getEstadoDelProcedimiento() {
        return estadoDelProcedimiento;
    }

    public void setEstadoDelProcedimiento(String estadoDelProcedimiento) {
        this.estadoDelProcedimiento = estadoDelProcedimiento;
    }

    public String getEstadobpin() {
        return estadobpin;
    }

    public void setEstadobpin(String estadobpin) {
        this.estadobpin = estadobpin;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getFechaAdjudicacion() {
        return fechaAdjudicacion;
    }

    public void setFechaAdjudicacion(String fechaAdjudicacion) {
        this.fechaAdjudicacion = fechaAdjudicacion;
    }

    public String getFechaDeAperturaEfectiva() {
        return fechaDeAperturaEfectiva;
    }

    public void setFechaDeAperturaEfectiva(String fechaDeAperturaEfectiva) {
        this.fechaDeAperturaEfectiva = fechaDeAperturaEfectiva;
    }

    public String getFechaDePublicacionDelProceso() {
        return fechaDePublicacionDelProceso;
    }

    public void setFechaDePublicacionDelProceso(String fechaDePublicacionDelProceso) {
        this.fechaDePublicacionDelProceso = fechaDePublicacionDelProceso;
    }

    public String getFechaDePublicacionFaseSeleccion() {
        return fechaDePublicacionFaseSeleccion;
    }

    public void setFechaDePublicacionFaseSeleccion(String fechaDePublicacionFaseSeleccion) {
        this.fechaDePublicacionFaseSeleccion = fechaDePublicacionFaseSeleccion;
    }

    public String getFechaDeRecepcionDeRespuestas() {
        return fechaDeRecepcionDeRespuestas;
    }

    public void setFechaDeRecepcionDeRespuestas(String fechaDeRecepcionDeRespuestas) {
        this.fechaDeRecepcionDeRespuestas = fechaDeRecepcionDeRespuestas;
    }

    public String getFechaDeUltimaPublicaciN() {
        return fechaDeUltimaPublicaciN;
    }

    public void setFechaDeUltimaPublicaciN(String fechaDeUltimaPublicaciN) {
        this.fechaDeUltimaPublicaciN = fechaDeUltimaPublicaciN;
    }

    public String getIdAdjudicacion() {
        return idAdjudicacion;
    }

    public void setIdAdjudicacion(String idAdjudicacion) {
        this.idAdjudicacion = idAdjudicacion;
    }

    public String getIdDelPortafolio() {
        return idDelPortafolio;
    }

    public void setIdDelPortafolio(String idDelPortafolio) {
        this.idDelPortafolio = idDelPortafolio;
    }

    public String getIdDelProceso() {
        return idDelProceso;
    }

    public void setIdDelProceso(String idDelProceso) {
        this.idDelProceso = idDelProceso;
    }

    public String getIdEstadoDelProcedimiento() {
        return idEstadoDelProcedimiento;
    }

    public void setIdEstadoDelProcedimiento(String idEstadoDelProcedimiento) {
        this.idEstadoDelProcedimiento = idEstadoDelProcedimiento;
    }

    public String getModalidadDeContratacion() {
        return modalidadDeContratacion;
    }

    public void setModalidadDeContratacion(String modalidadDeContratacion) {
        this.modalidadDeContratacion = modalidadDeContratacion;
    }

    public String getNitDelProveedorAdjudicado() {
        return nitDelProveedorAdjudicado;
    }

    public void setNitDelProveedorAdjudicado(String nitDelProveedorAdjudicado) {
        this.nitDelProveedorAdjudicado = nitDelProveedorAdjudicado;
    }

    public String getNitEntidad() {
        return nitEntidad;
    }

    public void setNitEntidad(String nitEntidad) {
        this.nitEntidad = nitEntidad;
    }

    public String getNombreDeLaUnidadDeNegocio() {
        return nombreDeLaUnidadDeNegocio;
    }

    public void setNombreDeLaUnidadDeNegocio(String nombreDeLaUnidadDeNegocio) {
        this.nombreDeLaUnidadDeNegocio = nombreDeLaUnidadDeNegocio;
    }

    public String getNombreDelAdjudicador() {
        return nombreDelAdjudicador;
    }

    public void setNombreDelAdjudicador(String nombreDelAdjudicador) {
        this.nombreDelAdjudicador = nombreDelAdjudicador;
    }

    public String getNombreDelProcedimiento() {
        return nombreDelProcedimiento;
    }

    public void setNombreDelProcedimiento(String nombreDelProcedimiento) {
        this.nombreDelProcedimiento = nombreDelProcedimiento;
    }

    public String getNombreDelProveedorAdjudicado() {
        return nombreDelProveedorAdjudicado;
    }

    public void setNombreDelProveedorAdjudicado(String nombreDelProveedorAdjudicado) {
        this.nombreDelProveedorAdjudicado = nombreDelProveedorAdjudicado;
    }

    public String getNumeroDeLotes() {
        return numeroDeLotes;
    }

    public void setNumeroDeLotes(String numeroDeLotes) {
        this.numeroDeLotes = numeroDeLotes;
    }

    public String getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(String precioBase) {
        this.precioBase = precioBase;
    }

    public String getProveedoresConInvitacionDirecta() {
        return proveedoresConInvitacionDirecta;
    }

    public void setProveedoresConInvitacionDirecta(String proveedoresConInvitacionDirecta) {
        this.proveedoresConInvitacionDirecta = proveedoresConInvitacionDirecta;
    }

    public String getProveedoresInvitados() {
        return proveedoresInvitados;
    }

    public void setProveedoresInvitados(String proveedoresInvitados) {
        this.proveedoresInvitados = proveedoresInvitados;
    }

    public String getProveedoresQueManifestaronInteres() {
        return proveedoresQueManifestaronInteres;
    }

    public void setProveedoresQueManifestaronInteres(String proveedoresQueManifestaronInteres) {
        this.proveedoresQueManifestaronInteres = proveedoresQueManifestaronInteres;
    }

    public String getProveedoresUnicosConRespuestas() {
        return proveedoresUnicosConRespuestas;
    }

    public void setProveedoresUnicosConRespuestas(String proveedoresUnicosConRespuestas) {
        this.proveedoresUnicosConRespuestas = proveedoresUnicosConRespuestas;
    }

    public String getReferenciaDelProceso() {
        return referenciaDelProceso;
    }

    public void setReferenciaDelProceso(String referenciaDelProceso) {
        this.referenciaDelProceso = referenciaDelProceso;
    }

    public String getRespuestasAlProcedimiento() {
        return respuestasAlProcedimiento;
    }

    public void setRespuestasAlProcedimiento(String respuestasAlProcedimiento) {
        this.respuestasAlProcedimiento = respuestasAlProcedimiento;
    }

    public String getRespuestasExternas() {
        return respuestasExternas;
    }

    public void setRespuestasExternas(String respuestasExternas) {
        this.respuestasExternas = respuestasExternas;
    }

    public String getSubtipoDeContrato() {
        return subtipoDeContrato;
    }

    public void setSubtipoDeContrato(String subtipoDeContrato) {
        this.subtipoDeContrato = subtipoDeContrato;
    }

    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public String getUnidadDeDuracion() {
        return unidadDeDuracion;
    }

    public void setUnidadDeDuracion(String unidadDeDuracion) {
        this.unidadDeDuracion = unidadDeDuracion;
    }

    public String getUrlproceso() {
        return urlproceso;
    }

    public void setUrlproceso(String urlproceso) {
        this.urlproceso = urlproceso;
    }

    public String getValorTotalAdjudicacion() {
        return valorTotalAdjudicacion;
    }

    public void setValorTotalAdjudicacion(String valorTotalAdjudicacion) {
        this.valorTotalAdjudicacion = valorTotalAdjudicacion;
    }

    public String getVisualizacionesDelProcedimiento() {
        return visualizacionesDelProcedimiento;
    }

    public void setVisualizacionesDelProcedimiento(String visualizacionesDelProcedimiento) {
        this.visualizacionesDelProcedimiento = visualizacionesDelProcedimiento;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(adjudicado);
        dest.writeValue(annobpin);
        dest.writeValue(categoriasAdicionales);
        dest.writeValue(ciudadDeLaUnidadDeNegocio);
        dest.writeValue(codigoPci);
        dest.writeValue(codigoPrincipalDeCategoria);
        dest.writeValue(codigobpin);
        dest.writeValue(codigoproveedor);
        dest.writeValue(conteoDeRespuestasAOfertas);
        dest.writeValue(descripciNDelProcedimiento);
        dest.writeValue(duracion);
        dest.writeValue(entidad);
        dest.writeValue(espostconflicto);
        dest.writeValue(estadoDeAperturaDelProceso);
        dest.writeValue(estadoDelProcedimiento);
        dest.writeValue(estadobpin);
        dest.writeValue(fase);
        dest.writeValue(fechaAdjudicacion);
        dest.writeValue(fechaDeAperturaEfectiva);
        dest.writeValue(fechaDePublicacionDelProceso);
        dest.writeValue(fechaDePublicacionFaseSeleccion);
        dest.writeValue(fechaDeRecepcionDeRespuestas);
        dest.writeValue(fechaDeUltimaPublicaciN);
        dest.writeValue(idAdjudicacion);
        dest.writeValue(idDelPortafolio);
        dest.writeValue(idDelProceso);
        dest.writeValue(idEstadoDelProcedimiento);
        dest.writeValue(modalidadDeContratacion);
        dest.writeValue(nitDelProveedorAdjudicado);
        dest.writeValue(nitEntidad);
        dest.writeValue(nombreDeLaUnidadDeNegocio);
        dest.writeValue(nombreDelAdjudicador);
        dest.writeValue(nombreDelProcedimiento);
        dest.writeValue(nombreDelProveedorAdjudicado);
        dest.writeValue(numeroDeLotes);
        dest.writeValue(precioBase);
        dest.writeValue(proveedoresConInvitacionDirecta);
        dest.writeValue(proveedoresInvitados);
        dest.writeValue(proveedoresQueManifestaronInteres);
        dest.writeValue(proveedoresUnicosConRespuestas);
        dest.writeValue(referenciaDelProceso);
        dest.writeValue(respuestasAlProcedimiento);
        dest.writeValue(respuestasExternas);
        dest.writeValue(subtipoDeContrato);
        dest.writeValue(tipoDeContrato);
        dest.writeValue(unidadDeDuracion);
        dest.writeValue(urlproceso);
        dest.writeValue(valorTotalAdjudicacion);
        dest.writeValue(visualizacionesDelProcedimiento);
    }

    public int describeContents() {
        return  0;
    }

}
