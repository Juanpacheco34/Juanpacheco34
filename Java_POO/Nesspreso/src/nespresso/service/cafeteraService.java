package nespresso.service;

import nespresso.entidad.cafeteraClass;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class cafeteraService {

     Scanner leer = new Scanner(System.in);

    public cafeteraClass llenarCafetera(){
        System.out.println("Ingrese la cantidad actual de la cafetera");
        int cantidadActual = leer.nextInt();
        int capacidadMaxima = cantidadActual;

        return new cafeteraClass(cantidadActual,capacidadMaxima);
    }

    public int servirTaza(cafeteraClass llenarCafetera) {
        System.out.println("Ingrese el tamaño de su taza de cafe: ");
        int tazaCafe = leer.nextInt();
        
        
        if (tazaCafe == llenarCafetera.getCantidadActual()) {
            llenarCafetera.setCantidadActual(llenarCafetera.getCantidadActual() - tazaCafe);
            System.out.println("Se ha  llenado su taza de cafe de " + tazaCafe + "ml");
            System.out.println("Se ha acabado el cafe!!!");

        } else if (llenarCafetera.getCantidadActual() > tazaCafe) {
            System.out.println("Se ha llenado su taza de cafe de " + tazaCafe + "ml");
            llenarCafetera.setCantidadActual(llenarCafetera.getCantidadActual() - tazaCafe);
            System.out.println("La cafetera le quedan " + llenarCafetera.getCantidadActual() + "ml de cafe");

        } else {
            System.out.println("No se ha llenado su taza de cafe de " + tazaCafe + "ml");
            System.out.println("Se ha acabado el cafe!! ");
            System.out.println("A su taza de cafe le falto " + (tazaCafe - llenarCafetera.getCantidadActual()) + "ml para llenar");

        }

        return tazaCafe;

    }

    public int agregarCafe(cafeteraClass llenarCafetera) {
        System.out.println("1 gramo de cafe por 15ml de agua");
        System.out.println("Cuanto cafe desea agregar a la Cafetera: ");
        int gramo = leer.nextInt();
        int cafe = gramo * 15;
        llenarCafetera.setCantidadActual(llenarCafetera.getCantidadActual() + cafe);
        llenarCafetera.setCapacidadMaxima(cafe);
        System.out.println("la cafetera se ha llenado " + llenarCafetera.getCantidadActual() + "ml");

        return gramo;
    }
    
        public void vaciarCafetera(cafeteraClass llenarCafetera) {
        llenarCafetera.setCantidadActual(llenarCafetera.getCantidadActual() - llenarCafetera.getCantidadActual());
        System.out.println("La cafetera se ha Vaciado:  " + llenarCafetera.getCantidadActual() + "ml");

    }

}
