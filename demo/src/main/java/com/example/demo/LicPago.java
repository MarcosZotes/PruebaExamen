package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class LicPago {
    @JsonProperty("NombreSW")
    public String NombreSW;
    @JsonProperty("VersionLic")
    public String VersionLic;
    @JsonProperty("TipoLic")
    public String TipoLic;

    public LicPago() {
    }

    public LicPago(String nombreSW, String versionLic, String tipoLic) {
        NombreSW = nombreSW;
        VersionLic = versionLic;
        TipoLic = tipoLic;
    }

    public String getNombreSW() {
        return NombreSW;
    }

    public void setNombreSW(String nombreSW) {
        NombreSW = nombreSW;
    }

    public String getVersionLic() {
        return VersionLic;
    }

    public void setVersionLic(String versionLic) {
        VersionLic = versionLic;
    }

    public String getTipoLic() {
        return TipoLic;
    }

    public void setTipoLic(String tipoLic) {
        TipoLic = tipoLic;
    }

    @Override
    public String toString() {
        return "LicPago{" +
                "NombreSW='" + NombreSW + '\'' +
                ", VersionLic='" + VersionLic + '\'' +
                ", TipoLic='" + TipoLic + '\'' +
                '}';
    }
}
