package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;
import java.util.ArrayList;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Datos {

    ArrayList<usuarios> usuarios = new ArrayList<>();
    ArrayList<Equipo> Equipo = new ArrayList<>();
    ArrayList<prestamos> prestamos = new ArrayList<>();

    public Datos() {
    }

    public Datos(ArrayList<com.example.demo.usuarios> usuarios, ArrayList<com.example.demo.Equipo> equipo, ArrayList<com.example.demo.prestamos> prestamos) {
        this.usuarios = usuarios;
        Equipo = equipo;
        this.prestamos = prestamos;
    }

    public ArrayList<com.example.demo.usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<com.example.demo.usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<com.example.demo.Equipo> getEquipo() {
        return Equipo;
    }

    public void setEquipo(ArrayList<com.example.demo.Equipo> equipo) {
        Equipo = equipo;
    }

    public ArrayList<com.example.demo.prestamos> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<com.example.demo.prestamos> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "usuarios=" + usuarios +
                ", Equipo=" + Equipo +
                ", prestamos=" + prestamos +
                '}';
    }
}
