package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Equipo {
    @JsonProperty("equipoId")
    public String equipoId;
    @JsonProperty("Tipo")
    public String Tipo;
    @JsonProperty("Marca")
    public String Marca;
    @JsonProperty("Uso")
    public String Uso;
    @JsonProperty("SO")
    public SO SO;
    @JsonProperty("HW")
    public HW HW;
    @JsonProperty("SW")
    public SW SW;

    public Equipo() {
    }

    public Equipo(String equipoId, String tipo, String marca, String uso, com.example.demo.SO SO, com.example.demo.HW HW, com.example.demo.SW SW) {
        this.equipoId = equipoId;
        Tipo = tipo;
        Marca = marca;
        Uso = uso;
        this.SO = SO;
        this.HW = HW;
        this.SW = SW;
    }

    public String getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(String equipoId) {
        this.equipoId = equipoId;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getUso() {
        return Uso;
    }

    public void setUso(String uso) {
        Uso = uso;
    }

    public com.example.demo.SO getSO() {
        return SO;
    }

    public void setSO(com.example.demo.SO SO) {
        this.SO = SO;
    }

    public com.example.demo.HW getHW() {
        return HW;
    }

    public void setHW(com.example.demo.HW HW) {
        this.HW = HW;
    }

    public com.example.demo.SW getSW() {
        return SW;
    }

    public void setSW(com.example.demo.SW SW) {
        this.SW = SW;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "equipoId='" + equipoId + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Uso='" + Uso + '\'' +
                ", SO=" + SO +
                ", HW=" + HW +
                ", SW=" + SW +
                '}';
    }
}
