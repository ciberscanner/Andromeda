
package com.kiwabolab.andromeda.modelo;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rues implements Serializable
{

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("codigo_error")
    @Expose
    private String codigoError;
    @SerializedName("mensaje_error")
    @Expose
    private String mensajeError;
    @SerializedName("records")
    @Expose
    private Integer records;
    @SerializedName("rows")
    @Expose
    private List<RowEmpresa> rowEmpresas = null;
    private final static long serialVersionUID = -1403178247186374322L;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public Integer getRecords() {
        return records;
    }

    public void setRecords(Integer records) {
        this.records = records;
    }

    public List<RowEmpresa> getRowEmpresas() {
        return rowEmpresas;
    }

    public void setRowEmpresas(List<RowEmpresa> rowEmpresas) {
        this.rowEmpresas = rowEmpresas;
    }

}
