package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
     * Para la creación de la banda 
     * @param nombre
     * @param genero
     * @param fecha
     * @param foto
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Banda other = (Banda) obj;
        return Objects.equals(this.nombre, other.nombre) &&
                Objects.equals(this.genero, other.genero) &&
                Objects.equals(this.fecha, other.fecha) &&
                Objects.equals(this.foto, other.foto);
    }
}
