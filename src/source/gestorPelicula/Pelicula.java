package source.gestorPelicula;

import java.util.ArrayList;

public class Pelicula {
    private String titulo, director, archivo;
    private float calificacion;
    private int duracion;
    private ArrayList<String> genero, elenco, idioma;

    public Pelicula() {

    }

    public Pelicula(String titulo, String director, String archivo) {
        this.titulo = titulo;
        this.director = director;
        this.archivo = archivo;
    }

    public ArrayList<String> getInformacion() {
        return genero;
    }

    public void setInformacion(String genero, String elenco, String idioma) {
        this.genero.add(genero);
        this.elenco.add(elenco);
        this.idioma.add(idioma);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
}
