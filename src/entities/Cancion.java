package entities;

import java.time.LocalTime;

public class Cancion {
    private String nombre;
    private LocalTime duracion;

    public Cancion(String nombre, LocalTime duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

}
