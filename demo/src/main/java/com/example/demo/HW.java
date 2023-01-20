package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class HW {
    @JsonProperty("Procesador")
    public String Procesador;
    @JsonProperty("CantMemoria")
    public CantMemoria CantMemoria;
    @JsonProperty("DiscoDuro")
    public DiscoDuro DiscoDuro;
    @JsonProperty("Pantalla")
    public Pantalla Pantalla;

    public HW() {
    }

    public HW(String procesador, com.example.demo.CantMemoria cantMemoria, com.example.demo.DiscoDuro discoDuro, com.example.demo.Pantalla pantalla) {
        Procesador = procesador;
        CantMemoria = cantMemoria;
        DiscoDuro = discoDuro;
        Pantalla = pantalla;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public com.example.demo.CantMemoria getCantMemoria() {
        return CantMemoria;
    }

    public void setCantMemoria(com.example.demo.CantMemoria cantMemoria) {
        CantMemoria = cantMemoria;
    }

    public com.example.demo.DiscoDuro getDiscoDuro() {
        return DiscoDuro;
    }

    public void setDiscoDuro(com.example.demo.DiscoDuro discoDuro) {
        DiscoDuro = discoDuro;
    }

    public com.example.demo.Pantalla getPantalla() {
        return Pantalla;
    }

    public void setPantalla(com.example.demo.Pantalla pantalla) {
        Pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "HW{" +
                "Procesador='" + Procesador + '\'' +
                ", CantMemoria=" + CantMemoria +
                ", DiscoDuro=" + DiscoDuro +
                ", Pantalla=" + Pantalla +
                '}';
    }
}
