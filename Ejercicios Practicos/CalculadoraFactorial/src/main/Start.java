package main;

import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author jpach
 */
public class Start {

    /**
     * Ejercicio: Calculadora de factorial Descripción: Escribe un programa en
     * Java que solicite al usuario ingresar un número entero no negativo y
     * calcule su factorial.
     *
     * El factorial de un número entero no negativo N se define como el producto
     * de todos los números enteros positivos desde 1 hasta N. Por ejemplo, el
     * factorial de 5 (representado como 5!) es igual a 1 * 2 * 3 * 4 * 5 = 120.
     *
     * Pasos para resolver el ejercicio:
     *
     * Solicitar al usuario que ingrese un número entero no negativo. Leer el
     * número ingresado por el usuario y almacenarlo en una variable. Verificar
     * si el número ingresado es negativo. Si es negativo, mostrar un mensaje de
     * error y solicitar nuevamente al usuario que ingrese un número válido.
     * Repetir este paso hasta que se ingrese un número no negativo. Implementar
     * una función para calcular el factorial del número ingresado. Puedes
     * utilizar un bucle (por ejemplo, un bucle for) para multiplicar todos los
     * números desde 1 hasta el número ingresado. Mostrar el resultado del
     * factorial en la pantalla
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num =0,fact =1;
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero positivo: "));
            
            System.out.print((num <= 0)? "Ingresa un numero mayor a 0" : "");
            
        }while(num <= 0);
        
        for (int i = 0; i < num; i++) {
            fact = fact * (i+1) ;            
        }
        
        System.out.println("El factorial de " + num + " es: " + fact);
    }

}
