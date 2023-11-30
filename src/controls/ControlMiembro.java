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
     * Método que crea un miembro y lo agrega a la lista de miembros de la clase
     * ControlMiembros
     * 
     * @param cedula número identificador del miembro
     * @param nombre
     * @param rol    rol en la banda que tiene el miembro, solo se pueden usar los
     *               tipos contenidos en la
     *               clase enum (VOCALISTA, GUITARRISTA, BATERISTA, BAJISTA)
     * @return un objeto tipo Miembro
     */

    public Miembro crearMiembro(String cedula, String nombre, Rol rol) {
        return new Miembro(cedula, nombre, rol, null);
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
