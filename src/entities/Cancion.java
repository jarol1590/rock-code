package entities;

import java.time.LocalTime;

import entities.Validaciones.CancionValidaciones;
import exceptions.CancionException;

public class Cancion {
    private String nombre;
    private LocalTime duracion;

    public Cancion(String nombre, LocalTime duracion) {
        boolean esValido = CancionValidaciones.crearCancionValidacion(nombre, duracion);
        if (!esValido) {
            throw new CancionException("Cancion no creada. Datos incompletos. Todos los datos son requeridos");
        }
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

}
