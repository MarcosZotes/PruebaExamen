package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class prestamos {
    @JsonProperty("prestamosId")
    public String prestamosId;
    @JsonProperty("usuariosId")
    public String usuariosId;
    @JsonProperty("equipoId")
    public String equipoId;
    @JsonProperty("FechaInicioPrestamo")
    public String FechaInicioPrestamo;
    @JsonProperty("FechaFinPrestamo")
    public String FechaFinPrestamo;
    @JsonProperty("FechaRealDevolucion")
    public String FechaRealDevolucion;
    @JsonProperty("Comentarios")
    public String Comentarios;

    public prestamos() {
    }

    public prestamos(String prestamosId, String usuariosId, String equipoId, String fechaInicioPrestamo, String fechaFinPrestamo, String fechaRealDevolucion, String comentarios) {
        this.prestamosId = prestamosId;
        this.usuariosId = usuariosId;
        this.equipoId = equipoId;
        FechaInicioPrestamo = fechaInicioPrestamo;
        FechaFinPrestamo = fechaFinPrestamo;
        FechaRealDevolucion = fechaRealDevolucion;
        Comentarios = comentarios;
    }

    public String getPrestamosId() {
        return prestamosId;
    }

    public void setPrestamosId(String prestamosId) {
        this.prestamosId = prestamosId;
    }

    public String getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(String usuariosId) {
        this.usuariosId = usuariosId;
    }

    public String getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(String equipoId) {
        this.equipoId = equipoId;
    }

    public String getFechaInicioPrestamo() {
        return FechaInicioPrestamo;
    }

    public void setFechaInicioPrestamo(String fechaInicioPrestamo) {
        FechaInicioPrestamo = fechaInicioPrestamo;
    }

    public String getFechaFinPrestamo() {
        return FechaFinPrestamo;
    }

    public void setFechaFinPrestamo(String fechaFinPrestamo) {
        FechaFinPrestamo = fechaFinPrestamo;
    }

    public String getFechaRealDevolucion() {
        return FechaRealDevolucion;
    }

    public void setFechaRealDevolucion(String fechaRealDevolucion) {
        FechaRealDevolucion = fechaRealDevolucion;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String comentarios) {
        Comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "prestamos{" +
                "prestamosId='" + prestamosId + '\'' +
                ", usuariosId='" + usuariosId + '\'' +
                ", equipoId='" + equipoId + '\'' +
                ", FechaInicioPrestamo='" + FechaInicioPrestamo + '\'' +
                ", FechaFinPrestamo='" + FechaFinPrestamo + '\'' +
                ", FechaRealDevolucion='" + FechaRealDevolucion + '\'' +
                ", Comentarios='" + Comentarios + '\'' +
                '}';
    }
}
