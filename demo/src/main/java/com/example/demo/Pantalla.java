package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Pantalla {
    @JsonProperty("Diagonal")
    public String Diagonal;
    @JsonProperty("Resolucion")
    public String Resolucion;

    public Pantalla() {
    }

    public Pantalla(String diagonal, String resolucion) {
        Diagonal = diagonal;
        Resolucion = resolucion;
    }

    public String getDiagonal() {
        return Diagonal;
    }

    public void setDiagonal(String diagonal) {
        Diagonal = diagonal;
    }

    public String getResolucion() {
        return Resolucion;
    }

    public void setResolucion(String resolucion) {
        Resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "Diagonal='" + Diagonal + '\'' +
                ", Resolucion='" + Resolucion + '\'' +
                '}';
    }
}
