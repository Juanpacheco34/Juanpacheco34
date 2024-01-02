/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Persistencia;

import Tienda.Entidades.Productos;

/**
 *
 * @author jpach
 */
public final class ProductoDAO extends DAO {

    public void InsetarProductos(Productos producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("El producto no puede ser null");
            }

            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante)" + "VALUES ( '"
                    + producto.getCodigo() + "', '" + producto.getNombre() + "', '" + producto.getPrecio()
                    + "', '" + producto.getCodigoFabricante() + "');";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void ModificarProductoNombre(Productos producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Producto es null");
            }

            String sql = ("UPDATE Producto SET " + "nombre = '" + producto.getNombre() + "', precio = "
                    + producto.getPrecio() + ", codigo_fabricante = " + producto.getCodigoFabricante()
                    + " WHERE codigo = " + producto.getCodigo() + ";");
            System.out.println("Modificacion Exitosa!!");
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void EliminarProducto(String codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Producto es null");
            }

            String sql = ("DELETE FROM producto WHERE codigo = '" + Integer.valueOf(codigo) + "';");

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Productos buscarProductoNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM producto " + "WHERE nombre = '" + nombre + "'";
            consultarDatabase(sql);

            Productos producto = null;
            while (resultset.next()) {
                producto = new Productos();

                producto.setCodigo(resultset.getInt("codigo"));
                producto.setNombre(resultset.getString("nombre"));
                producto.setPrecio(resultset.getInt("precio"));
                producto.setCodigoFabricante(resultset.getInt("codigo_fabricante"));
            }
            desconectarDatabase();
            return producto;
        } catch (Exception e) {
            desconectarDatabase();
            throw e;
        }
    }

    public void Consultas(String opcion) throws Exception {
        try {
            if ("ADMIN".equalsIgnoreCase(opcion)) {
                String sql = "SELECT * FROM producto;";
                consultarDatabase(sql);
                while (resultset.next()) {
                    Productos producto = new Productos();

                    producto.setCodigo(resultset.getInt("codigo"));
                    producto.setNombre(resultset.getString("nombre"));
                    producto.setPrecio(resultset.getDouble("precio"));
                    producto.setCodigoFabricante(resultset.getInt("codigo_fabricante"));

                    System.out.println(producto.getCodigo() + " " + producto.getNombre() + " " + producto.getPrecio() + " " + producto.getCodigoFabricante());
                }
            }
//            Primera consulta
                if ("1".equals(opcion)) {
                    String sql = "SELECT nombre FROM producto";
                    consultarDatabase(sql);
                    while (resultset.next()) {
                        Productos producto = new Productos();
                        producto.setNombre(resultset.getString("nombre"));
                        System.out.println(producto.getNombre());
                    }
                }

//            Segunda consulta
                if ("2".equals(opcion)) {
                    String sql = "SELECT nombre,precio FROM producto";
                    consultarDatabase(sql);
                    while (resultset.next()) {
                        Productos producto = new Productos();
                        producto.setNombre(resultset.getString("nombre"));
                        producto.setPrecio(resultset.getDouble("precio"));
                        System.out.println(producto.getNombre() + " " + producto.getPrecio());
                    }
                }

                if ("3".equals(opcion)) {
                    String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202;";
                    consultarDatabase(sql);
                    while (resultset.next()) {
                        Productos producto = new Productos();

                        producto.setCodigo(resultset.getInt("codigo"));
                        producto.setNombre(resultset.getString("nombre"));
                        producto.setPrecio(resultset.getDouble("precio"));
                        producto.setCodigoFabricante(resultset.getInt("codigo_fabricante"));

                        System.out.println(producto.getCodigo() + " " + producto.getNombre() + " " + producto.getPrecio() + " " + producto.getCodigoFabricante());
                    }

                }

                if ("4".equals(opcion)) {
                    String sql = "SELECT * FROM producto WHERE nombre LIKE '%portatil%';";
                    consultarDatabase(sql);
                    while (resultset.next()) {
                        Productos producto = new Productos();

                        producto.setCodigo(resultset.getInt("codigo"));
                        producto.setNombre(resultset.getString("nombre"));
                        producto.setPrecio(resultset.getDouble("precio"));
                        producto.setCodigoFabricante(resultset.getInt("codigo_fabricante"));

                        System.out.println(producto.getCodigo() + " " + producto.getNombre() + " " + producto.getPrecio() + " " + producto.getCodigoFabricante());
                    }
                }

                if ("5".equals(opcion)) {
                    String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1;";
                    consultarDatabase(sql);
                    while (resultset.next()) {
                        Productos producto = new Productos();

                        producto.setCodigo(resultset.getInt("codigo"));
                        producto.setNombre(resultset.getString("nombre"));
                        producto.setPrecio(resultset.getDouble("precio"));
                        producto.setCodigoFabricante(resultset.getInt("codigo_fabricante"));

                        System.out.println(producto.getCodigo() + " " + producto.getNombre() + " " + producto.getPrecio() + " " + producto.getCodigoFabricante());
                    }
                }

                desconectarDatabase();
            }catch (Exception e) {
            desconectarDatabase();
            throw e;
        }

        }
    }
