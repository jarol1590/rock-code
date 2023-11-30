package exceptions;

/**
 * Clase de excepción que tenga la clase Miembro
 */
public class MiembroException extends RuntimeException{

    /**
     * Constructor para el mensaje que genere una excepción de Miembro (ej: Miembro no encontrado)
     * @param mensaje
     */
    
    public MiembroException(String mensaje){
        super(mensaje);
    }
}
