package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class SO {
    @JsonProperty("NombreSO")
    public String NombreSO;
    @JsonProperty("VersionSO")
    public String VersionSO;

    public SO() {
    }

    public SO(String nombreSO, String versionSO) {
        NombreSO = nombreSO;
        VersionSO = versionSO;
    }

    public String getNombreSO() {
        return NombreSO;
    }

    public void setNombreSO(String nombreSO) {
        NombreSO = nombreSO;
    }

    public String getVersionSO() {
        return VersionSO;
    }

    public void setVersionSO(String versionSO) {
        VersionSO = versionSO;
    }

    @Override
    public String toString() {
        return "SO{" +
                "NombreSO='" + NombreSO + '\'' +
                ", VersionSO='" + VersionSO + '\'' +
                '}';
    }
}
