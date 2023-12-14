package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Validaciones.BandaValidaciones;
import exceptions.BandaExceoption;

public class Banda {
    private String nombre;
    private String genero;
    private Date fecha;
    private String foto;
    private List<Miembro> miembros;
    private List<Album> albuneList;

    /**
     * Para crear la banda necesita el nombre, genero ("Punk, Rock, Reggue, etc"), fecha
     * y Foto, en caso que no se tenga uno de estos datos lanzará una excepción
     * @param nombre Nombre de la band. Tipo String
     * @param genero Genero básico de la banda ("Punk, Rock, Reggue, etc"). Tipo String
     * @param fecha Fecha de la fundación de la banda. Tipo Date (Hora, mes, dia)
     * @param foto Dirección donde se guarda la foto de la banda. Tipo String 
     * Ejemplo: (D:\Documents\Desktop)
     */

    public Banda(String nombre, String genero, Date fecha, String foto) {
        boolean esValido = BandaValidaciones.crearBandaacion(nombre, genero, fecha, foto);
        if (!esValido) {
            throw new BandaExceoption("Banda no creada. Datos incompletos. Todos los datos son requeridos");
        }
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
        this.foto = foto;
        this.miembros = new ArrayList<>();
        this.albuneList = new ArrayList<>();
    }

    public List<Miembro> getMiembros() {
        return miembros;
    }

    public List<Album> getAlbunes() {
        return albuneList;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getFoto() {
        return foto;
    }

}
