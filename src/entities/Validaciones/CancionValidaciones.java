package entities.Validaciones;

import java.time.LocalTime;
import java.util.Date;

public class CancionValidaciones {
    public static boolean crearCancionValidacion(String nombre, LocalTime duracion) {
        return nombre != null && duracion != null;
    }
}
