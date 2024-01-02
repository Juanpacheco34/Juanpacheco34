package e_12;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 */
public class E_12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Codigos: ");
        String frase;
        int corr = 0;
        int incor = -1;
        do {
            frase = leer.nextLine();
            if ("X".equals(frase.substring(0, 1)) && "O".equals(frase.substring(4, 5)) && frase.length() == 5) {
                corr += 1;
            } else {
                incor += 1;
            }

        } while (!("&&&&&".equals(frase)));

        System.out.println("la cantidad de codigos correctos es: " + corr);
        System.out.println("la cantidad de codigos incorrectos es: " + incor);
    }

}
