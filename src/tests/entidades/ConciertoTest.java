package tests.entidades;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import entities.Concierto;
import exceptions.ConciertoException;

public class ConciertoTest {
    @Test
    public void crearConciertoFallaTest() {
        assertThrows(ConciertoException.class, () -> new Concierto(null, null, null, null, 0));
    }
}
