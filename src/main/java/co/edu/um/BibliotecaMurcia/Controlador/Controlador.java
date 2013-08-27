package co.edu.um.BibliotecaMurcia.Controlador;

import co.edu.um.BibliotecaMurcia.Modelo.Libro;
import co.edu.um.BibliotecaMurcia.Modelo.Metodos;

/**
 * Created with IntelliJ IDEA.
 * User: JIMG
 * Date: 26/08/13
 * Time: 22:14
 * To change this template use File | Settings | File Templates.
 */
public class Controlador {
    Metodos metodos = new Metodos();
    Libro libro = new Libro();

    public Metodos getMetodos() {
        return metodos;
    }

    public void setMetodos(Metodos metodos) {
        this.metodos = metodos;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public String guardar(){
        getMetodos().setLibrosQestan(getLibro());
        libro = new Libro();
        return getMetodos().agregar();
    }
}
