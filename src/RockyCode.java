import java.util.Date;

import controls.ControlAlbum;
import controls.ControlBanda;
import controls.ControlMiembro;

import java.util.Calendar;
import java.time.LocalTime;

import entities.Album;
import entities.Banda;
import entities.Cancion;
import entities.Miembro;
import entities.Rol;
import exceptions.AlbumException;
import exceptions.CancionException;
import exceptions.MiembroException;

public class RockyCode {
    public static void main(String[] args) throws Exception {

    //FECHA Y HORA

        Calendar fecha = Calendar.getInstance();
        fecha.set(2023, Calendar.NOVEMBER, 23);
        Date fechaCreacionBanda = fecha.getTime();
        LocalTime tiempoCancion = LocalTime.of(0,4,15);

        Calendar fechaAlbum = Calendar.getInstance();
        fechaAlbum.set(2023, Calendar.NOVEMBER, 24);
        Date fechaLanzamientoAlbum = fechaAlbum.getTime();

    //Inicializadores
        ControlMiembro controlMiembro = new ControlMiembro();

    //Registrar y actualizar la información básica de la banda (género, fecha de creación, fotos).

        Banda banda1 = new Banda("Rock&Code", "Punk", fechaCreacionBanda, "");
        ControlBanda controlBanda = new ControlBanda(banda1);
        controlBanda.actualizarBanda(null, null, fechaCreacionBanda, null);
        
    //Agregar o eliminar miembros a la banda (nombre, rol en la banda, instrumentos que toca)
        Miembro miembro = controlMiembro.crearMiembro("2", "Javier", Rol.GUITARRISTA);
        Miembro miembro2 = controlMiembro.crearMiembro("1", "Eider", Rol.VOCALISTA);
        controlBanda.agregarMiembro(miembro);
        controlBanda.agregarMiembro(miembro2);
        controlMiembro.agregarInstrumento("2", "Guitarra");
        controlMiembro.agregarInstrumento("1", "Guitarra");
        controlMiembro.agregarInstrumento("1", "Bajo");
        controlBanda.eliminarMiembro(miembro2);

        

    //Lanzar un nuevo Album

        Album primerAlbum = new Album("PrimerAlbum", fechaLanzamientoAlbum);
        controlBanda.agregarAlbumBanda(primerAlbum);


    //Consultar la información de la banda, incluyendo los miembros.

        controlBanda.consultarInformacionBanda();
      
    

    //Agregar canciones al álbum (nombre, duración)

        ControlAlbum controlAlbum = new ControlAlbum(banda1, primerAlbum);
       
        Cancion cancion = new Cancion("Primera Cancion", tiempoCancion);
        Cancion cancion2 = new Cancion("Segunda Cancion", tiempoCancion);

        try {
            controlAlbum.agregarCancionAlbum(cancion, controlAlbum.buscarAlbum("PrimerAlbum"));
            controlAlbum.agregarCancionAlbum(cancion2, controlAlbum.buscarAlbum("PrimerAlbum"));
        } catch (AlbumException e) {
           System.out.println(e.getMessage()+ " Buscar Album");
           
        }
        
    // Consultar las canciones de un álbum (dado el nombre del álbum)
       controlAlbum.imprimirCancionesPorAlbum("SegundoAlbum");

        try {
            controlAlbum.buscarCancion("Segunda Cancion");
        } catch (CancionException e) {
           System.out.println(e.getMessage() + " Buscar solo por cancion");
        }

        try {
            controlBanda.buscarMiembro("2");
        } catch (MiembroException e) {
            System.out.println(e.getMessage()+ " Buscar miembro por cedula");
        }


    

    }

    

    
}
