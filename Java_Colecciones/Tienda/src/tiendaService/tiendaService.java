package tiendaService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import tiendaClass.tiendaClass;

/**
 * Estas las realizaremos en el servicio. Como, introducir un elemento,
 * modificar su precio, eliminar un producto y mostrar los productos que tenemos
 * con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del
 * producto y de valor el precio. Realizar un menú para lograr todas las
 * acciones previamente mencionadas.
 *
 * @author jpach
 */
public class tiendaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, tiendaClass> inventario = new HashMap();
    String salir = "";

    public void insertproductos() {

        System.out.println("\tInventario\n\n");
        do {
            System.out.print("Ingrese el Id del producto: ");
            int id = leer.nextInt();
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = leer.next();
            System.out.print("Ingrese el precio del producto: ");
            int precio = leer.nextInt();
            System.out.print("Ingrese cuantas unidades desea registrar: ");
            int cantidad = leer.nextInt();
            int valorTotal = (precio * cantidad);

            System.out.print("Ingresar otro producto(S/N): ");
            salir = leer.next();

            inventario.put(id, new tiendaClass(id, nombre, precio, cantidad, valorTotal));
        } while (!salir.equalsIgnoreCase("n"));
        {
            System.out.println("\n\tProductos Ingresados");
            for (Map.Entry<Integer, tiendaClass> aux : inventario.entrySet()) {
                System.out.println(aux.getValue());
            }

            //Iterator para HashMap
//            Iterator<Entry<Integer,tiendaClass>> it = inventario.entrySet().iterator();
//            while(it.hasNext()){
//                Entry<Integer,tiendaClass> entry = it.next();
//                System.out.println(entry.getValue());
//                
//            }
        }
    }

    public void modificarPrecio() {
        System.out.println("\n\tActualizar Precio");
        System.out.print("Ingrese el ID del producto: ");
        int id = leer.nextInt();

        Iterator<Entry<Integer, tiendaClass>> it = inventario.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Integer, tiendaClass> aux = it.next();
            if (aux.getKey().equals(id)) {
                tiendaClass actualizar = aux.getValue();
                System.out.println(aux.getValue() + "\nIngresa el nuevo precio del producto: ");
                actualizar.setPrecio(leer.nextInt());
                actualizar.setValorTotal(actualizar.getPrecio() * actualizar.getCantidad());
                System.out.println("\tActualizacion Exitosa!!\n" + aux.getValue());
            }
        }

    }
    
    public void eliminarProducto(){
        System.out.println("\n\tEliminar Producto");
        System.out.print("Ingrese el ID del producto: ");
        int id = leer.nextInt();
        
        Iterator <Entry<Integer,tiendaClass>> it = inventario.entrySet().iterator();
        while(it.hasNext()){
            Entry<Integer,tiendaClass> aux = it.next();
            if(aux.getKey().equals(id)){
                it.remove();
            }
        }
        System.out.println("\n\tProductos");
        //ForEach para HashMap en 1 sola linea
        inventario.entrySet().forEach((aux) -> System.out.println(aux));
}
}
