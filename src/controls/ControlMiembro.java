package controls;

import entities.Miembro;

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
     * @param cedula      Identificador del miembro. Tipo String
     * @param instrumento Nombre del instrumento que se le agregará a la lista de
     *                    instrumentos al miembro, el instrumento no puede ser
     *                    repetido
     *                    ya que se usa el tipo HashMap, el cual no deja ingresar
     *                    valores iguales en una lista. Tipo String
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
