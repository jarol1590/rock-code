package entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Validaciones.ConciertoValidaciones;
import exceptions.ConciertoException;

public class Concierto {
    private String nombre;
    private String lugar;
    private Date fecha;
    private LocalTime hora;
    private int capacidad;
    private List<Boleto> boletosVendidos;

    public Concierto(String nombre, String lugar, Date fecha, LocalTime hora, int capacidad) {
        boolean esValido = ConciertoValidaciones.crearConciertoValidacion(nombre, lugar, fecha, hora, capacidad);
        if (!esValido) {
            throw new ConciertoException("Conciero no creado. Datos incompletos. Se requieren todos los datos");
        }
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.capacidad = capacidad;
        this.boletosVendidos = new ArrayList<>();
    }

    // public static Concierto crearConcierto(String nombre, String lugar, Date
    // fecha, LocalTime hora, int capacidad) {
    // if (nombre == null || lugar == null || fecha == null || hora == null ||
    // capacidad <= 0) {
    // throw new ConciertoException("Conciero no creado. Datos incompletos. Se
    // requieren todos los datos");
    // }
    // return new Concierto(nombre, lugar, fecha, hora, capacidad);
    // }

    @Override
    public String toString() {
        return "===============Concierto:=================\n" +
                "Nombre= " + nombre + '\n' +
                "Lugar= " + lugar + '\n' +
                "Fecha= " + fecha + '\n' +
                "Hora= " + hora + '\n' +
                "Capacidad= " + capacidad + '\n' +
                "Boletos vendidos= " + boletosVendidos;
    }

}
