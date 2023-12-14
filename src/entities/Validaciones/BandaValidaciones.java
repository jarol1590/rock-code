package entities.Validaciones;

import java.util.Date;

public class BandaValidaciones {
    public static boolean crearBandaacion(String nombre, String genero, Date fecha, String foto) {
        return fecha != null && genero != null && fecha != null && foto != null;
    }
}
