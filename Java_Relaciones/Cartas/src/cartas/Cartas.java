/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartas;

import cartasEntidad.Baraja;
import java.util.Arrays;

/**
 *
 * @author jpach
 */
public class Cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja mazo = new Baraja();
        mazo.barajar();
        mazo.siguienteCarta();
        mazo.cartasDisponibles();
        mazo.darCatas();
        mazo.cartasMonton();
        mazo.mostrarBaraja();
        System.out.println(mazo.toString());

    }

}
