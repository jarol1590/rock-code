package exceptions;

/**
 * Clase de Excepcion usada para errores tenidos con la clase Album
 */

public class AlbumException extends RuntimeException {

    /**
     * Constructor para retornas el mensaje de la excepción (ej: Albúm no encontrado)
     * @param mensaje
     */

    public AlbumException(String mensaje){
        super(mensaje);
    }
    
}
