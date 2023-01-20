package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class SW {
    @JsonProperty("LicLibre")
    public LicLibre LicLibre;
    @JsonProperty("LicPago")
    public LicPago LicPago;

    public SW() {
    }

    public SW(com.example.demo.LicLibre licLibre, com.example.demo.LicPago licPago) {
        LicLibre = licLibre;
        LicPago = licPago;
    }

    public com.example.demo.LicLibre getLicLibre() {
        return LicLibre;
    }

    public void setLicLibre(com.example.demo.LicLibre licLibre) {
        LicLibre = licLibre;
    }

    public com.example.demo.LicPago getLicPago() {
        return LicPago;
    }

    public void setLicPago(com.example.demo.LicPago licPago) {
        LicPago = licPago;
    }

    @Override
    public String toString() {
        return "SW{" +
                "LicLibre=" + LicLibre +
                ", LicPago=" + LicPago +
                '}';
    }
}
