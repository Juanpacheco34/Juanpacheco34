/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass.Servicios;

import MainClass.Entidades.Editorial;
import MainClass.Persistencias.DAOEditorial;
import java.util.List;

/**
 * crear buscar editar eliminar imprimir
 *
 * @author jpach
 */
public class EditorialServicio {

    private final DAOEditorial dao = new DAOEditorial();

    public void CrearEditorial(String nombre) throws Exception {
        Editorial editorial = new Editorial();
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingrese un nombre");
            }

            editorial.setNombre(nombre);
            dao.DAOCrearEditorial(editorial);
            System.out.println("Editorial insertado Exitosamente");
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    public void BuscarEditorialNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingresa el nombre de la editorial que buscas");

            }

            Editorial editorial = dao.DAOBuscarEditorialNombre(nombre);
            System.out.println("Resultado:\n" + editorial.toString());
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    public void EditarEditorialNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingresa el nombre de la editorial que deseas Modificar");
            }
            dao.DAOEditarEditorialNombre(nombre);
            System.out.println("Modificacion Exitosa");

        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }

    }

    public void EliminarEditorialId(String id)throws Exception{
        try {
            if(id == null || id.trim().isEmpty()){
                throw new Exception("Ingresa el id de la editorial que deseas Eliminar");
            }
            
            dao.DAOEliminarEditorialId(id);
            System.out.println("Eliminacion Exitosa");
        } catch (Exception e) {
        }
    }
    
    public void ImprimirListaEditorial()throws Exception{
        try {
            for(Editorial x : dao.DAOListaEditoriales()){
                System.out.println(x);
                
            }
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

}
