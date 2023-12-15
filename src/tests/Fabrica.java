package tests;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import entities.Album;
import entities.Banda;
import entities.Concierto;
import entities.Cancion;
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

    public Concierto crearConciertoMock() {
        Calendar calendarFechaConcierto = Calendar.getInstance();
        calendarFechaConcierto.set(2024, Calendar.DECEMBER, 15);
        Date fechaConcierto = calendarFechaConcierto.getTime();
        LocalTime horaConciertoDos = LocalTime.of(19, 0, 0);
        Concierto concierto = new Concierto("U Caldas rock", "Universidad de Caldas",
                fechaConcierto,
                horaConciertoDos, 2500);

        return concierto;
    }

    public Cancion crearCancionMock() {
        LocalTime tiempoCancion = LocalTime.of(0, 4, 15);
        Cancion cancion1 = new Cancion("PrimerCancion", tiempoCancion);
        return cancion1;
    }
}
