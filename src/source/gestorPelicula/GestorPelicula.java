package source.gestorPelicula;

import java.util.ArrayList;

public class GestorPelicula {

    Pelicula pelicula = null;

    public GestorPelicula(Pelicula pelicula){
        this.pelicula = pelicula;
    }

    public String buscarPelicula(String titulo){
        return "";
    }

    public ArrayList<String> extraerDatosPelicula(){
        return pelicula.getInformacion();
    }

    public void eliminarPelicula(String idPelicula){

    }

    public void agregarPelicula(){
        this.pelicula = new Pelicula();
    }

    public void actualizarPelicula(String genero, String elenco, String idioma){
        pelicula.setInformacion(genero,elenco,idioma);
    }

}
