package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banda {
    private String nombre;
    private String genero;
    private Date fecha;
    private String foto;
    private List<Miembro> miembros;
    private List<Album>album;

    public Banda(String nombre, String genero, Date fecha, String foto) {
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
        this.foto = foto;
        this.miembros = new ArrayList<>();
        this.album = new ArrayList<>();
    }

    public List<Miembro> getMiembros() {
        return miembros;
    }

    public List<Album> getAlbum() {
        return album;
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
