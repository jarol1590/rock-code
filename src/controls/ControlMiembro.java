package controls;

import entities.Miembro;
import entities.Rol;

/**
 * Clase ControlMiembro que tiene toda la lógica que tenga que ver con los
 * Miembros de la banda.
 * Tiene una lista de miembros
 */
public class ControlMiembro {

    ControlBanda controlBanda;

    public ControlMiembro(ControlBanda controlBanda) {
        this.controlBanda = controlBanda;
    }

    /**
     * Método que agrega un instrumento a un miembro ya existente
     * 
     * @param cedula      Identificador del miembro
     * @param instrumento Nombre del instrumento que se le agregará a la lista de
     *                    instrumentos al miembro
     */
    public void agregarInstrumento(String cedula, String instrumento) {
        Miembro miembroEncontrado = buscarMiembroporCedula(cedula);

        if (miembroEncontrado != null) {
            miembroEncontrado.getInstrumento().put(instrumento, instrumento);
        }

    }

    /**
     * Clase que busca en una lista de miembros el buscado por el atributo Cédula
     * 
     * @param cedula número de identificador del miembro
     * @return un tipo miembro que tenga el número de cédula dado o una excepción
     *         tipo MiembroException
     */
    public Miembro buscarMiembroporCedula(String cedula) {
        return controlBanda.buscarMiembro(cedula);
    }

}
