package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class usuarios {
    @JsonProperty("usuariosId")
    public String usuariosId;
    @JsonProperty("Nombre")
    public String Nombre;
    @JsonProperty("Departamento")
    public String Departamento;
    @JsonProperty("Telefono")
    public String Telefono;
    @JsonProperty("Email")
    public String Email;
    @JsonProperty("Ubicacion")
    public String Ubicacion;

    public usuarios() {
    }

    public usuarios(String usuariosId, String nombre, String departamento, String telefono, String email, String ubicacion) {
        this.usuariosId = usuariosId;
        Nombre = nombre;
        Departamento = departamento;
        Telefono = telefono;
        Email = email;
        Ubicacion = ubicacion;
    }

    public String getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(String usuariosId) {
        this.usuariosId = usuariosId;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "usuarios{" +
                "usuariosId='" + usuariosId + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Departamento='" + Departamento + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", Email='" + Email + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                '}';
    }
}
