package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class LicLibre {
    @JsonProperty("NombreSW")
    public String NombreSW;

    public LicLibre() {
    }

    public LicLibre(String nombreSW) {
        NombreSW = nombreSW;
    }

    public String getNombreSW() {
        return NombreSW;
    }

    public void setNombreSW(String nombreSW) {
        NombreSW = nombreSW;
    }

    @Override
    public String toString() {
        return "LicLibre{" +
                "NombreSW='" + NombreSW + '\'' +
                '}';
    }
}
