package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;


public class LectorJSON {

    public Datos LecturaJSON(){
        String json;
        Datos datos = new Datos();

        Gson gson = new Gson();

        json = "";

        try (BufferedReader br = new BufferedReader(new FileReader("PrestamosJSON.json"))){
            String linea;

            while ((linea = br.readLine()) != null){
                json+= linea;
                //System.out.println(linea);
            }

            datos = gson.fromJson(json, Datos.class);
            System.out.println("Sesion guardada con exito");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }
}
