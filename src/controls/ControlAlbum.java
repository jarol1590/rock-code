package controls;

import java.util.ArrayList;
import java.util.List;

import entities.Album;
import entities.Banda;
import entities.Cancion;
import exceptions.AlbumException;
import exceptions.CancionException;

public class ControlAlbum {

    private Banda banda;
    private Album album;
    private List<Cancion> canciones;

    public ControlAlbum(Banda banda, Album album) {
        this.banda = banda;
        this.album = album;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancionAlbum(Cancion cancion, Album album) {

        this.album.getCancion().add(cancion);
        this.canciones.add(cancion);
        System.out.println(cancion.getNombre() + " Agregada al album: " + album.getNombre());

    }

    public Album buscarAlbum(String nombre) {

        return banda.getAlbum().stream().filter(album -> album.getNombre().equals(nombre))
                .findFirst().orElseThrow(() -> new AlbumException("Album no encontrado"));
    }

    public List<Cancion> buscarCancionesPorAlbum(String nombreAlbum) {

        Album albumBuscdo = buscarAlbum(nombreAlbum);

        if (albumBuscdo != null) {
            return albumBuscdo.getCancion();
            
        }

        throw new CancionException("Cancion no encontrada");

        
    }

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

    public Cancion buscarCancion(String nombre) {

        for (Cancion cancion : album.getCancion()) {
            if (cancion.getNombre().equals(nombre)) {
                return cancion;
            }

        }

        throw new CancionException("Cancion no encontrada");

    }

    

}
