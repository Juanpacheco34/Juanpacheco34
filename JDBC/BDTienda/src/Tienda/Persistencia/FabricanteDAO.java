/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Persistencia;

import Tienda.Entidades.Fabricantes;
import java.sql.*;

/**
 *
 * @author jpach
 */
public final class FabricanteDAO extends DAO {

    public void InsertarFabricante(Fabricantes fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("El producto no puede ser null");
            }
            String sql = "INSERT INTO Fabricante (codigo,nombre)" + "VALUES ('" + fabricante.getCodigo() + "', '" + fabricante.getNombre() + "');";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarDatabase();
        }
    }

    public void ModificarFabricante(Fabricantes fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Producto es null");
            }
            conectarDatabase();
            String sql = "UPDATE fabricante SET nombre = ? WHERE codigo = ? ";
            PreparedStatement sp = connection.prepareStatement(sql);
            sp.setString(1, fabricante.getNombre());
            sp.setInt(2, fabricante.getCodigo());
            sp.executeUpdate();
            
            System.out.println("Modificacion Exitosa");
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarDatabase();
        }
    }

    public void EliminarFabricante(String nombre) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Producto es null");
            }

            String sql = "DELETE FROM fabricante WHERE nombre = '" + nombre + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricantes buscarFabricanteNombre(String nombre) throws Exception {
        try {
            String sql = "SELECT * FROM fabricante " + "WHERE nombre = '" + nombre + "'";
            consultarDatabase(sql);

            Fabricantes fabricante = null;
            while (resultset.next()) {
                fabricante = new Fabricantes();

                fabricante.setCodigo(resultset.getInt("codigo"));
                fabricante.setNombre(resultset.getString("nombre"));

            }

            desconectarDatabase();
            return fabricante;

        } catch (Exception e) {
            desconectarDatabase();
            throw e;

        }
    }

    public void Consultas(String opcion) throws Exception {
        try {

            desconectarDatabase();
        } catch (SQLException e) {
            desconectarDatabase();
            throw e;
        }

    }
}
