package entities.Validaciones;

import java.time.LocalTime;
import java.util.Date;

public class ConciertoValidaciones {
    public static boolean crearConciertoValidacion(String nombre, String lugar, Date fecha, LocalTime hora,
            int capacidad) {
        return nombre != null && lugar != null && fecha.compareTo(new Date())>0 && hora != null && capacidad > 0;
    }
}
