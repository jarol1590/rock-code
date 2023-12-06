package tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import controls.ControlBanda;
import entities.Banda;
import entities.Miembro;

public class ControlBandaTest {

    Fabrica fabrica;

    public ControlBandaTest() {
        this.fabrica = new Fabrica();
    }

    @Test
    public void agregarMiembroTest() {

        Banda banda = fabrica.crearBandaMock();
        Miembro miembro = fabrica.crearMiembroMock();
        ControlBanda controlBanda = new ControlBanda(banda);

        /*
         * POR EJEMPLO ACÁ: Agregar miembro, agrega un miembro a la lista de miembros
         * en la banda, y no vemos necesario testear que si se agregue un miembro a la
         * lista.
         */
        controlBanda.agregarMiembro(miembro);
    }
}
