/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import service.alquilerService;

/**
 *
 * @author jpach
 */
public class Start {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        alquilerService as = new alquilerService();
        int opcion = 0;

        System.out.println("Registro de Alquiler de Barcos");
        do {
            System.out.println("Ingrese el barco a registrar: ");
            System.out.println("1. Velero");
            System.out.println("2. Barco con Motor");
            System.out.println("3. Yate de lujo");
            System.out.println("4. Salir.");

            System.out.print("Ingrese Opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    as.alquilerVelero();
                    break;
                case 2:
                    as.alquilerBarcoMotor();
                    break;
                case 3:
                    as.alquilerYate();
                    break;
            }
            
        } while (opcion != 4);
        {
            as.registro();
        }

    }
}
