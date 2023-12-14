package entities.Validaciones;

import java.time.LocalTime;
import java.util.Date;

public class AlbumValidaciones {
    public static boolean crearAlbumValidacion(String nombre, Date fecha) {
        return fecha != null && nombre != null;
    }
}
