package entities;

import java.util.HashMap;

import entities.Validaciones.MiembroValidaciones;
import exceptions.MiembroException;

public class Miembro {
    private String cedula;
    private String nombre;
    private Rol rol;
    private HashMap<String, String> instrumento;

    public Miembro(String cedula, String nombre, Rol rol, HashMap<String, String> instrumento) {
        boolean esValido = MiembroValidaciones.crearMiembroValiacion(cedula, nombre, rol);
        if(!esValido){
            throw new MiembroException("Datos invalidos. El miembro debe tener cédula, nombre y rol como minimo");
        }
        this.cedula = cedula;
        this.nombre = nombre;
        this.rol = rol;
        this.instrumento = (instrumento != null) ? instrumento : new HashMap<>();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<String, String> getInstrumento() {
        return instrumento;
    }
  

    

}