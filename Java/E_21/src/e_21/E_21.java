package e_21;

import java.util.Scanner;

class E_21 {

    /**
     * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y
     * la matriz P de 3x3, se solicita escribir un programa en el cual se
     * compruebe si la matriz P está contenida dentro de la matriz M. Para ello
     * se debe verificar si entre todas las submatrices de 3x3 que se pueden
     * formar en la matriz M, desplazándose por filas o columnas, existe al
     * menos una que coincida con la matriz P. En ese caso, el programa debe
     * indicar la fila y la columna de la matriz M en la cual empieza el primer
     * elemento de la submatriz P.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int filaG = 10, columnasG = 10, filaP = 3, columnasP = 3;
        int[][] matrizG = new int[filaG][columnasG];
        int[][] matrizP = new int[filaP][columnasP];

        for (int i = 0; i < filaG; i++) {
            for (int j = 0; j < columnasG; j++) {
                matrizG[i][j] = (int) (Math.random() * 100);

            }
        }
            for (int i = 0; i < filaP; i++) {
                for (int j = 0; j < columnasP; j++) {
                    matrizP[i][j] = (int) (Math.random() * 100);
                    
                }
                
            }

        
        System.out.println("\t\t\tMatriz 10x10");
        matrizG(matrizG);
        System.out.println("\n\n");
        System.out.println("    Matriz 3x3");
        matrizP(matrizP);
        System.out.println("");
        busqueda(matrizG,matrizP);

    }

    public static int[][] matrizG(int matrizG[][]) {
        int c;
        for (int i = 0; i < matrizG.length; i++) {
            for (int j = 0; j < matrizG.length; j++) {
                c = matrizG[i][j];
                switch(String.valueOf(c).length()){
                    case 1:
                         System.out.print("[  " + matrizG[i][j] + " ]");
                         break;
                    case 2:
                         System.out.print("[ " + matrizG[i][j] + " ]");
                }
               
            }
            System.out.println("");
        }
        return matrizG;
    }

    public static int[][] matrizP(int matrizP[][]) {
        int c;
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                c = matrizP[i][j];
                switch(String.valueOf(c).length()){
                    case 1:
                         System.out.print("[  " + matrizP[i][j] + " ]");
                         break;
                    case 2:
                         System.out.print("[ " + matrizP[i][j] + " ]");
                }
            }
            System.out.println("");
        }
        return matrizP;
    }
    
    
    public static void busqueda(int matrizG[][],int matrizP[][]){
        int fila, columna;
        boolean logica = false;
        for (int i = 0; i < matrizG.length; i++) {
            for (int j = 0; j < matrizG.length; j++) {
                
               if (matrizG[i][j] == matrizP[0][0]) {
                    fila = i;
                    columna = j;
                    //fila 1 columna 2
                    if (matrizG[i][j + 1] == matrizP[0][1]) {
                        //fila 1 columna 3
                        if (matrizG[i][j + 2] == matrizP[0][2]) {
                            //fila 2 columna 1
                            if (matrizG[i + 1][j] == matrizP[1][0]) {
                                //fila 2 columna 2
                                if (matrizG[i + 1][j + 1] == matrizP[1][1]) {
                                    //fila 2 columna 3
                                    if (matrizG[i + 1][j + 2] == matrizP[1][2]) {
                                        //fila 3 columna 1
                                        if (matrizG[i + 2][j] == matrizP[2][0]) {
                                            //fila 3 columna 2
                                            if (matrizG[i + 2][j + 1] == matrizP[2][1]) {
                                                //fila 3 columna 3
                                                if (matrizG[i + 2][j + 2] == matrizP[2][2]) {
                                                    logica = true;
                                                    System.out.println("Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:");
                                                    System.out.println("[ " + (fila) + "," + (columna) + " - " + (fila) + "," + (columna + 1) + " - " + (fila) + "," + (columna + 2) + " / " + (fila + 1) + "," + (columna) + " - " + (fila + 1) + "," + (columna + 1) + " - " + (fila + 1) + "," + (columna + 2) + " / " + (fila + 2) + "," + (columna) + " - " + (fila + 2) + "," + (columna + 1) + " - " + (fila + 2) + "," + (columna + 2) + " ]");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
        if (logica == false) {
            System.out.println("La Matriz P no se escuentra dentro de la matriz A");
        }

    }
}
