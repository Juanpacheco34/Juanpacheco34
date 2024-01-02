/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainClass.Persistencias;

/**
 *
 * @author jpach
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jpach
 * @param <T>
 */
public class DAO<T> {

    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
    protected EntityManager em = emf.createEntityManager();

// Este código crea una nueva instancia de EntityManager 
// llamando al método createEntityManager() de EntityManagerFactory.
    protected void ConectarDataBase() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();

        }
    }

// em.close(): Es un método de la clase EntityManager 
// que cierra la conexión del EntityManager y 
// libera los recursos asociados.
    protected void DesconectarDataBase() {
        if (em.isOpen()) {
            em.close();
        }
    }
    
// se encarga de guardar un objeto en la base de datos. Primero,
// se asegura de tener una conexión activa llamando al método conectar().
// Luego, inicia una transacción, guarda el objeto en la base de datos mediante persist(),
// confirma la transacción y finalmente cierra la conexión llamando a desconectar().
    protected void Guardar(T objeto){
        ConectarDataBase();
        em.getTransaction().begin();
        em.persist(objeto);//Este código realiza la operación de persistencia para guardar el objeto en la base de datos.
        em.getTransaction().commit();
        DesconectarDataBase();
   
    }
    
    protected void Editar(T objeto){
        ConectarDataBase();
        em.getTransaction().begin(); //se pueden realizar operaciones como guardar, actualizar o eliminar entidades.
        em.merge(objeto); //se encarga de actualizar un objeto existente en la base de datos
        em.getTransaction().commit(); // Este código confirma la transacción en el EntityManager, 
        //lo que significa que los cambios realizados en la base de datos se sincronizan y se hacen permanentes.
        DesconectarDataBase();
    }
    
    protected void Eliminar(T objeto){
        ConectarDataBase();
        em.getTransaction().begin();
        em.remove(objeto);//Este código realiza la operación de eliminación en la base de datos utilizando el método remove() del EntityManager.
        em.getTransaction().commit();
        DesconectarDataBase();
    }
}
