package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import controls.ControlBanda;
import controls.ControlMiembro;
import entities.Banda;
import entities.Miembro;

public class ControlMiembroTest {

    Fabrica fabrica;
    ControlBanda controlBanda;

    public ControlMiembroTest() {
        this.fabrica = new Fabrica();
    }

    @Test
    public void buscarMiembroporCedulaTest() {
        Miembro miembroBuscado = fabrica.crearMiembroMock();
        Banda banda = fabrica.crearBandaMock();
        controlBanda = new ControlBanda(banda);
        banda.getMiembros().add(miembroBuscado);
        ControlMiembro controlMiembro = new ControlMiembro(controlBanda);

        Miembro miembroObtenido = controlMiembro.buscarMiembroporCedula(miembroBuscado.getCedula());

        assertEquals(miembroBuscado, miembroObtenido);

    }

    @Test
    public void agregarInstrumentoTest(){
        Miembro miembro = fabrica.crearMiembroMock();
        Banda banda = fabrica.crearBandaMock();
        controlBanda = new ControlBanda(banda);
        banda.getMiembros().add(miembro);
        ControlMiembro controlMiembro = new ControlMiembro(controlBanda);

        controlMiembro.agregarInstrumento(miembro.getCedula(), "Bateria");

        assertTrue(miembro.getInstrumento().containsKey("Bateria"));
    }


}
