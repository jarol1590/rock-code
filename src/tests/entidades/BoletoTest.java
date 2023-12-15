package tests.entidades;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import entities.Boleto;
import exceptions.BoletoException;

public class BoletoTest {
     @Test
    public void crearAlbumFallaTest() {
        assertThrows(BoletoException.class, () -> new Boleto(0, false));
    }
}
