package co.edu.um.BibliotecaMurcia.Vista;

import co.edu.um.BibliotecaMurcia.Controlador.Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: JIMG
 * Date: 26/08/13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
public class Ventana extends JFrame implements ActionListener {

    JLabel labelAutor,labelTitulo,labelFecha,labelIsbn,labelexiste;
    JTextField campoAutor,campoTitulo,campoIsbn,campoFecha,campoExiste;
    JButton agregar,eliminar,modificar,salir;
    JTextArea areaCampo;
    Controlador controlador = new Controlador();

    public Ventana()
    {
        setLayout(null);

        labelAutor = new JLabel("Ingrese autor");
        labelAutor.setBounds(700,15,100,50);
        add(labelAutor);
        labelAutor.setVisible(true);

        labelTitulo = new JLabel("Ingrese titulo");
        labelTitulo.setBounds(700,75,100,50);
        add(labelTitulo);
        labelTitulo.setVisible(true);

        labelFecha = new JLabel("Ingrese fecha");
        labelFecha.setBounds(700,135,100,50);
        add(labelFecha);
        labelFecha.setVisible(true);

        labelIsbn = new JLabel("Ingrese isbn");
        labelIsbn.setBounds(700,195,100,50);
        add(labelIsbn);
        labelIsbn.setVisible(true);

        labelexiste = new JLabel("Ingrese Existencia");
        labelexiste.setBounds(700,255,150,50);
        add(labelexiste);
        labelexiste.setVisible(true);

        campoAutor = new JTextField("Autor");
        campoAutor.setBounds(600,25,100,30);
        add(campoAutor);
        campoAutor.setVisible(true);

        campoTitulo = new JTextField("Titulo");
        campoTitulo.setBounds(600,85,100,30);
        add(campoTitulo);
        campoTitulo.setVisible(true);

        campoIsbn = new JTextField("Isbn");
        campoIsbn.setBounds(600,205,100,30);
        add(campoIsbn);
        campoIsbn.setVisible(true);

        campoFecha = new JTextField("Fecha");
        campoFecha.setBounds(600,145,100,30);
        add(campoFecha);
        campoFecha.setVisible(true);

        campoExiste = new JTextField("Existencia");
        campoExiste.setBounds(600,265,100,30);
        add(campoExiste);
        campoExiste.setVisible(true);

        agregar = new JButton("Agregar libro");
        agregar.setBounds(800,20,160,40);
        add(agregar);
        agregar.setVisible(true);
        agregar.addActionListener(this);

        modificar = new JButton("Buscar libro");
        modificar.setBounds(800,80,160,40);
        add(modificar);
        modificar.setVisible(true);
        modificar.addActionListener(this);

        eliminar = new JButton("Eliminar libro");
        eliminar.setBounds(800,140,160,40);
        add(eliminar);
        eliminar.setVisible(true);
        eliminar.addActionListener(this);

        salir = new JButton("Salir");
        salir.setBounds(800,200,160,40);
        add(salir);
        salir.setVisible(true);
        salir.addActionListener(this);

        areaCampo = new JTextArea();
        areaCampo.setBounds(0,0,300,300);
        add(areaCampo);
        areaCampo.setVisible(true);
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public JTextField getCampoAutor() {
        return campoAutor;
    }

    public void setCampoAutor(JTextField campoAutor) {
        this.campoAutor = campoAutor;
    }

    public JTextField getCampoTitulo() {
        return campoTitulo;
    }

    public void setCampoTitulo(JTextField campoTitulo) {
        this.campoTitulo = campoTitulo;
    }

    public JTextField getCampoIsbn() {
        return campoIsbn;
    }

    public void setCampoIsbn(JTextField campoIsbn) {
        this.campoIsbn = campoIsbn;
    }

    public JTextField getCampoFecha() {
        return campoFecha;
    }

    public void setCampoFecha(JTextField campoFecha) {
        this.campoFecha = campoFecha;
    }

    public JTextField getCampoExiste() {
        return campoExiste;
    }

    public void setCampoExiste(JTextField campoExiste) {
        this.campoExiste = campoExiste;
    }

    public JTextArea getAreaCampo() {
        return areaCampo;
    }

    public void setAreaCampo(JTextArea areaCampo) {
        this.areaCampo = areaCampo;
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setBounds(20,20,1000,400);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
         if(actionEvent.getSource() == agregar)
         {
             System.out.println("hola q hace");
             getControlador().getLibro().setAutor(getCampoAutor().getText());
             String temp = getControlador().guardar();
             areaCampo.setText(temp);

         }
         if(actionEvent.getSource() == modificar)
         {
             System.out.println("modificar");
         }
         if(actionEvent.getSource() == eliminar)
         {
             System.out.println("eliminar");
         }
         if(actionEvent.getSource() == salir)
         {
             System.exit(Ventana.EXIT_ON_CLOSE);
         }
    }
}
