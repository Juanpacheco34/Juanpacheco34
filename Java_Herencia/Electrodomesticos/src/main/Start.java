/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;
import operaciones.electrodomesticos;
import operaciones.lavadora;
import operaciones.televisor;

/**
 *
 * @author jpach
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        lavadora lv = new lavadora();
        lv.crearLavadora();
        System.out.println(lv.toString());
        

        televisor tv = new televisor();
        tv.crearTelevisor();
        System.out.println(tv.toString());


//Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
//electrodomésticos, 2000 para lavadora y 5000 para televisor

        List<electrodomesticos> listaElec = new ArrayList<>();
        electrodomesticos elec = new electrodomesticos();
        int valorTotal = 0;

        for (int i = 0; i < 4; i++) {
            String[] nombre = {"Lavadora", "Televisor"};
            elec.crearElectrodomesticos();
            elec.precioFinal();

            listaElec.add(new electrodomesticos(nombre[(int) (Math.random() * nombre.length)], elec.getPrecio(), elec.getColor(), elec.getConsumo(), elec.getPeso()));
            System.out.println(listaElec.get(i));
            valorTotal += listaElec.get(i).getPrecio();
        }
        
        System.out.println("\n\nValor Total: " + valorTotal);
//
  }

}
