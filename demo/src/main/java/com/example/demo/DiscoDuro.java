package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class DiscoDuro {
    @JsonProperty("TipoDD")
    public String TipoDD;
    @JsonProperty("Capacidad")
    public String Capacidad;

    public DiscoDuro() {
    }

    public DiscoDuro(String tipoDD, String capacidad) {
        TipoDD = tipoDD;
        Capacidad = capacidad;
    }

    public String getTipoDD() {
        return TipoDD;
    }

    public void setTipoDD(String tipoDD) {
        TipoDD = tipoDD;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String capacidad) {
        Capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "TipoDD='" + TipoDD + '\'' +
                ", Capacidad='" + Capacidad + '\'' +
                '}';
    }
}
