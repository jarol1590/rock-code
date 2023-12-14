package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import controls.ControlBanda;
import controls.ControlConcierto;
import entities.Banda;
import entities.Concierto;
import entities.Miembro;

public class ControlConciertoTest {

    Fabrica fabrica;

    public ControlConciertoTest() {
        this.fabrica = new Fabrica();
    }

    @Test
    public void agregarConciertoTest() {
        List<Concierto> conciertos = new ArrayList<>();
        ControlConcierto controlConcierto = new ControlConcierto(conciertos);
        Concierto concierto = fabrica.crearConciertoMock();

        controlConcierto.agregarConcierto(concierto);
        assertTrue(controlConcierto.getConciertos().contains(concierto));
    }
}
