package entities.Validaciones;

import java.time.LocalTime;

public class CancionValidaciones {

    public static boolean crearCancionValiacion(String nombre, LocalTime duracion){
        return nombre != null && duracion != null;
    }
    
}
