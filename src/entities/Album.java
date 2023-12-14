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


  /**
   * Para crear un Album necesita el nombre y fecha de lanzamiento del album. En caso de no tener
   * algun dato lanza una excepción.
   * @param nombre Nombre dado del album. Tipo String
   * @param fecha Fecha de lanzamiento del album. Tipo Date (Hora, mes, dia)
   */
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
