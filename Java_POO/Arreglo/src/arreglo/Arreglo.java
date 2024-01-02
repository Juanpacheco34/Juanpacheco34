package arreglo;

import java.text.DecimalFormat;

/**
 *
 * @author jpach
 */
public class Arreglo {

    /**
     * Realizar un programa en Java donde se creen dos arreglos: el primero será
     * un arreglo A de 50 números reales, y el segundo B, un arreglo de 20
     * números, también reales. El programa deberá inicializar el arreglo A con
     * números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe
     * ordenar de menor a mayor y copiar los primeros 10 números ordenados al
     * arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el
     * valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
     * elementos y el combinado de 20.
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] arregloA = new double[50], arregloB = new double[20];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 100;
            if (i >= 10) {
                System.out.println("arregloA " + i + " [ " + arregloA[i] + " ] ");
            } else {
                System.out.println("arregloA  " + i + " [ " + arregloA[i] + " ] ");
            }
        }
        System.out.println("\n\n\n");
        for (int j = 0; j < arregloB.length; j++) {
            arregloB[j] = arregloA[j];
            if (j >= 10) {
                System.out.println("arregloA " + j + " [ " + arregloA[j] + " ] ");
            } else {
                System.out.println("arregloA  " + j + " [ " + arregloA[j] + " ] ");
            }
        }

        System.out.println("\n\n\n ");
        menorMayor(arregloA, arregloB);

    }

//Ordenando de menor a mayor con el metodo Burbuja
    public static void menorMayor(double[] arregloA, double[] arregloB) {
        //Dcimal Format para limitar los decimales 0 cantidad de decimales
        DecimalFormat df = new DecimalFormat("#.0");

        double aux;
        for (int i = 0; i < arregloA.length; i++) {
            for (int j = 0; j < arregloA.length - 1; j++) {
                if (arregloA[j] > arregloA[j + 1]) {
                    aux = arregloA[j + 1];
                    arregloA[j + 1] = arregloA[j];
                    arregloA[j] = aux;
                }

            }

        }
        System.out.println("Arreglo \"A\" ordenado de Menor a Mayor: ");
        for (int i = 0; i < arregloA.length; i++) {
            if (i >= 10) {
                System.out.println("arregloA " + i + " [ " + arregloA[i] + " ] ");
            } else {
                System.out.println("arregloA  " + i + " [ " + arregloA[i] + " ] ");
            }

        }
        System.out.println("\n\nArreglo \"B\" ordenado de Menor a Mayor: ");
        for (int i = 0; i < arregloB.length / 2; i++) {
            arregloB[i] = arregloA[i];
            if (i >= 10) {
                System.out.println("arregloB " + i + " [ " + arregloB[i] + " ] ");
            } else {
                System.out.println("arregloB  " + i + " [ " + arregloB[i] + " ] ");
            }
        }

        for (int i = arregloB.length / 2; i < arregloB.length; i++) {
            arregloB[i] = arregloA[i];
            if (i >= 10) {
                // objeto df para limitar los decimales
                System.out.println("arregloB " + i + " [ " + df.format(arregloB[i]) + " ] ");
            } else {
                System.out.println("arregloB  " + i + " [ " + df.format(arregloB[i]) + " ] ");
            }
        }
    }
}

//Ordenando de menor a mayor con arrays.sort()
/*
public static void menorMayor(double[] arregloA) {
        Arrays.sort(arregloA);
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("arregloA " + i + " [ " + arregloA[i] + " ] ");

            }

        }

    }
 */
