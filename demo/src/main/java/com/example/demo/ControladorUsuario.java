package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControladorUsuario {
    public Datos NewDatos = new Datos();

    @PostMapping(path = "/Datos")
    public ResponseEntity<Datos> nuevoDatos(){
        LectorJSON Leer = new LectorJSON();

        this.NewDatos = Leer.LecturaJSON();

        return new ResponseEntity<Datos>(this.NewDatos, HttpStatus.CREATED);
    }

    @PostMapping(path = "/Datos/Equipo",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArrayList<Equipo>> nuevoEquipo(@RequestBody Equipo nuevoEquipo) {

        this.NewDatos.getEquipo().add(nuevoEquipo);

        return new ResponseEntity<ArrayList<Equipo>>(this.NewDatos.getEquipo(), HttpStatus.CREATED);
    }

    @PostMapping(path = "/Datos/usuarios",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArrayList<usuarios>> nuevoUsuario(@RequestBody usuarios nuevoUsuario) {

        this.NewDatos.getUsuarios().add(nuevoUsuario);

        return new ResponseEntity<ArrayList<usuarios>>(this.NewDatos.getUsuarios(), HttpStatus.CREATED);
    }

    @PostMapping(path = "/Datos/prestamos",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArrayList<prestamos>> nuevoPrestamo(@RequestBody prestamos nuevoPrestamos) {

        this.NewDatos.getPrestamos().add(nuevoPrestamos);

        return new ResponseEntity<ArrayList<prestamos>>(this.NewDatos.getPrestamos(), HttpStatus.CREATED);
    }

    @GetMapping("/Datos")
    public Datos GetDatos(){return this.NewDatos;}

    @GetMapping("/Datos/usuarios")
    public ArrayList<usuarios> GetUsuarios(){return this.NewDatos.getUsuarios();}

    @GetMapping("/Datos/Equipo")
    public ArrayList<Equipo> GetEquipo(){return this.NewDatos.getEquipo();}

    @GetMapping("/Datos/prestamos")
    public ArrayList<prestamos> GetPrestamos(){return this.NewDatos.getPrestamos();}

    @GetMapping("/Datos/usuarios/{usuariosId}")
    public  ResponseEntity<usuarios> GetUsuario(@PathVariable String usuariosId){

        usuarios auxDatos = new usuarios();

        for (int i = 0; i < NewDatos.getUsuarios().size(); i++) {
            if (NewDatos.getUsuarios().get(i).getUsuariosId().equals(usuariosId)) {
                auxDatos = NewDatos.getUsuarios().get(i);
                return new ResponseEntity<usuarios>(auxDatos, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/Datos/Equipo/{equipoId}")
    public  ResponseEntity<Equipo> GetEquipo(@PathVariable String equipoId){

        Equipo auxDatos = new Equipo();

        for (int i = 0; i < NewDatos.getEquipo().size(); i++) {
            if (NewDatos.getEquipo().get(i).getEquipoId().equals(equipoId)) {
                auxDatos = NewDatos.getEquipo().get(i);
                return new ResponseEntity<Equipo>(auxDatos, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/Datos/prestamos/{prestamosId}")
    public  ResponseEntity<prestamos> GetPrestamos(@PathVariable String prestamosId){

        prestamos auxDatos = new prestamos();

        for (int i = 0; i < NewDatos.getPrestamos().size(); i++) {
            if (NewDatos.getPrestamos().get(i).getPrestamosId().equals(prestamosId)) {
                auxDatos = NewDatos.getPrestamos().get(i);
                return new ResponseEntity<prestamos>(auxDatos, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/Datos/usuarios/{usuariosId}")
    public ResponseEntity<ArrayList<usuarios>> PutUsuarios(@RequestBody usuarios nuevoUsuario, @PathVariable String usuariosId){
        for (int i = 0; i < NewDatos.getUsuarios().size(); i++){
            if(NewDatos.getUsuarios().get(i).getUsuariosId().equals(usuariosId)){

                NewDatos.getUsuarios().set(i, nuevoUsuario);

                return new ResponseEntity<ArrayList<usuarios>>(this.NewDatos.getUsuarios(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/Datos/Equipo/{equipoId}")
    public ResponseEntity<ArrayList<Equipo>> PutEquipo(@RequestBody Equipo nuevoEquipo, @PathVariable String equipoId){
        for (int i = 0; i < NewDatos.getEquipo().size(); i++){
            if(NewDatos.getEquipo().get(i).getEquipoId().equals(equipoId)){

                NewDatos.getEquipo().set(i, nuevoEquipo);

                return new ResponseEntity<ArrayList<Equipo>>(this.NewDatos.getEquipo(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/Datos/prestamos/{prestamosId}")
    public ResponseEntity<ArrayList<prestamos>> PutPrestamo(@RequestBody prestamos nuevoPrestamo, @PathVariable String prestamosId){
        for (int i = 0; i < NewDatos.getPrestamos().size(); i++){
            if(NewDatos.getPrestamos().get(i).getPrestamosId().equals(prestamosId)){

                NewDatos.getPrestamos().set(i, nuevoPrestamo);

                return new ResponseEntity<ArrayList<prestamos>>(this.NewDatos.getPrestamos(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/Datos/usuarios/{usuariosId}")
    public ResponseEntity<ArrayList<usuarios>> DeleteUsuario(@PathVariable String usuariosId){
        for (int i = 0; i < NewDatos.getUsuarios().size(); i++){
            if(NewDatos.getUsuarios().get(i).getUsuariosId().equals(usuariosId)){
                NewDatos.getUsuarios().remove(i);
                return new ResponseEntity<ArrayList<usuarios>>(this.NewDatos.getUsuarios(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/Datos/Equipo/{equipoId}")
    public ResponseEntity<ArrayList<Equipo>> DeleteEquipo(@PathVariable String equipoId){
        for (int i = 0; i < NewDatos.getEquipo().size(); i++){
            if(NewDatos.getEquipo().get(i).getEquipoId().equals(equipoId)){
                NewDatos.getEquipo().remove(i);
                return new ResponseEntity<ArrayList<Equipo>>(this.NewDatos.getEquipo(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/Datos/prestamos/{prestamosId}")
    public ResponseEntity<ArrayList<prestamos>> DeletePrestamos(@PathVariable String prestamosId){
        for (int i = 0; i < NewDatos.getPrestamos().size(); i++){
            if(NewDatos.getPrestamos().get(i).getPrestamosId().equals(prestamosId)){
                NewDatos.getPrestamos().remove(i);
                return new ResponseEntity<ArrayList<prestamos>>(this.NewDatos.getPrestamos(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
