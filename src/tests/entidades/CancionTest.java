package tests.entidades;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import entities.Cancion;
import exceptions.CancionException;

public class CancionTest {
     @Test
    public void crearCancionFallaTest() {
        assertThrows(CancionException.class, () -> new Cancion(null, null));
    }
}
