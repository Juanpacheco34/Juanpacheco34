/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass.Persistencias;


import MainClass.Entidades.Autor;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 * crear buscar editar eliminar imprimir
 *
 * @author jpach
 */
public final class DAOAutor extends DAO<Autor> {

    public void DAOCrearAutor(Autor autor){
        super.Guardar(autor);
    }

    public Autor DAOBuscarAutorNombre(String nombre) throws Exception {
        //try {
        super.ConectarDataBase();

        //Utilizamos la interfaz TypesQuery para realizar una consulta tipada en jpa
        //Consulta Tipada = se refiere a una consulta en la que se especifica el tipo de resultado esperado.
        TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre", Autor.class);//La consulta se especifica utilizando la sintaxis de JPQL y se indica que se esperan resultados de tipo Autor
        query.setParameter("nombre", nombre);//para establecer el valor de los parámetros de la consulta
        Autor autor = query.getSingleResult();// Cuando se espera un solo resultado
        super.DesconectarDataBase();
        return autor;
//} catch (Exception e) {
        //    System.err.println("Error al buscar" + e.getMessage());
        //}
    }

    public void DAOEditarAutorNombre(String nombre) throws Exception {
//        TypedQuery<Autor> query = em.createQuery("SELECT  a FROM Autor a WHERE a.nombre = :nombre",Autor.class);
//        query.setParameter("nombre", nombre);
//        Autor autor = query.getSingleResult();

//      correcion ¨
        Autor autor = DAOBuscarAutorNombre(nombre);
        if (!nombre.equalsIgnoreCase(autor.getNombre())) {
            throw new Exception("El nombre de autor que deseas Modificar no se encontro");

        }
        autor.setNombre(JOptionPane.showInputDialog("Ingresa el nuevo nombre del Libro"));

        super.Editar(autor);
        System.out.println(autor.toString());

    }

    public void DAOEliminarAutorId(String id) throws Exception {
        super.ConectarDataBase();
        Autor autor = em.find(Autor.class, Long.valueOf(id));
        super.Eliminar(autor);

    }

    public List<Autor> DAOAutores() throws Exception {
        super.ConectarDataBase();
        List<Autor> Libros = em.createQuery("SELECT a FROM Autor a").getResultList(); //Cuando se espera mas de un resultado     
        super.DesconectarDataBase();
        return Libros;
    }

}
