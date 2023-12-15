package tests.entidades;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import entities.Album;
import exceptions.AlbumException;

public class AlbumTest {

    @Test
    public void crearAlbumFallaTest() {
        assertThrows(AlbumException.class, () -> new Album(null, null));
    }
}
