package e_10;
import  java.util.Scanner;

public class E_10 {

    /*
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a
     * continuación solicite números al usuario hasta que la suma de los números
     * introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese un valor Limite positivo: ");
        int num = leer.nextInt();
        int num2 = 0;
        
        while (num2 < num){
            System.out.print("Ingrese un valor: ");
            num2 += num2 = leer.nextInt();
            
            
        }
        System.out.println("Valor Limite: " + num);
        System.out.println("Valor de la sumatoria: " + num2);
       
    }

}
