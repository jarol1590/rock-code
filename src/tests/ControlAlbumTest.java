package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import controls.ControlAlbum;
import entities.Album;
import entities.Banda;
import entities.Cancion;

public class ControlAlbumTest {
    Fabrica fabrica;

    public ControlAlbumTest() {
        this.fabrica = new Fabrica();
    }

    @Test
    public void agregarCancionAlbumTest() {
        Banda banda = fabrica.crearBandaMock();
        Album album = fabrica.crearAlbumMock();
        Cancion cancionEsperada = fabrica.crearCancionMock();
        ControlAlbum controlAlbum = new ControlAlbum(banda);

        controlAlbum.agregarCancionAlbum(cancionEsperada, album);
        assertTrue(album.getCanciones().contains(cancionEsperada));

    }

    @Test
    public void buscarAlbumTest() {
        Banda banda = fabrica.crearBandaMock();
        Album albumEsperado = fabrica.crearAlbumMock();
        banda.getAlbunes().add(albumEsperado);

        ControlAlbum controlAlbum = new ControlAlbum(banda);
        Album albumObtenido = controlAlbum.buscarAlbum(albumEsperado.getNombre());
        assertEquals(albumEsperado, albumObtenido);
    }

    @Test
    public void buscarCancionesPorAlbumTest() {
        Banda banda = fabrica.crearBandaMock();
        Album album = fabrica.crearAlbumMock();
        Cancion cancion = fabrica.crearCancionMock();
        List<Cancion> cancionesEsperadas = new ArrayList<Cancion>();
        cancionesEsperadas.add(cancion);
        album.getCanciones().add(cancion);
        banda.getAlbunes().add(album);

        ControlAlbum controlAlbum = new ControlAlbum(banda);
        List<Cancion> cancionesObtenidas = controlAlbum.buscarCancionesPorAlbum(album.getNombre());

        assertEquals(cancionesEsperadas, cancionesObtenidas);

    }

    @Test
    public void buscarCancionTest(){
        Banda banda = fabrica.crearBandaMock();
        Album album = fabrica.crearAlbumMock();
        Cancion cancionEsperada = fabrica.crearCancionMock();
        album.getCanciones().add(cancionEsperada);

        ControlAlbum controlAlbum = new ControlAlbum(banda);
        Cancion cancionObtenida = controlAlbum.buscarCancion(cancionEsperada.getNombre(), album);

        assertEquals(cancionObtenida, cancionEsperada);
    }
}
