package entities;

import java.time.LocalTime;

import exceptions.CancionException;

public class Cancion {
    private String nombre;
    private LocalTime duracion;

    public Cancion(String nombre, LocalTime duracion) {
        if (nombre == null || duracion == null) {
            throw new CancionException("Cancion no creada. Datos incompletos. Todos los datos son requeridos");
        }
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

}
