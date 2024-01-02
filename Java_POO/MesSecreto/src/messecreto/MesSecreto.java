package messecreto;
import java.util.Scanner;

/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings
 * que contenga los doce meses del año, en minúsculas. A continuación, declara
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array
 * (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que
 * adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo
 * hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de
 * ejecución del programa podría ser este: Adivine el mes secreto. Introduzca el
 * nombre del mes en minúsculas: febrero No ha acertado. Intente adivinarlo
 * introduciendo otro mes: agosto ¡Ha acertado!
 *
 * @author jpach
 */
public class MesSecreto {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        String meses[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String mesesSecretos = meses[(int)(Math.random()*12)];
        System.out.print("Adivina el mes secreto: ");
        String mesSecreto = leer.next().toLowerCase();
        
        
        
       if (mesSecreto.equals(mesesSecretos)){
           
           System.out.println(mesSecreto + " Ha acertado...");
           System.out.println("Respuesta: " + mesesSecretos);
            
        }else{
           
           System.out.println(mesSecreto + " No ha acertado...");
           System.out.println("Respuesta: " + mesesSecretos);
       }
    }

}
