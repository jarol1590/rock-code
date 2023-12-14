package exceptions;

/**
 * Clase de Excepción para la clase Canción
 */
public class CancionException extends RuntimeException {

    /**
     * Constructor que genera el mensaje para la clase Canción (ej: Canción no
     * encontrada)
     * 
     * @param mensaje
     */

    public CancionException(String mensaje) {
        super(mensaje);
    }
}
