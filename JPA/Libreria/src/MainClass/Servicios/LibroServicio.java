/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass.Servicios;

import MainClass.Entidades.Autor;
import MainClass.Entidades.Editorial;
import MainClass.Entidades.Libro;
import MainClass.Persistencias.DAOAutor;
import MainClass.Persistencias.DAOEditorial;
import MainClass.Persistencias.DAOLibro;
import javax.swing.JOptionPane;

/**
 * crear buscar editar eliminar imprimir
 *
 * @author jpach
 */
public class LibroServicio {

    private final DAOLibro dao = new DAOLibro();
    private final DAOAutor daoAutor = new DAOAutor();
    private final DAOEditorial daoEditorial = new DAOEditorial();

    public void CrearLibro(String titulo) throws Exception {
        Libro libro = new Libro();
        try {
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Ingresa un titulo valido para el libro");
            }
            libro.setTitulo(titulo);

            libro.setAnio(Integer.valueOf(JOptionPane.showInputDialog("Ingresa el anio del libro")));
            if (libro.getAnio() == null) {
                throw new Exception("Ingresa un anio valido para el libro");
            }

            libro.setEjemplares(Integer.valueOf(JOptionPane.showInputDialog("Ingresa cuantos ejemplares se imprimieron")));
            if (libro.getEjemplares() == null) {
                throw new Exception("Ingresa un valor valido de ejemplares impresos");
            }

            libro.setEjemplaresPrestados(Integer.valueOf(JOptionPane.showInputDialog("Ingresa cuantos ejemplares se prestaron")));
            if (libro.getEjemplaresPrestados() == null) {
                throw new Exception("Ingresa un valor valido de ejemplares prestados");
            }

            libro.setEjemplaresRestante(libro.getEjemplares() - libro.getEjemplaresPrestados());

            String nombreAutor = JOptionPane.showInputDialog("Ingresa el nombre del autor de libro");
            if (nombreAutor == null || nombreAutor.trim().isEmpty()) {
                throw new Exception("Ingresa el nombre del autor");
            }
            Autor autor = daoAutor.DAOBuscarAutorNombre(nombreAutor);
            if (!autor.getNombre().equalsIgnoreCase(nombreAutor)) {
                throw new Exception("Ingresa un autor que ya se encuentre registrado en su base de datos");
            }
            libro.setAutor(autor);
            if (libro.getAutor() == null) {
                throw new Exception("No puedes insertar un libro sin autor");
            }
            String nombreEditorial = JOptionPane.showInputDialog("Ingresa el nombre de la editorial");
            if (nombreEditorial == null || nombreEditorial.trim().isEmpty()) {
                throw new Exception("Ingresa el nombre de la editorial");
            }
            Editorial editorial = daoEditorial.DAOBuscarEditorialNombre(nombreEditorial);
            if (!editorial.getNombre().equalsIgnoreCase(nombreEditorial)) {
                throw new Exception("Ingresa una editorial que ya se encuentre registrada en su base de datos");
            }
            libro.setEditorial(editorial);
            if (libro.getEditorial() == null) {
                throw new Exception("No puedes insertar un libro sin editorial");
            }

            dao.crearLibro(libro);
            System.out.println("Libro Insertado Exitosamente");

        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }

    }

    public void BuscarLibroTitulo(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingresa el nombre del libro que buscas");
            }
           Libro libro = dao.BuscarLibroTitulo(nombre);
            System.out.println("Resultado:\n" + libro.toString());

        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }

    }
    public void BuscarLibroNombreAutor(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingresa el nombre del libro que buscas");
            }
           Libro libro = dao.BusquedaLibroNombreAutor(nombre);
            System.out.println("Resultado:\n" + libro.toString());

        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }

    }
    public void BuscarLibroNombreEditorial(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingresa el nombre del libro que buscas");
            }
           Libro libro = dao.BusquedaLibroNombreEditorial(nombre);
            System.out.println("Resultado:\n" + libro.toString());

        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }

    }
    public void BuscarLibroIsbn(String isbn) throws Exception {
        try {
            if (isbn == null || isbn.trim().isEmpty()) {
                throw new Exception("Ingresa el isbn del libro que buscas");
            }
           Libro libro = dao.BusquedaLibroIsbn(isbn);
            System.out.println("Resultado:\n" + libro.toString());

        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }

    }

    public void EditarLibroNombre(String nombre) throws Exception {
        try {
            
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("Ingresa un nombre valido para el libro a Modificar");
        }
        dao.EditarLibroNombre(nombre);
            System.out.println("Modificacion Exitosa");
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }

    }

    public void ElimirLibroId(String id) throws Exception {
        try {
            
        if (id == null || id.trim().isEmpty()) {
            throw new Exception("Ingresa un nombre valido para el libro a Modificar");
        }
        dao.EliminarLibroId(id);
            System.out.println("Eliminacion Exitosa");
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
        
    }
    
    public void ImprimirListaLibros(){
        try {
            System.out.println("Resultado:");
            for (Libro x : dao.ListaLibros()) {
                System.out.println(x);
                
            }
        } catch (Exception e) {
        }
        
    }

}
