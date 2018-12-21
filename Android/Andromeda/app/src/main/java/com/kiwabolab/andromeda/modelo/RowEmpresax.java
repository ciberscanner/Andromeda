
package com.kiwabolab.andromeda.modelo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RowEmpresax implements Parcelable
{

    @SerializedName("tipoID")
    @Expose
    private String tipoID;
    @SerializedName("nit")
    @Expose
    private String nit;
    @SerializedName("razSol")
    @Expose
    private String razSol;
    @SerializedName("desc_camara")
    @Expose
    private String descCamara;
    @SerializedName("desc_categoria_matricula")
    @Expose
    private String descCategoriaMatricula;
    @SerializedName("detalleRM")
    @Expose
    private String detalleRM;
    @SerializedName("detalleRUP")
    @Expose
    private String detalleRUP;
    @SerializedName("detalleESAL")
    @Expose
    private String detalleESAL;
    @SerializedName("detalleRNT")
    @Expose
    private String detalleRNT;
    public final static Creator<RowEmpresax> CREATOR = new Creator<RowEmpresax>() {


        @SuppressWarnings({
            "unchecked"
        })
        public RowEmpresax createFromParcel(Parcel in) {
            return new RowEmpresax(in);
        }

        public RowEmpresax[] newArray(int size) {
            return (new RowEmpresax[size]);
        }

    }
    ;

    protected RowEmpresax(Parcel in) {
        this.tipoID = ((String) in.readValue((String.class.getClassLoader())));
        this.nit = ((String) in.readValue((String.class.getClassLoader())));
        this.razSol = ((String) in.readValue((String.class.getClassLoader())));
        this.descCamara = ((String) in.readValue((String.class.getClassLoader())));
        this.descCategoriaMatricula = ((String) in.readValue((String.class.getClassLoader())));
        this.detalleRM = ((String) in.readValue((String.class.getClassLoader())));
        this.detalleRUP = ((String) in.readValue((String.class.getClassLoader())));
        this.detalleESAL = ((String) in.readValue((String.class.getClassLoader())));
        this.detalleRNT = ((String) in.readValue((String.class.getClassLoader())));
    }

    public RowEmpresax() {
    }

    public String getTipoID() {
        return tipoID;
    }

    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazSol() {
        return razSol;
    }

    public void setRazSol(String razSol) {
        this.razSol = razSol;
    }

    public String getDescCamara() {
        return descCamara;
    }

    public void setDescCamara(String descCamara) {
        this.descCamara = descCamara;
    }

    public String getDescCategoriaMatricula() {
        return descCategoriaMatricula;
    }

    public void setDescCategoriaMatricula(String descCategoriaMatricula) {
        this.descCategoriaMatricula = descCategoriaMatricula;
    }

    public String getDetalleRM() {
        return detalleRM;
    }

    public void setDetalleRM(String detalleRM) {
        this.detalleRM = detalleRM;
    }

    public String getDetalleRUP() {
        return detalleRUP;
    }

    public void setDetalleRUP(String detalleRUP) {
        this.detalleRUP = detalleRUP;
    }

    public String getDetalleESAL() {
        return detalleESAL;
    }

    public void setDetalleESAL(String detalleESAL) {
        this.detalleESAL = detalleESAL;
    }

    public String getDetalleRNT() {
        return detalleRNT;
    }

    public void setDetalleRNT(String detalleRNT) {
        this.detalleRNT = detalleRNT;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(tipoID);
        dest.writeValue(nit);
        dest.writeValue(razSol);
        dest.writeValue(descCamara);
        dest.writeValue(descCategoriaMatricula);
        dest.writeValue(detalleRM);
        dest.writeValue(detalleRUP);
        dest.writeValue(detalleESAL);
        dest.writeValue(detalleRNT);
    }

    public int describeContents() {
        return  0;
    }

}
