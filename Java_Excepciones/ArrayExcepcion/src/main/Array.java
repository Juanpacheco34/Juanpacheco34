/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author jpach
 */
public class Array {

    /**
     * Definir una Clase que contenga algún tipo de dato de tipo array y agregue
     * el código para generar y capturar una excepción
     * ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = new int[5];

        try {
            numeros[0] = 1;
            numeros[1] = 2;
            numeros[2] = 3;
            numeros[3] = 4;
            numeros[4] = 5;
            numeros[5] = 6;

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            System.out.println("Indice de arreglo fuera de rango");
        }
    }

}
