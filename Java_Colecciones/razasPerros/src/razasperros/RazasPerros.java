/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razasperros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class RazasPerros {

    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de
     * tipo String. El programa pedirá una raza de perro en un bucle, el mismo
     * se guardará en la lista y después se le preguntará al usuario si quiere
     * guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
     * los perros guardados en el ArrayList.************************************
     * 2.Continuando el ejercicio anterior, después de mostrar los perros, al
     * usuario se le pedirá un perro y se recorrerá la lista con un Iterator, se
     * buscará el perro en la lista. Si el perro está en la lista, se eliminará
     * el perro que ingresó el usuario y se mostrará la lista ordenada. Si el
     * perro no se encuentra en la lista, se le informará al usuario y se
     * mostrará la lista ordenada.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        String salir = "";

        //Creamos el codigo para Insertar las razas
        do {
            System.out.print("Ingresa una raza de perros: ");
            razas.add(leer.next());

            System.out.println("Agregar mas Razas:\t(S/N)");
            salir = leer.next();
            System.out.println("_________________________________________");

        } while (!salir.equalsIgnoreCase("n"));
        {
        }
        // Muestra las razas insertadas en nuestro arrays dinamico
        razas.forEach((aux) -> System.out.println(aux));
        System.out.println("_________________________________________");

        System.out.print("Ingresa la raza que quieres eliminar: ");
        salir = leer.next(); //Reutilizamos la variable salir

        Iterator it = razas.iterator();
        while (it.hasNext()) {
            if (it.next().equals(salir)) {
                it.remove();
                salir = "1"; //Reutilizamos la variable salir para que nuestro
                //condicional if nos muestre las siguientes opciones
            }

        }
        System.out.println("_________________________________________");
        if (salir.equals("1")) {

            Collections.sort(razas);
            razas.forEach((aux) -> System.out.println(aux));

        } else {
            System.out.println("La raza no se encontro en la lista...");
            razas.forEach((aux) -> System.out.println(aux));
        }
    }

}
