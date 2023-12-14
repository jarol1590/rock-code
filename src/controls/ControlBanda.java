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

    public void agregarMiembro(Miembro miembro) {
        if(miembro == null){
            throw new MiembroException("Miembro invalido");
        }
        this.banda.getMiembros().add(miembro);
    }

    public void eliminarMiembro(Miembro miembro) {
        this.banda.getMiembros().remove(miembro);
    }

    public Miembro buscarMiembro(String cedula) {
        return banda.getMiembros().stream().filter(miembro -> miembro.getCedula().equals(cedula)).findFirst()
                .orElseThrow(() -> new MiembroException("Miembro no encontrado"));
    }

    public void agregarAlbumBanda(Album album) {
        this.banda.getAlbunes().add(album);
    }

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
