import java.util.Date;
import java.util.List;

import controls.ControlAlbum;
import controls.ControlBanda;
import controls.ControlConcierto;
import controls.ControlMiembro;

import java.util.ArrayList;
import java.util.Calendar;
import java.time.LocalTime;

import entities.Album;
import entities.Banda;
import entities.Cancion;
import entities.Concierto;
import entities.Miembro;
import entities.Rol;
import exceptions.AlbumException;
import exceptions.CancionException;
import exceptions.MiembroException;

public class RockyCode {
    public static void main(String[] args) throws Exception {
        // Inicializamos la banda
        Calendar fecha = Calendar.getInstance();
        fecha.set(2023, Calendar.NOVEMBER, 23);
        Date fechaCreacionBanda = fecha.getTime();
        LocalTime tiempoCancion = LocalTime.of(0, 4, 15);
        Banda banda1 = new Banda("Rock&Code", "Punk", fechaCreacionBanda, "");

        // Inicializamos controles
        ControlBanda controlBanda = new ControlBanda(banda1);
        ControlMiembro controlMiembro = new ControlMiembro(controlBanda);
        ControlAlbum controlAlbum = new ControlAlbum(banda1);
        List<Concierto> conciertos = new ArrayList<>();
        ControlConcierto controlConcierto = new ControlConcierto(conciertos);

        // Registrar y actualizar la información básica de la banda (género, fecha de
        // creación, fotos).
        controlBanda.actualizarBanda(null, null, fechaCreacionBanda, null);

        // Agregar o eliminar miembros a la banda (nombre, rol en la banda, instrumentos
        // que toca)
        Miembro miembro1 = controlMiembro.crearMiembro("2", "Javier", Rol.GUITARRISTA);
        Miembro miembro2 = controlMiembro.crearMiembro("1", "Eider", Rol.VOCALISTA);
        Miembro miembro3 = controlMiembro.crearMiembro("1", "Pedro", Rol.GUITARRISTA);
        controlBanda.agregarMiembro(miembro1);
        controlBanda.agregarMiembro(miembro2);
        controlBanda.agregarMiembro(miembro3);
        controlMiembro.agregarInstrumento("2", "Guitarra");
        controlMiembro.agregarInstrumento("1", "Guitarra");
        controlMiembro.agregarInstrumento("1", "Bajo");
        controlBanda.eliminarMiembro(miembro3);

        // Lanzar un nuevo Album
        Calendar fechaAlbum = Calendar.getInstance();
        fechaAlbum.set(2023, Calendar.NOVEMBER, 24);
        Date fechaLanzamientoAlbum = fechaAlbum.getTime();
        Album primerAlbum = new Album("PrimerAlbum", fechaLanzamientoAlbum);
        controlBanda.agregarAlbumBanda(primerAlbum);

        // Consultar la información de la banda, incluyendo los miembros.
        controlBanda.consultarInformacionBanda();

        // Agregar canciones al álbum (nombre, duración)
        Cancion cancion = new Cancion("Primera Cancion", tiempoCancion);
        Cancion cancion2 = new Cancion("Segunda Cancion", tiempoCancion);

        try {
            controlAlbum.agregarCancionAlbum(cancion, controlAlbum.buscarAlbum("PrimerAlbum"));
            controlAlbum.agregarCancionAlbum(cancion2, controlAlbum.buscarAlbum("PrimerAlbum"));
        } catch (AlbumException e) {
            System.out.println(e.getMessage() + " Buscar Album");

        }

        // Consultar las canciones de un álbum (dado el nombre del álbum)
        controlAlbum.imprimirCancionesPorAlbum("SegundoAlbum");

        try {
            controlAlbum.buscarCancion("Segunda Cancion", primerAlbum);
        } catch (CancionException e) {
            System.out.println(e.getMessage() + " Buscar solo por cancion");
        }

        try {
            controlBanda.buscarMiembro("2");
        } catch (MiembroException e) {
            System.out.println(e.getMessage() + " Buscar miembro por cedula");
        }

        // Crear conciertos
        Calendar calendarFechaConciertoUno = Calendar.getInstance();
        calendarFechaConciertoUno.set(2023, Calendar.NOVEMBER, 23);
        Date fechaConciertoUno = calendarFechaConciertoUno.getTime();
        LocalTime horaConciertoUno = LocalTime.of(19, 0, 0);

        Calendar calendarFechaConciertoDos = Calendar.getInstance();
        calendarFechaConciertoDos.set(2023, Calendar.DECEMBER, 15);
        Date fechaConciertoDos = calendarFechaConciertoDos.getTime();
        LocalTime horaConciertoDos = LocalTime.of(19, 0, 0);

        Concierto conciertoUno = new Concierto("Las Vegas rock", "Las Vegas", fechaConciertoUno, horaConciertoUno,
                5000);
        Concierto conciertoDos = new Concierto("U Caldas rock", "Universidad de Caldas", fechaConciertoDos,
                horaConciertoDos, 2500);

        controlConcierto.agregarConcierto(conciertoUno);
        controlConcierto.agregarConcierto(conciertoDos);
        controlConcierto.verInfoBasicaConciertos();

    }

}
