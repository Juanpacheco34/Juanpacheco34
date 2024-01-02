/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass.Persistencias;

import MainClass.Entidades.Libro;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 * crear buscar editar eliminar imprimir
 *
 * @author jpach
 */
public final class DAOLibro extends DAO<Libro> {

    public void crearLibro(Libro libro) {
        super.Guardar(libro);
    }

    public Libro BuscarLibroTitulo(String titulo) throws Exception {
        super.ConectarDataBase();
        TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo", Libro.class);
        query.setParameter("titulo", titulo);
        Libro libro = query.getSingleResult();
        super.DesconectarDataBase();
        return  libro;
    }

    public void EditarLibroNombre(String nombre) throws Exception {
        Libro libro = BuscarLibroTitulo(nombre);
        libro.setTitulo(JOptionPane.showInputDialog("Ingrese el nuevo Titulo del libro"));
        libro.setAnio(Integer.valueOf(JOptionPane.showInputDialog("Ingrese el nuevo anio del libro")));
        libro.setEjemplares(Integer.valueOf(JOptionPane.showInputDialog("Ingrese la nueva cantidad de ejemplares del libro")));
        libro.setEjemplaresPrestados(Integer.valueOf(JOptionPane.showInputDialog("Ingrese cuantos ejemplares del libro hay prestados actualmente")));
        libro.setEjemplaresRestante((libro.getEjemplares() - libro.getEjemplaresPrestados()));

        super.Editar(libro);

    }
    
    public Libro BusquedaLibroIsbn(String isbn){
        Libro libro = em.find(Libro.class, Long.valueOf(isbn));
        return libro;
    }
    
    public Libro BusquedaLibroNombreAutor(String nombre){
        TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre = :nombre",Libro.class).setParameter("nombre", nombre);
        Libro libro = query.getSingleResult();
        return libro;
    }
    public Libro BusquedaLibroNombreEditorial(String nombre){
        TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l JOIN l.editorial a WHERE a.nombre = :nombre",Libro.class).setParameter("nombre", nombre);
        Libro libro = query.getSingleResult();
        return libro;
    }

    public void EliminarLibroId(String Id) throws Exception {
        Libro libro = em.find(Libro.class, Long.valueOf(Id));
        super.Eliminar(libro);
    }
    
    public List<Libro> ListaLibros(){
        super.ConectarDataBase();
        List<Libro> libro = em.createQuery("SELECT l FROM Libro l").getResultList();
        super.DesconectarDataBase();
        return libro;
    }
}
