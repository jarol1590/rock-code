package entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Concierto {
    private String nombre;
    private String lugar;
    private Date fecha;
    private LocalTime hora;
    private int capacidad;
    private List<Boleto> boletoVendido;
    
    public Concierto(String nombre, String lugar, Date fecha, LocalTime hora, int capacidad) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.capacidad = capacidad;
        this.boletoVendido = new ArrayList<>();
    }

    
}
