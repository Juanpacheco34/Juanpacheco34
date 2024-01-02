/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.EdificioDeOficina;
import entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author jpach
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<EdificioDeOficina> listaEdi = new ArrayList<>();
        ArrayList<Polideportivo> listaPoli = new ArrayList<>();
        EdificioDeOficina o = new EdificioDeOficina();
        Polideportivo p = new Polideportivo();
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Edificio " + (i + 1));
            o.crearEdificio();
            listaEdi.add(new EdificioDeOficina(o.getNumeroOficina(), o.getCantidadPersona(), o.getNumeroPisos(), o.getAncho(), o.getAlto(), o.getLargo()));
            p.crearPolideportivo();
            listaPoli.add(new Polideportivo(p.isTechado()));
            System.out.println("--------------------------------------");
        }
        
        int i = 0;
        for (EdificioDeOficina x : listaEdi) {
            System.out.println("\n--------------------------------------");
            System.out.println("Edificio " + (i + 1));
            x.cantidadPersona();
            x.calcularSuperficie();
            x.calcularVolumen();
            System.out.println("");
            System.out.println(listaPoli.get(i));
            i++;
            
        }
        
    }
}
