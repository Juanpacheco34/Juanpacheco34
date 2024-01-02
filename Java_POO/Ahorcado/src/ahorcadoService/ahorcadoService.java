package ahorcadoService;

import ahorcadoClass.ahorcadoClass;
import java.util.Scanner;

/**
 * @author jpach
 */
public class ahorcadoService {

    Scanner leer = new Scanner(System.in);

    public ahorcadoClass insert() {
        /* * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
        Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
        vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra 
        de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas 
        máximas, el valor que ingresó el usuario y encontradas en 0. */
        System.out.print("Ingresa la palabra adivinar: ");
        String frase = leer.nextLine().toLowerCase();

        String[] guardar = new String[frase.length()];
        String[] buscar = new String[frase.length()];

        for (int i = 0; i < buscar.length; i++) {
            for (int j = i + 1; j < i + 2; j++) {
                buscar[i] = frase.substring(i, j);
                break;

            }

        }

        int intentos = buscar.length + 2;
        int encontradas = 0;

        return new ahorcadoClass(buscar, guardar, intentos, encontradas);
    }

    public void longitud(ahorcadoClass insert) {
        /*Método longitud(): muestra la longitud de la palabra que se debe encontrar.
         * Nota: buscar como se usa el vector.length. */
        System.out.println("Longitud de la palabra: " + insert.getBuscar().length + " Letras");

    }

    public void buscar(ahorcadoClass insert) {
        /* Método buscar(letra): este método recibe una letra dada por el usuario y
         * busca si la letra ingresada es parte de la palabra o no. También informará si
         * la letra estaba o no. */
        System.out.print("Ingrese una letra a buscar: ");
        String letra = leer.nextLine();//la letra a buscar

        String[] buscar = insert.getBuscar();//guardaremos lo que tenemos en el atributo
        String[] guardar = new String[insert.getGuardar().length]; //se va a guardar la letra si se entcuentra en el vector buscar

        int s = 0; // nos va a contar cuantas veces se encontro la letra

        for (int i = 0; i < insert.getBuscar().length; i++) {
            if (!letra.equals(guardar[i])) {
                if (letra.equals(buscar[i])) {

                    guardar[i] = buscar[i];

                    s++;

                }
            }
        }
        if (s > 0) {
            System.out.println("La letra se encontro: " + s + " veces.");

        } else {
            System.out.println("No se ah encontrado la letra");
        }

        insert.setGuardar(guardar);
        insert.setEncontradas(s);

    }

    public void encontradas(ahorcadoClass insert) {
        /* Método encontradas(letra): que reciba una letra ingresada por el usuario
         * y muestre cuantas letras han sido encontradas y cuantas le faltan. Este
         * método además deberá devolver true si la letra estaba y false si la letra no
         * estaba, ya que, cada vez que se busque una letra que no esté, se le restará
         * uno a sus oportunidades.*/

        String[] guardar = insert.getGuardar();

        for (int i = 0; i < insert.getBuscar().length; i++) {
            for (int j = 1; j < insert.getBuscar().length; j++) {

                if (guardar[i] == null) {
                    System.out.print(" _ ");
                    break;
                } else {
                    System.out.print(guardar[i] + " ");
                    break;
                }

            }
        }
        System.out.println("");
        System.out.println("Encontradas,Faltantes: " + insert.getEncontradas() + "," + (insert.getBuscar().length - insert.getEncontradas()));
    }

    public void intentos(ahorcadoClass insert) {
        /* Método intentos(): para mostrar cuantas oportunidades le queda al jugador.*/
        int oportunidades = insert.getIntentos();
        System.out.println("Oportunidades: " + (oportunidades - 1));

    }

    public void juego(ahorcadoClass insert) {
        /* *  Método juego(): el método juego se encargará de llamar todos los métodos
         * previamente mencionados e informará cuando el usuario descubra toda la
         * palabra o se quede sin intentos. Este método se llamará en el main.*/

        longitud(insert);
        buscar(insert);
        encontradas(insert);
        intentos(insert);

        System.out.println("\n-----------------------------------------------------------");

        int s = 0, intentos = 1, encontradas = insert.getEncontradas(), faltantes = (insert.getBuscar().length - insert.getEncontradas()), oportunidades = insert.getIntentos() - 2;
        do {
            System.out.print("Ingrese una letra a buscar: ");
            String letra = leer.nextLine();
            longitud(insert);

            String[] buscar = insert.getBuscar();
            String[] guardar = insert.getGuardar();

            for (int i = 0; i < insert.getBuscar().length; i++) {

                if (!letra.equals(guardar[i])) {
                    if (letra.equals(buscar[i])) {

                        guardar[i] = buscar[i];

                        s++;
                    } else {

                    }
                } else {

                }

            }

            encontradas += s;
            faltantes -= s;
            
            
            
            if (s == 0) {
                System.out.println("No se ah encontrado la letra");

            } else {
                System.out.println("La letra se encontro: " + s + " veces.");
                s = 0;
            }

            for (int i = 0; i < insert.getBuscar().length; i++) {
                for (int j = 1; j < insert.getBuscar().length; j++) {

                    if (guardar[i] == null) {
                        System.out.print(" _ ");
                        break;
                    } else {
                        System.out.print(guardar[i] + " ");
                        break;
                    }

                }

            }

            System.out.println("");

            System.out.println("Encontradas,Faltantes: " + encontradas + "," + faltantes);
            System.out.println("Oportunidades: " + oportunidades--);
            intentos++;
            System.out.println("\n-----------------------------------------------------------");

        } while (insert.getIntentos() != intentos && encontradas != insert.getGuardar().length);
        
        if(encontradas == insert.getGuardar().length){
            System.out.println("Felicitaciones!!!!");
            
        }else{
            
            System.out.println("Game Over");
            String[] palabra = insert.getBuscar();
            System.out.print("La palabra es: ");
            for (int i = 0; i < insert.getBuscar().length; i++){
                System.out.print(palabra[i]);
            }
            
        }
        System.out.println("");
        {


        }

    }

}
