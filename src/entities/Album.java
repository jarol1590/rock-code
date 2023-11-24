package entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Album {
    private String nombre;
    private Date fecha;
    private List<Cancion>cancion;


    public Album(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.cancion = new ArrayList<>();

    }


    public String getNombre() {
        return nombre;
    }

    public List<Cancion> getCancion(){
        return cancion;
    }


    public Date getFecha() {
        return fecha;
    }

    

    
    

    
}
