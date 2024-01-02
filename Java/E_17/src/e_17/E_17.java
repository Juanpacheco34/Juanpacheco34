package e_17;

import java.util.Scanner;

public class E_17 {

    /**
     * . Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int t, j = 0;

        System.out.println("Ingresa el tamaño del vector");
        t = leer.nextInt();
        int vect[] = new int[t];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = (int) (Math.random() *1002);
            System.out.println(vect[i]);
        }
        c1(vect, j);
        c2(vect, j);
        c3(vect, j);
        c4(vect, j);
        c5(vect, j);
        System.out.println("\n1 Solo Digito: " + c1(vect,j));
        System.out.println("2 Solo Digito: " + c2(vect,j));
        System.out.println("3 Solo Digito: " + c3(vect,j));
        System.out.println("4 Solo Digito: " + c4(vect,j));
        System.out.println("5 Solo Digito: " + c5(vect,j));
    }

    public static int c1(int vect[], int j) {
        int d;
        for (int i = 0; i < vect.length; i++) {
            d = vect[i];
            d = Integer.toString(d).length();

            switch (d) {
                case 1:
                    j++;
                    break;
            }
        }
        return j;

    }
    public static int c2(int vect[], int j) {
        int d;
        for (int i = 0; i < vect.length; i++) {
            d = vect[i];
            d = Integer.toString(d).length();

            switch (d) {
                case 2:
                    j++;
                    break;
            }
        }
        return j;

    }
    public static int c3(int vect[], int j) {
        int d;
        for (int i = 0; i < vect.length; i++) {
            d = vect[i];
            d = Integer.toString(d).length();

            switch (d) {
                case 3:
                    j++;
                    break;
            }
        }
        return j;

    }
    public static int c4(int vect[], int j) {
        int d;
        for (int i = 0; i < vect.length; i++) {
            d = vect[i];
            d = Integer.toString(d).length();

            switch (d) {
                case 4:
                    j++;
                    break;
            }
        }
        return j;

    }
    public static int c5(int vect[], int j) {
        int d;
        for (int i = 0; i < vect.length; i++) {
            d = vect[i];
            d = Integer.toString(d).length();

            switch (d) {
                case 5:
                    j++;
                    break;
            }
        }
        return j;

    }

}
