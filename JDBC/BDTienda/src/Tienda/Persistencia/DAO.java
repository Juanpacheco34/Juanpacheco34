/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Persistencia;


import java.sql.*;


/**
 *
 * @author jpach
 */
public abstract class DAO {
    
    protected Connection connection = null;
    protected Statement statement = null;
    protected ResultSet resultset = null;
    
    private final String user = "root";
    private final String password = "Juan34241.";
    private final String database = "tienda";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    
    protected void conectarDatabase() throws ClassNotFoundException, SQLException{
        try{
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/" + database + "?useSSL=false";
            connection = DriverManager.getConnection(url, user, password);
            
            
        }catch(ClassNotFoundException | SQLException e){
            throw e;
            
        }
    }
    
    protected void desconectarDatabase() throws SQLException{
        try{
            if (resultset != null) {
                resultset.close();   
            }
            if (statement != null) {
                statement.close(); 
            }
            if (connection != null) {
                connection.close();
            }
            
        }catch(SQLException e){
            throw e;
        }
    }

    protected void insertarModificarEliminar(String sql) throws  ClassNotFoundException, SQLException{
        try {
        conectarDatabase();
        statement = connection.createStatement();
        statement.execute("SET FOREIGN_KEY_CHECKS = 0");
        statement.executeUpdate(sql);
        statement.execute("SET FOREIGN_KEY_CHECKS = 1");
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }finally{
            desconectarDatabase();
        }

    }
    
    protected void consultarDatabase(String sql) throws Exception{
        try {
            conectarDatabase();
            statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
            
            
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
        
    }
    

