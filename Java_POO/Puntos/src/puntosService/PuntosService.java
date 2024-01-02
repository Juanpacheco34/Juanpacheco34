/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntosService;

import java.util.Scanner;
import puntosClass.PuntosClass;

/**
 *
 * @author jpach
 */
public class PuntosService {

    Scanner leer = new Scanner(System.in);

    public PuntosClass insert() {
        System.out.print("Ingrese el valor de X1: ");
        double x1 = leer.nextDouble();
        System.out.print("Ingrese el valor de Y1: ");
        double y1 = leer.nextDouble();
        System.out.print("Ingrese el valor de X2: ");
        double x2 = leer.nextDouble();
        System.out.print("Ingrese el valor de Y2: ");
        double y2 = leer.nextDouble();
        
        return new PuntosClass(x1,x2,y1,y2);
    }
    
    public void mostrarDistacia(PuntosClass insert){
        
        double p1 = insert.getX2() -  insert.getX1();
        p1 = Math.pow(p1, 2);
        double p2 =  insert.getY2() - insert.getY1();
        System.out.println(p2);
        
        double raiz = Math.sqrt((p1 + p2));
        
        System.out.println("La distacia de los puntos es de: " + raiz);
        
        
        
    }

}
