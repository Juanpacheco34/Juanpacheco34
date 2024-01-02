/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import cuenta.entidades.cuentaBancaria;
import cuenta.servicio.servicioCuentas;
import java.util.Scanner;

/**
 * @author jpach
 */
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioCuentas SV = new servicioCuentas();
        cuentaBancaria CB = SV.crearCuenta();

        Scanner leer = new Scanner(System.in);
        int opcion;
        String salida = "N";

        do {
            System.out.println("\n");
            System.out.println("*******************");
            System.out.println("*Cajero Automatico*");
            System.out.println("*******************");
            System.out.println("¿ Que Operacion desea realizar ?");
            System.out.println("");
            System.out.println("1. Ingresar Dinero a la Cuenta");
            System.out.println("2. Retirar");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos de la Cuenta");
            System.out.println("6. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    SV.ingreso(CB);
                    System.out.println("Cerrar Sesion : S/N");
                    salida = leer.next();
                    break;
                case 2:
                    SV.retirar(CB);
                    System.out.println("Cerrar Sesion : S/N");
                    salida = leer.next();
                    break;
                case 3:
                    SV.extracionRapida(CB);
                    System.out.println("Cerrar Sesion : S/N");
                    salida = leer.next();
                    break;
                case 4:
                    SV.consultarSaldo(CB);
                    System.out.println("Cerrar Sesion : S/N");
                    salida = leer.next();
                    break;
                case 5:
                    SV.consultarDatos(CB);
                    System.out.println("Cerrar Sesion : S/N");
                    salida = leer.next();
                    break;
                case 6:
                    System.out.println("Cerrando Sesion.....");
                    break;

                default:
                    System.out.println("Opcion no disponible.. Intente otra vez");
                    System.out.println("Cerrar Sesion : S/N");
                    salida = leer.next();
                    break;
            }

        } while (opcion != 6 && !"S".equalsIgnoreCase(salida));

        if (salida.equalsIgnoreCase("S")) {
            System.out.println("Cerrando Sesion......");
        }

    }

}
