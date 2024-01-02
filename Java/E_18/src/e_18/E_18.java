package e_18;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author jpach
 */
public class E_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] a = new int[4][4];
        int[][] b = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                b[j][i] = a[i][j];

            }

        }
        System.out.println("\t\tMatriz A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("\t[" + a[i][j] + "]");

            }
            System.out.println("");

        }

        System.out.println("");

        System.out.println("\t\tMatriz B");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("\t[" + b[i][j] + "]");

            }
            System.out.println("");

        }

    }

}
