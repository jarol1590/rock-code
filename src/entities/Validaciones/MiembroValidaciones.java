package entities.Validaciones;



import entities.Rol;

public class MiembroValidaciones {
  public static boolean crearMiembroValiacion(String cedula, String nombre, Rol rol){
        return cedula != null && nombre != null && rol !=null;
    }   
}
