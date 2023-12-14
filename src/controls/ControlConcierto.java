package controls;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import entities.Concierto;
import exceptions.ConciertoException;

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

    public List<Concierto> getConciertos() {
        return this.conciertos;
    }
}
