package co.edu.um.BibliotecaMurcia.Modelo;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: JIMG
 * Date: 26/08/13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
public class Metodos {

    Libro librosQestan = new LinkedList<Libro>();
    Libro libro = new Libro();

    public LinkedList<Libro> getLibrosQestan() {
        return librosQestan;
    }

    public void setLibrosQestan(Libro librosQestan) {
        this.librosQestan = librosQestan;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String agregar(){
        System.out.println("Llegue al modelo");
        getLibrosQestan().add(libro);
        return recorre();
    }
    public String recorre(){
        int p = 1;
        String mensaje = "";
        for (Libro libro: getLibrosQestan())
        {
            mensaje = mensaje+" "+" Autor"+libro.getAutor();
            p++;
        }
        return mensaje;
    }
}
