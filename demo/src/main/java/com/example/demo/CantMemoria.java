package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class CantMemoria {
    @JsonProperty("AtribVel")
    public String AtribVel;

    public CantMemoria() {
    }

    public CantMemoria(String atribVel) {
        AtribVel = atribVel;
    }

    public String getAtribVel() {
        return AtribVel;
    }

    public void setAtribVel(String atribVel) {
        AtribVel = atribVel;
    }

    @Override
    public String toString() {
        return "CantMemoria{" +
                "AtribVel='" + AtribVel + '\'' +
                '}';
    }
}
