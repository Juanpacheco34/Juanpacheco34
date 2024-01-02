/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Servicios;

import Tienda.Entidades.Fabricantes;
import Tienda.Persistencia.FabricanteDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author jpach
 */
public class serviceFabricante {

    private FabricanteDAO dao = new FabricanteDAO();

//    public serviceFabricante() {
//        this.dao = new FabricanteDAO();
//    }
    public void crearFabricante(String nombre) throws Exception {

        try {

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un nombre");
            }

            if (dao.buscarFabricanteNombre(nombre) != null) {
                throw new Exception("El nombre del fabricante ya Existe -> " + nombre);

            }

            Fabricantes fabricante = new Fabricantes();
            fabricante.setNombre(nombre);
            dao.InsertarFabricante(fabricante);

        } catch (Exception e) {
            throw e;
        }
    }

    public void ModificarFabricante(String nombreActual, String nombreNuevo) throws Exception {
        try {
            if (nombreActual == null || nombreActual.trim().isEmpty()) {
                throw new Exception("El nombre del fabricante esta vacio");
            }
            if (nombreNuevo == null || nombreNuevo.trim().isEmpty()) {
                throw new Exception("Indique el nuevo nombre");
            }

            Fabricantes fabricante = dao.buscarFabricanteNombre(nombreActual);

            if (!fabricante.getNombre().equalsIgnoreCase(nombreActual)) {
                throw new Exception("El nombre que quiere cambiar no existe");
            }

            fabricante.setNombre(nombreNuevo);
            dao.ModificarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }

    public void EliminarFabricanteNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingrese un nombre valido para eliminar");
            }

            dao.EliminarFabricante(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public void BuscarFabricanteNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Ingrese un nombre valido para eliminar");
            }

            dao.buscarFabricanteNombre(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public void Consultas(String opcion) throws Exception {
        try {
            if (opcion == null || opcion.trim().isEmpty()) {
                throw new Exception("Indique el nombre del producto");
            }

            if ("7".equals(opcion)) {
                crearFabricante(JOptionPane.showInputDialog("Ingresa el nombre del Fabricante"));
            }
            if ("9".equals(opcion)) {
                ModificarFabricante(JOptionPane.showInputDialog("Ingresa el nombre del Fabricante a MODIFICAR"),JOptionPane.showInputDialog("Ingresa el nuevo nombre del Fabricante"));
            }

            dao.Consultas(opcion);
        } catch (Exception e) {
            throw e;
        }
    }
}
