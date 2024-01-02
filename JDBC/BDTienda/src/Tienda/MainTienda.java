/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tienda;

import Tienda.Servicios.serviceFabricante;
import Tienda.Servicios.serviceProducto;
import javax.swing.JOptionPane;
import Tienda.Persistencia.ProductoDAO;

public class MainTienda {

    public static void main(String[] args) throws Exception {
        serviceFabricante sf = new serviceFabricante();
        serviceProducto sp = new serviceProducto();
        ProductoDAO  pd = new ProductoDAO();
        

////        Insertamos Fabricante
//        try {
//
//            sf.crearFabricante("Apple");
//            System.out.println("Fabricante creado con Exito");
//
//        } catch (Exception e) {
//            System.out.println("Fabricante no fue creado con Exito");
//            System.err.println("Error: " + e.getMessage());
//        }
//
////        Insertamos Producto
//        try {
//
//            sp.crearProducto("Iphone 12", "859.0", "10");
//            System.out.println("Producto creado con Exito");
//
//        } catch (Exception e) {
//            System.out.println("Fabricante no fue creado con Exito");
//            System.err.println("Error: " + e.getMessage());
////            e.printStackTrace();
//        }
//        
////        Actualizar Fabricante
//        try {
//            //Sin Funcionar
//            sf.ModificarFabricante("Apple", "Manzana");
//            System.out.println("Fabricante actualizado con exito");
//            
//        } catch (Exception e) {
//            System.out.println("Fabricante no fue Actualizado con Exito");
//            System.err.println("Error: " + e.getMessage());
//        }
//        
////        Actualizar Producto
//        try {
//
////            nombre,nombreNuevo, precioNuevo, codigoFabricanteNuevo
//            sp.ModificarProductoNombre("Impresora HP Laserjet Pro M26nw","Impresora HP Laserjet Pro M26nw", "280", "3");
//            
//            System.out.println("Fabricante actualizado con exito");
//            
//        } catch (Exception e) {
//            System.out.println("Producto no fue Actualizado con Exito");
//            System.err.println("Error: " + e.getMessage());
//        }
//          Eliminar Fabricante
//        try {
//            sf.EliminarFabricanteNombre("huawei");
//            System.out.println("Fabricante Eliminado");
//        } catch (Exception e) {
//            System.err.println("Fabricante no se Elimino \n" + e.getMessage());
//            
//        }
//        Eliminar Producto
//        try { 
//            //Eliminar por Codigo
//            sp.EliminarProductoCodigo("12");
//            System.out.println("Producto Eliminado");
//        } catch (Exception e) {
//            System.err.println("Producto no se Elimino \n" + e.getMessage());
//            
//        }

        try {
            String op = null;
        do {
            sp.Consultas("ADMIN");
            op = JOptionPane.showInputDialog("""
                                             Elija su Consulta:
                                             1.  nombres de los Productos
                                             2.  nombres y precios de los productos
                                             3.  productos que su precio esté entre 120 y 202
                                             4.  Buscar todos los Portátiles
                                             5.  nombre y el precio del producto más barato
                                             6.  Ingresar un producto a la base de datos
                                             7.  Ingresar un fabricante a la base de datos
                                             8.  Editar un producto con datos a elección.
                                             9.  Editar un fabricante con datos a elección.
                                             10. Eliminar Producto
                                             11. Eliminar Fabricante
                                             12. SALIR""");
            
            switch(Integer.parseInt(op)){
                case 1 -> sp.Consultas(op);
                case 2 -> sp.Consultas(op);
                case 3 -> sp.Consultas(op);
                case 4 -> sp.Consultas(op);
                case 5 -> sp.Consultas(op);
                case 6 -> sp.Consultas(op);
                case 7 -> sf.Consultas(op);
                case 8 -> sp.Consultas(op);
                case 9 -> sf.Consultas(op);
                case 10 -> sp.EliminarProductoCodigo(JOptionPane.showInputDialog("Ingresa el codigo del Producto a Eliminar"));
                case 11 -> sf.EliminarFabricanteNombre(JOptionPane.showInputDialog("Ingresa el nombre del fabricante a Eliminar"));
                case 12 -> System.out.println("GOOD BYE");
                default -> System.out.println("INGRESA UNA OPCION CORRECTA");
                
            }
            System.out.println("");
        } while (!"12".equals(op));
            
        } catch (Exception e) {
        }
        

    }

}
