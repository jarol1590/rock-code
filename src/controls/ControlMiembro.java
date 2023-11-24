package controls;

import java.util.ArrayList;
import java.util.List;

import entities.Miembro;
import entities.Rol;
import exceptions.MiembroException;

public class ControlMiembro {

    private List<Miembro> miembros;
    
    public ControlMiembro() {
        this.miembros = new ArrayList<>();
        
    }

    public void agregarInstrumento(String cedula, String instrumento) {
        Miembro miembroEncontrado = buscarMiembroporCedula(cedula);
        

        if(miembroEncontrado != null){
            miembroEncontrado.getInstrumento().put(instrumento, instrumento);
        }

    }

    public Miembro crearMiembro(String cedula, String nombre, Rol rol) {

        Miembro nuevoMiembro = new Miembro(cedula, nombre, rol, null);

        this.miembros.add(nuevoMiembro);

        return nuevoMiembro;
    }

    public Miembro buscarMiembroporCedula(String cedula){
        for (Miembro miembro : miembros) {
            if(miembro.getCedula().equals(cedula)){
                return miembro;
            }
        }

        throw new MiembroException("Miembro no encontrado");
    }

}
