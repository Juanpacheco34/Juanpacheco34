/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribir un programa en Java que juegue con el usuario a adivinar un número.
 * La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
 * tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce
 * un valor, la computadora debe decirle al usuario si el número que tiene que
 * adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de
 * veces que el usuario ha intentado adivinar el número. Si el usuario introduce
 * algo que no es un número, se debe controlar esa excepción e indicarlo por
 * pantalla. En este último caso también se debe contar el carácter fallido como
 * un intento.
 *
 * @author jpach
 */
public class Adivinar {

    Scanner leer = new Scanner(System.in);
    int num = 0, numAle = (int) (Math.random() * 500 + 1),i = 0;

    public void adivinar() {
            System.out.println(numAle);
        do {
            try {
                
            System.out.println("Adivina el numero del 1 al 500");
            num = leer.nextInt();

            if(num < numAle){
                System.out.println("Ingresa un numero mayor al anterior"); 
                i++;
            }else if (num == numAle){
                i++;
            }else{
                System.out.println("Ingresa un numero menor al anterior");
                i++;
            }
            
            } 
            catch (InputMismatchException e) {
                System.err.println("Error: Ingresa un valor valido " + e.getMessage());
                i++;
                leer.nextLine();
            }

        } while (num != numAle);
        {
            System.out.println("Felicitaciones el numero es: " + numAle);
            System.out.println("Numero de intentos: " +i);
        }

    }

}
