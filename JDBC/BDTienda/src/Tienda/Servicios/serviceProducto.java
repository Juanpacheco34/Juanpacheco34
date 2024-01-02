/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Servicios;

import Tienda.Entidades.Productos;
import Tienda.Persistencia.ProductoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author jpach
 */
public class serviceProducto {

    private ProductoDAO dao = new ProductoDAO();

//    public serviceProducto(ProductoDAO dao) {
//        this.dao = new ProductoDAO();
//    }
    public void crearProducto(String nombre, String precio, String codigoFabricante) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Indique el nombre del producto");
            }
            if (precio == null || precio.trim().isEmpty()) {
                throw new Exception("Indique el precio del producto");
            }
            if (codigoFabricante == null || codigoFabricante.trim().isEmpty()) {
                throw new Exception("Indique el codigoFabricante del producto");
            }

            Productos producto = new Productos();
            producto.setNombre(nombre);
            producto.setPrecio(Double.parseDouble(precio));
            producto.setCodigoFabricante(Integer.parseInt(codigoFabricante));

            dao.InsetarProductos(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    public void ModificarProductoNombre(String nombre, String nombreNuevo, String precioNuevo, String codigoFabricanteNuevo) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Indique el nombre del producto");
            }
            if (nombreNuevo == null || nombreNuevo.trim().isEmpty()) {
                throw new Exception("Indique el nuevo nombre del producto");
            }
            if (precioNuevo == null || precioNuevo.trim().isEmpty()) {
                throw new Exception("Indique el precio del producto");
            }
            if (codigoFabricanteNuevo == null || codigoFabricanteNuevo.trim().isEmpty()) {
                throw new Exception("Indique el nuevo codigoFabricante del producto");
            }

            Productos producto = dao.buscarProductoNombre(nombre);
            if (!producto.getNombre().equalsIgnoreCase(nombre)) {
                throw new Exception("No existe el producto que quiere actualizar");

            }

            producto.setNombre(nombreNuevo);
            producto.setPrecio(Double.parseDouble(precioNuevo));
            producto.setCodigoFabricante(Integer.parseInt(codigoFabricanteNuevo));

            dao.ModificarProductoNombre(producto);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void EliminarProductoCodigo(String codigo) throws Exception {
        try {
            if (codigo == null || codigo.trim().isEmpty()) {
                throw new Exception("Indique el codigo del producto a eliminar");
            }

            dao.EliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }
    }

    public void BuscarProductoNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Indique el nombre del producto");
            }

            dao.buscarProductoNombre(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public void Consultas(String opcion) throws Exception {
        try {
            if (opcion == null || opcion.trim().isEmpty()) {
                throw new Exception("Indique el nombre del producto");
            }
            
            if("6".equals(opcion)){
                crearProducto(JOptionPane.showInputDialog("Ingresa el nombre del Producto"), JOptionPane.showInputDialog("Ingresa el precio del Producto"), JOptionPane.showInputDialog("Ingresa el codigo del fabricante del Producto"));
            }
            if("8".equals(opcion)){
                ModificarProductoNombre(JOptionPane.showInputDialog("Ingresa el nombre del Producto a MODIFICAR"),JOptionPane.showInputDialog("Ingresa el nuevo nombre del Producto"), JOptionPane.showInputDialog("Ingresa el nuevo precio del Producto"), JOptionPane.showInputDialog("Ingresa el nuevo codigo del fabricante del Producto"));
                
            }


            dao.Consultas(opcion);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
