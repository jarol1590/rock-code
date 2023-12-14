package controls;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import entities.Album;
import entities.Banda;
import entities.Miembro;
import exceptions.MiembroException;

public class ControlBanda {

    private Banda banda;

    public ControlBanda(Banda banda) {
        this.banda = banda;
    }

    /**
     * Agrega un miembro a la lista de miembros de una banda
     * @param miembro Objeto tipo Miembro que se desea agregar a la lista de la banda
     * En caso de ser null lanza una excepción tipo MiembroException
     */

    public void agregarMiembro(Miembro miembro) {
        if(miembro == null){
            throw new MiembroException("Miembro invalido");
        }
        this.banda.getMiembros().add(miembro);
    }

    /**
     * Elimina un miembro de la lista de miembros de la banda
     * @param miembro Objeto tipo miembro que se desee eliminar
     */
    public void eliminarMiembro(Miembro miembro) {
        this.banda.getMiembros().remove(miembro);
    }

    /**
     * Busca un miembro por medio de la cédula en la lista de miembros de la banda
     * @param cedula Número de identificación del miembro que se desea buscar
     * @return Retorna un tipo Miembro que su atributo Cedula sea igual a la cedula ingresada. En 
     * caso de no encontrarlo lanza una excepción tipo MiembroException
     */
    public Miembro buscarMiembro(String cedula) {
        return banda.getMiembros().stream().filter(miembro -> miembro.getCedula().equals(cedula)).findFirst()
                .orElseThrow(() -> new MiembroException("Miembro no encontrado"));
    }
    
    /**
     * Agrega un albúm a la lista de albunes de la banda
     * @param album Objeto que se desea agregar a la lista de la banda. Tipo Album
     */
    public void agregarAlbumBanda(Album album) {
        this.banda.getAlbunes().add(album);
    }

    /**
     * Actualiza los datos de la banda
     * @param nombre Nombre que se desea cambiar, si es null deja el nombre actual.Tipo String
     * @param genero Tipo de genero que se desea cambiar ("Reggue, Punk, Rock"), si es null deja
     * el genero actual. Tipo String
     * @param fecha Fecha de creación de la banda, si es null deja la fecha actual. 
     * Tipo Date (Año, mes, dia)
     * @param foto Dirección de la foto de la banda, si es null deja la foto actual. 
     * Tipo String() Ejemplo: (D:\Documents\Desktop)
     */

    public void actualizarBanda(String nombre, String genero, Date fecha, String foto) {

        if (nombre != null) {
            banda.setNombre(nombre);
        }
        ;

        if (genero != null) {
            banda.setGenero(genero);
        }
        ;

        if (fecha != null) {
            banda.setFecha(fecha);
        }
        ;

        if (foto != null) {
            banda.setFoto(foto);
        }

    }

    /**
     * Imprime por consola los datos de la banda incluyendo la lista de miembros y lista de albumes
     */

    public void consultarInformacionBanda() {

        System.out.println("NOMBRE DE LA BANDA: " + banda.getNombre());
        System.out.println("GENERO DE LA BANDA: " + banda.getGenero());
        System.out.println("FECHA DE CREACION: " + banda.getFecha());
        System.out.println("FOTO: " + banda.getFoto());

        List<String> listaMiembros = new ArrayList<>();

        for (Miembro miembro : banda.getMiembros()) {
            listaMiembros.add(miembro.getNombre());
        }

        System.out.println("MIEMBROS: " + listaMiembros);

        List<String> listaAlbumes = new ArrayList<>();

        for (Album album : banda.getAlbunes()) {
            listaAlbumes.add(album.getNombre());
        }

        System.out.println("ALBUMES: " + listaAlbumes);

    }

}
