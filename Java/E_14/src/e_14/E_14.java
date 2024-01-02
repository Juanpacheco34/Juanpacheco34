package e_14;

import java.util.Scanner;

public class E_14 {

    /**
     * Crea una aplicación que a través de una función nos convierta una
     * cantidad de euros introducida por teclado a otra moneda, estas pueden ser
     * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad
     * de euros y la moneda a converir que será una cadena, este no devolverá
     * ningún valor y mostrará un mensaje indicando el cambio (void). El cambio
     * de divisas es: 0.86 libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es
     * un 1 €
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String c;
        double m,d  = 1.06,y = 129.852,l = 0.86;
        
        System.out.println("Ingrese la cantidad de euros a convertir: ");
        m = leer.nextInt();
        System.out.println("Ingrese la divisa a converitir D para dolares, Y para yenes , L para libra  ");
        c = leer.next();
        
    
        conversion(m,d,y,l,c);
    }
    
    public static void conversion(double m,double d,double y,double l,String c){
        c = c.toUpperCase();
        switch(c){
            case "D":
                System.out.println(m + "E" + " a dolares son: " + (m*d) + "$");
                break;
            case "Y":
                System.out.println(m + "E" + " a yenes son: " + (m*y) + "Y");
                break;
            case "L":
                System.out.println(m + "E" + " a libras son: " + (m*l) + "L");
                break;
            
        }
        
        
    }

}
