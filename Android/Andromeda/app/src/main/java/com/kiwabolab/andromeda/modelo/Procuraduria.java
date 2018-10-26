
package com.kiwabolab.andromeda.modelo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Procuraduria implements Serializable
{

    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("antecedente")
    @Expose
    private String antecedente;
    private final static long serialVersionUID = -7965734752528267609L;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAntecedente() {
        return antecedente;
    }

    public void setAntecedente(String antecedente) {
        this.antecedente = antecedente;
    }

}
