
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainClass;

import MainClass.Servicios.AutorServicio;
import MainClass.Servicios.EditorialServicio;
import MainClass.Servicios.LibroServicio;
import javax.swing.JOptionPane;

/**
 *
 * @author jpach
 */
public class Libreria {

    public static void main(String[] args) throws Exception {
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls = new LibroServicio();
//Crear
        as.CrearAutor(JOptionPane.showInputDialog("Ingresa el nombre del autor"));
//        es.CrearEditorial(JOptionPane.showInputDialog("Ingresa el nombre de la editorial"));
//        ls.CrearLibro(JOptionPane.showInputDialog("Ingresa el titulo de libro"));

//Buscar
//        as.BuscarAutorNombre(JOptionPane.showInputDialog("Ingresa el nombre del autor a buscar"));
//        es.BuscarEditorialNombre(JOptionPane.showInputDialog("Ingresa el nombre de la editorial a buscar"));
//        ls.BuscarLibroTitulo(JOptionPane.showInputDialog("Ingresa el titulo del libro a buscar"));
//        ls.BuscarLibroNombreAutor(JOptionPane.showInputDialog("Ingresa el nombre autor del libro a buscar"));
//        ls.BuscarLibroNombreEditorial(JOptionPane.showInputDialog("Ingresa el nombre Editorial del libro a buscar"));
//        ls.BuscarLibroIsbn(JOptionPane.showInputDialog("Ingresa el isbn del libro a buscar"));

//Modificar
//        as.EditarAutorNombre(JOptionPane.showInputDialog("Ingresa el nombre del autor a Modificar"));
//        es.EditarEditorialNombre(JOptionPane.showInputDialog("Ingresa el nombre de la editorial a Modificar"));
//        ls.EditarLibroNombre(JOptionPane.showInputDialog("Ingresa el titulo del libro a Modificar"));

//Elimnar
//        as.EliminarAutorId(JOptionPane.showInputDialog("Ingresa el id del autor a eliminar"));



    }
}
