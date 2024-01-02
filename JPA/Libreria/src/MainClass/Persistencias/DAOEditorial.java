/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass.Persistencias;

import MainClass.Entidades.Editorial;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 * crear buscar editar eliminar imprimir
 *
 * @author jpach
 */
public final class DAOEditorial extends DAO<Editorial> {

    public void DAOCrearEditorial(Editorial editorial) throws Exception {
        super.Guardar(editorial);

    }

    public Editorial DAOBuscarEditorialNombre(String nombre) throws Exception {
        super.ConectarDataBase();
        TypedQuery<Editorial> query = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre", Editorial.class);
        query.setParameter("nombre", nombre);
        Editorial editorial = query.getSingleResult();
        super.DesconectarDataBase();

        return editorial;

    }

    public void DAOEditarEditorialNombre(String nombre) throws Exception {
        Editorial editorial = DAOBuscarEditorialNombre(nombre);
        if (!nombre.equalsIgnoreCase(editorial.getNombre())) {
            throw new Exception("El nombre de la editorial que deseas Modificar no se encontro");

        }
        editorial.setNombre(JOptionPane.showInputDialog("Ingresa el nuevo nombre de la Editorial"));
        super.Editar(editorial);

    }

    public void DAOEliminarEditorialId(String id) throws Exception {
        super.ConectarDataBase();
        Editorial editorial = em.find(Editorial.class, Long.valueOf(id));
        super.Eliminar(editorial);
    }

    public List<Editorial> DAOListaEditoriales() throws Exception {
        List<Editorial> editorial = em.createQuery("SELECT e FROM Editorial e").getResultList();
        super.DesconectarDataBase();
        return editorial;
    }

}
