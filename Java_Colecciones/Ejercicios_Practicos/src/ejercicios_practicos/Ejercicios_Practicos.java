package ejercicios_practicos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;

public class Ejercicios_Practicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("------ArrayList-----------");
        ArrayList<Integer> fila = new ArrayList();
        int x = 20;
        fila.add(x);
        fila.add(2);
        fila.add(3);
        fila.add(5);
        fila.add(4);

        //fila.remove(0); //Elimina por indice no por posicion ni objeto(variable)
        System.out.println(fila);

        System.out.println("------LinkedList-----------");
        LinkedList<Integer> fila0 = new LinkedList();
        int j = 10;
        fila0.add(3);
        fila0.add(2);
        fila0.add(1);
        fila0.add(4);
        fila0.add(j);

        //fila0.remove(4); //Elimina por Indice
        Collections.sort(fila0);    ////Ordenar nustra coleccion o array
        System.out.println(fila0);

        //for(Integer aux : fila0){ //ForEach
        //   System.out.println(aux.byteValue());
        //}
        System.out.println("------HashSet-----------");
        HashSet<Integer> fila1 = new HashSet();
        int y = 20;
        fila1.add(1);
        fila1.add(4);
        fila1.add(3);
        fila1.add(3);
        fila1.add(2);
        fila1.add(2);
        fila1.add(y);

        //fila1.remove(20); //Elimina lo que hay en el indice
        System.out.println(fila1);

        System.out.println("------HashMap-----------");
        HashMap<Integer, String> datos = new HashMap();
        int dni = 1002193737;
        String nom = "Juan";

        datos.put(99, "Juan");
        datos.put(100, "Juan");
        datos.put(101, "Juan");
        datos.put(102, "Juan");
        datos.put(dni, nom);

        for (Map.Entry< Integer, String> aux : datos.entrySet()) {
            System.out.println(aux.getKey() + " " + aux.getValue());

        }
        datos.remove(102); //Elimina posicion escrita
        datos.remove(dni, nom); //Elimina las variables

        System.out.println(datos);

        System.out.println("-------------------Deteccion de Errores------------------------");

        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(1, n1);
        personas.put(2, n2);

        for (Map.Entry<Integer, String> aux : personas.entrySet()) {
            System.out.println(aux.getValue());

        }
        System.out.println("-------------------Deteccion de Errores con Iterator------------------------");
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("té");
        bebidas.add("café");
        
        Collections.sort(bebidas);//Ordenar colecciones 
        
        Iterator<String> it = bebidas.iterator();
        
        //Eliminar con Iterator
        //while (it.hasNext()) {
            //if (it.next().equals("cafe")) {
              // it.remove();
            //}

        //}
        
        
        //Mostrar con Iterator
        
        while (it.hasNext()) {
            System.out.println(it.next() + " ");

        }
        System.out.println("-------------------------------------------");
    }
}
