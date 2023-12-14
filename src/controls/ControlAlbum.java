package controls;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Album;
import entities.Banda;
import entities.Cancion;
import exceptions.AlbumException;
import exceptions.CancionException;

public class ControlAlbum {

    private Banda banda;
    private List<Cancion> canciones;

    public ControlAlbum(Banda banda) {
        this.banda = banda;
        this.canciones = new ArrayList<>();
    }

    /**
     * Agrega una canción creada a la lista de un álbum
     * @param cancion Canción que se quiere agregar a un albúm de la banda
     * @param album Albúm en el que se va a agregar la canción a su lista de canciones
     */

    public void agregarCancionAlbum(Cancion cancion, Album album) {
        album.getCanciones().add(cancion);
        this.canciones.add(cancion);
        System.out.println(cancion.getNombre() + " Agregada al album: " + album.getNombre());

    }

    /**
     * Busca un album por el nombre
     * @param nombre Nombre del album a buscar. Tipo String
     * @return Retorna el objeto tipo Album con el nombre exacto ingresado o una Excepción
     */

    public Album buscarAlbum(String nombre) {

        return banda.getAlbunes().stream().filter(album -> album.getNombre().equals(nombre))
                .findFirst().orElseThrow(() -> new AlbumException("Album no encontrado"));
    }

    /**
     * Busca la lista de canciones que contienen un Album, en caso de que el nombre sea null
     * lanza una excepción
     * @param nombreAlbum Nombre del álbum del que desea buscar la lista de canciones, si es 
     * null lanza excepción.
     * @return Retorna la lista de canciones del álbum ingresado
     */
    public List<Cancion> buscarCancionesPorAlbum(String nombreAlbum) {

        Album albumBuscdo = buscarAlbum(nombreAlbum);

        if (albumBuscdo != null) {
            return albumBuscdo.getCanciones();

        }

        throw new AlbumException("Nombre del Album no valido");

    }

    /**
     * Imprime la lista de canciones que contiene un álbum
     * @param nombreAlbum Nombre del albúm del que se desea buscar la lista de canciones. Tipo String
     */
    public void imprimirCancionesPorAlbum(String nombreAlbum) {
        try {
            List<Cancion> cancionesEncontradas = buscarCancionesPorAlbum(nombreAlbum);

            System.out.println("Canciones del Album " + nombreAlbum + ":");
            for (Cancion cancion : cancionesEncontradas) {
                System.out.println(cancion.getNombre());
            }
        } catch (AlbumException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Busca una canción incluyendo el nombre del álbum en el que se desee buscar
     * @param nombre Nombre de la canción a buscar. Tipo String
     * @param album Albúm en el que se desee buscar la canción. Tipo Album
     * @return Retorna un objeto tipo Canción que coincida con el nombre dado y esté en la lista
     * de canciones del objeto Album
     */
    public Cancion buscarCancion(String nombre, Album album) {

        for (Cancion cancion : album.getCanciones()) {
            if (cancion.getNombre().equals(nombre)) {
                return cancion;
            }

        }

        throw new CancionException("Cancion no encontrada");

    }   

}
