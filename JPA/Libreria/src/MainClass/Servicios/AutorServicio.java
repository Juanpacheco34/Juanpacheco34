/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass.Servicios;

import MainClass.Entidades.Autor;
import MainClass.Persistencias.DAOAutor;
import java.util.List;

/**
 * crear buscar editar eliminar imprimir
 *
 * @author jpach
 */
public class AutorServicio {

    private final DAOAutor dao = new DAOAutor();

    public void CrearAutor(String nombre) throws Exception {
        Autor autor = new Autor();

        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingrese el nombre del autor");
            }
            autor.setNombre(nombre);
            dao.DAOCrearAutor(autor);
            System.out.println("Autor Insertado con exito");

        } catch (Exception e) {
            System.out.println("Error del sistema: " + e.getMessage());
            throw e;
        }

    }

    public void BuscarAutorNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingrese el nombre del autor que busca");
            }
            Autor autor = dao.DAOBuscarAutorNombre(nombre);
            System.out.println("resultados:\n" + autor.toString());

        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    public void EditarAutorNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingrese el nombre del autor que quiere Modificar");
            }
            dao.DAOEditarAutorNombre(nombre);
            System.out.println("Modificacion Exitosa");
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    public void EliminarAutorId(String id) throws Exception {
        try {
            if (id == null || id.trim().isEmpty()) {
                throw new Exception("Ingrese el id del autor que desea Eliminar");
            }
            dao.DAOEliminarAutorId(id);
            System.out.println("Eliminacion Exitosa");
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    public void ImprimirListaAutores() throws Exception {
        try {
            System.out.println("Autores Registrados:");
            List<Autor> lista = dao.DAOAutores();
            lista.forEach((x)-> System.out.println(x));
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }
}
