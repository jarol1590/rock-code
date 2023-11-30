package controls;

import java.util.List;

import entities.Concierto;

public class ControlConcierto {
    List<Concierto> conciertos;

    public ControlConcierto(List<Concierto> conciertos) {
        this.conciertos = conciertos;
    }

    public void agregarConcierto(Concierto concierto) {
        this.conciertos.add(concierto);
    }

    public void verInfoBasicaConciertos() {
        for (Concierto concierto : conciertos) {
            System.out.println(concierto.toString());
        }
    }

}
