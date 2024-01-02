package e_11;

import java.util.Scanner;

/**
 *
 * @author free
 */
public class E_11 {

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y
     * muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
     * Multiplicar 4. Dividir 5. Salir Elija opción: El usuario deberá elegir
     * una opción y el programa deberá mostrar el resultado por pantalla y luego
     * volver al menú. El programa deberá ejecutarse hasta que se elija la
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
     * vez de salir del programa directamente, se debe mostrar el siguiente
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
     * contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2, opcion;
        String r = "n";

        do {
            System.out.println("Ingresa el primer valor: ");
            num1 = leer.nextInt();
            System.out.println("Ingresa el segundo valor: ");
            num2 = leer.nextInt();
            System.out.println("Ingresa la Operacion que deseas realizar: ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de su Suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de su Resta es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("El resultado de su Multiplicacion es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("El resultado de su Division es: " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    r = leer.nextLine();
                    break;

                default:
                    System.out.println("Opcion Incorrecta Ingrese una opcion valida..");
            }

            if (opcion == 5) {
                r = leer.nextLine();
            }
        } while ("n".equalsIgnoreCase(r));
        {
            if ("s".equalsIgnoreCase(r)) {
                System.out.println("Ha Finalizado el programa Correctamente");
            }

        }

    }

}
