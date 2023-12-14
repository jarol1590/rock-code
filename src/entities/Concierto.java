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

    /**
     * Para crear un concierto necesita el nombre, lugar, fecha, hora y capacidad, en caso que no 
     * se tenga uno de estos datos lanzará una excepción
     * @param nombre Nombre del concierto. Tipo String
     * @param lugar Nombre del lugar donde se llevará a cabo el concierto. Tipo String
     * @param fecha Fecha del concierto no puede ser anterior a la fecha acutal. Tipo Date (Año, mes, dia)
     * @param hora Hora de inicio del concierto. Tipo LocalTime (Hora, minutos, segundos)
     * @param capacidad Capacidad total registrada por el lugar del concierto. Tipo int
     */

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
