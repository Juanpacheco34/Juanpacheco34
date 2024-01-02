package nifService;

import java.util.Scanner;
import nifClass.NIFClass;

/**
 *
 * @author jpach
 */
public class NIFService {

    Scanner leer = new Scanner(System.in);

    public NIFClass insert() {
        
        System.out.print("Ingrese su DNI: ");
        long dni = leer.nextLong();
        String letra = "";

        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        /*+1 es para que el contador pueda llegar al numero de la operacion ya que si no se qedaria en un 
          numero inferior y no lograria entrar en el condicional if*/
        for (int i = 0; i < (dni%23)+1; i++) {

            if (i == dni%23) {
                letra = vector[i];

            }
        }

        return new NIFClass(dni,letra);

    }

    public void mostrar(NIFClass insert) {
        System.out.println(insert.getDni() + "-" + insert.getLetra());
    }

}
