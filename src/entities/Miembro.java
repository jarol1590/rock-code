package entities;

import java.util.HashMap;

public class Miembro {
    private String cedula;
    private String nombre;
    private Rol rol;
    private HashMap<String, String> instrumento;

    public Miembro(String cedula, String nombre, Rol rol, HashMap<String, String> instrumento) {
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