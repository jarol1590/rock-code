package tests;

import java.util.Calendar;
import java.util.Date;

import entities.Album;
import entities.Banda;
import entities.Miembro;
import entities.Rol;

public class Fabrica {

    public Banda crearBandaMock() {
        Calendar fecha = Calendar.getInstance();
        fecha.set(2023, Calendar.NOVEMBER, 23);
        Date fechaCreacionBanda = fecha.getTime();
        Banda banda1 = new Banda("Rock&Code", "Punk", fechaCreacionBanda, "");

        return banda1;
    }

    public Miembro crearMiembroMock() {
        Miembro miembro = new Miembro("2", "Javier", Rol.GUITARRISTA, null);
        return miembro;
    }

    public Album crearAlbumMock() {
        Calendar fechaAlbum = Calendar.getInstance();
        fechaAlbum.set(2023, Calendar.NOVEMBER, 24);
        Date fechaLanzamientoAlbum = fechaAlbum.getTime();
        Album album = new Album("PrimerAlbum", fechaLanzamientoAlbum);
        return album;
    }
}
