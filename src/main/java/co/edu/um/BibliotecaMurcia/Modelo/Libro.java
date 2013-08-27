package co.edu.um.BibliotecaMurcia.Modelo;

/**
 * Created with IntelliJ IDEA.
 * User: JIMG
 * Date: 26/08/13
 * Time: 12:54
 * To change this template use File | Settings | File Templates.
 */
public class Libro {
    String autor,titulo,isbn,fecha;
    int existe;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getExiste() {
        return existe;
    }

    public void setExiste(int existe) {
        this.existe = existe;
    }
}
