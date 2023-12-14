package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Validaciones.AlbumValidaciones;
import exceptions.AlbumException;

public class Album {
    private String nombre;
    private Date fecha;
    private List<Cancion> cancion;

    public Album(String nombre, Date fecha) {
        boolean esValido = AlbumValidaciones.crearAlbumValidacion(nombre, fecha);
        if (!esValido) {
            throw new AlbumException("Album no creado. Datos incompletos. Todos los datos son requeridos");
        }
        this.nombre = nombre;
        this.fecha = fecha;
        this.cancion = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public List<Cancion> getCancion() {
        return cancion;
    }

    public Date getFecha() {
        return fecha;
    }

}
