package tests.entidades;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import exceptions.BandaExceoption;

public class BandaTest {
    @Test
    public void crearBandaFallaTest() {
        assertThrows(BandaExceoption.class, () -> new entities.Banda(null, null, null, null));
    }
}
