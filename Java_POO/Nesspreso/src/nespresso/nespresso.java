package nespresso;

import java.util.Scanner;
import nespresso.service.cafeteraService;
import nespresso.entidad.cafeteraClass;


public class nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cafeteraService cs = new cafeteraService();
        cafeteraClass cc = cs.llenarCafetera();

        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("\n");
        System.out.println("*************************");
        System.out.println("*\tCafetera\t*");
        System.out.println("*************************");
        System.out.println("¿ Que Operacion desea realizar ?");
        System.out.println("");
        System.out.println("1. Servir taza de cafe");
        System.out.println("2. Preparar Cafe");
        System.out.println("3. Vaciar Cafetera");
        System.out.println("4. Salir");
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                cs.servirTaza(cc);
                break;

            case 2:
                cs.agregarCafe(cc);
                break;
            case 3:
                cs.vaciarCafetera(cc);
                break;
            case 4:
                System.out.println("Saliendo....");
                break;
            default:
                System.out.println("Operacion Incorrecta");
        }
    }

}
