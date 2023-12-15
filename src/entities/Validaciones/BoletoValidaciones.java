package entities.Validaciones;



public class BoletoValidaciones {
    public static boolean crearBoletoValiacion(int precio, boolean vendido){
        return precio > 0;
    }
}
