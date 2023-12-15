package controls;

import java.util.List;

import entities.Concierto;

public class ControlConcierto {
    List<Concierto> conciertos;

    public ControlConcierto(List<Concierto> conciertos) {
        this.conciertos = conciertos;
    }

    /**
     * Agrega un concierto a la lista del ControlConciertos, esto se usa con el fin
     * de mostrar
     * una lista con todos los conciertos que ha dado y va a dar la banda
     * 
     * @param concierto Objeto tipo Concierto que se desea agregar a la lista.
     */

    public void agregarConcierto(Concierto concierto) {
        this.conciertos.add(concierto);
    }

    /**
     * Muestra la información de todos los conciertos que ha dado y va a dar la
     * banda.
     */
    public void verInfoBasicaConciertos() {
        for (Concierto concierto : conciertos) {
            System.out.println(concierto.toString());
        }
    }

    public List<Concierto> getConciertos() {
        return this.conciertos;
    }
}
