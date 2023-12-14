package entities;

import java.time.LocalTime;

import entities.Validaciones.CancionValidaciones;
import exceptions.CancionException;

public class Cancion {
    private String nombre;
    private LocalTime duracion;

    /**
     * Para crear una canción se necesita el nombre de la canción y su duración, en caso de 
     * no tener alguno de los datos lanzara una excepción
     * @param nombre Nombre de la canción a crear. Tipo String
     * @param duracion Duración total de la canción. Tipo LocalTime (Horas, minutos, segundos).
     * Ejemplo: LocalTime tiempoCancion = LocalTime.of(0, 4, 15);
     */

    public Cancion(String nombre, LocalTime duracion) {
        boolean esValido = CancionValidaciones.crearCancionValiacion(nombre, duracion);
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
