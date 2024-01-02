/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineEntidades;

/**
 * las películas nos interesa saber el título, duración, edad mínima y
 * director.
 *
 * @author jpach
 */
public class Funcion {
    private final String[] tituloAl = {"Dragon Ball","Mario Bros","Black Adams"};
    private final String[] directorAl = {"Akira Toriyama","Aaron Horvath","Jaume Collet-Serra"};
    private String titulo;
    private String director;
    private int duracion;
    private int edadMinima;
    private int valorTicket;

    public Funcion() {
    }

    public Funcion(String titulo, String director, int duracion, int edadMinima, int valorTicket) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.valorTicket = valorTicket;
    }


    
    public String[] getTituloAl() {
        return tituloAl;
    }

    public String[] getDirectorAl() {
        return directorAl;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getValorTicket() {
        return valorTicket;
    }

    public void setValorTicket(int valorTicket) {
        this.valorTicket = valorTicket;
    }

    @Override
    public String toString() {
        return "Funcion{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", valorTicket=" + valorTicket + '}';
    }
    
    



}
