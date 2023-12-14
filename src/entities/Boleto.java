package entities;

import entities.Validaciones.BoletoValidaciones;
import exceptions.BoletoException;

public class Boleto {
    private int precio;
    private boolean vendido;

    /**
     * Para la creación de los boletos para los conciertos se necesita un precio mayor o igual a 0,
     * en caso de ingresar un precio negativo lanzará una excepción
     * @param precio Precio del boleto del concierto. Tipo int
     * @param vendido Atributo que muestra si el boleto a sido vendido o no, inicializa en false.
     */

    public Boleto(int precio, boolean vendido) {
        boolean esValido = BoletoValidaciones.crearBoletoValiacion(precio, vendido);

        if(!esValido){
            throw new BoletoException("El precio no puede ser negativo");
        }
        this.precio = precio;
        this.vendido = false;
    }

    

}
