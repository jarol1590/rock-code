package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import controls.ControlBanda;
import entities.Album;
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

        controlBanda.agregarMiembro(miembro);
        assertTrue(banda.getMiembros().contains(miembro));
    }

    @Test
    public void eliminarMiembro() {
        Banda banda = fabrica.crearBandaMock();
        Miembro miembro = fabrica.crearMiembroMock();
        banda.getMiembros().add(miembro);
        ControlBanda controlBanda = new ControlBanda(banda);

        controlBanda.eliminarMiembro(miembro);

        assertFalse(banda.getMiembros().contains(miembro));
    }

    @Test
    public void buscarMiembro() {
        Banda banda = fabrica.crearBandaMock();
        Miembro miembroEsperado = fabrica.crearMiembroMock();
        banda.getMiembros().add(miembroEsperado);

        ControlBanda controlBanda = new ControlBanda(banda);
        Miembro miembroObtenido = controlBanda.buscarMiembro(miembroEsperado.getCedula());

        assertEquals(miembroEsperado, miembroObtenido);
    }

    @Test
    public void agregarAlbumBanda() {
        Banda banda = fabrica.crearBandaMock();
        Album album = fabrica.crearAlbumMock();

        ControlBanda controlBanda = new ControlBanda(banda);
        controlBanda.agregarAlbumBanda(album);

        assertTrue(banda.getAlbunes().contains(album));
    }

    @Test
    public void actualizarBanda() {
        Banda bandaActualizar = fabrica.crearBandaMock();

        Calendar fecha = Calendar.getInstance();
        fecha.set(2023, Calendar.NOVEMBER, 23);
        Date fechaCreacionBanda = fecha.getTime();
        Banda bandaEsperada = new Banda("nombre actualizado", "genero actualizado", fechaCreacionBanda, "");

        ControlBanda controlBanda = new ControlBanda(bandaActualizar);

        controlBanda.actualizarBanda("nombre actualizado", "genero actualizado",
                fechaCreacionBanda, "");

        assertEquals(bandaEsperada, bandaActualizar);
    }
}
