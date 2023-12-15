package tests.entidades;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import entities.Miembro;
import exceptions.MiembroException;

public class MiembroTest {
    @Test
    public void crearMiembroFallaTest() {
        assertThrows(MiembroException.class, () -> new Miembro(null, null, null, null));
    }
}
