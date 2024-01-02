/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaService;

import cadenaClass.cadenaClass;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class cadenaService {

    Scanner leer = new Scanner(System.in);

    public cadenaClass insert() {
        System.out.println("Ingresa una frase: ");
        String frase = leer.nextLine().toLowerCase().trim();
        int longitudFrase = frase.length();

        return new cadenaClass(frase, longitudFrase);
    }

    public void mostrarVocales(cadenaClass insert) {

        int contadorVocal = 0;

        for (int i = 0; i < insert.getLongitudFrase(); i++) {
            for (int j = i + 1; j < i + 2; j++) {
                String vocal = insert.getFrase().substring(i, j);

                switch (vocal) {
                    case "a":
                        contadorVocal++;
                        break;

                    case "e":
                        contadorVocal++;
                        break;

                    case "i":
                        contadorVocal++;
                        break;

                    case "o":
                        contadorVocal++;
                        break;

                    case "u":
                        contadorVocal++;
                        break;

                }

            }

        }

        System.out.println("Hay un total de " + contadorVocal + " Vocales..");
    }

    public void invertirFrase(cadenaClass insert) {
        String fraseI = "";
        for (int i = insert.getLongitudFrase(); i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                fraseI += insert.getFrase().substring(j, i);
                break;

            }

        }
        System.out.println("Tu palabra invertida es: " + fraseI);
    }

    public void caracterRepetido(cadenaClass insert) {
        System.out.println("Que caracter buscas en la frase: ");
        String caracter, busqueda = leer.next();
        int contadorCaracter = 0;

        for (int i = 0; i < insert.getLongitudFrase(); i++) {
            for (int j = i + 1; j < i + 2; j++) {
                caracter = insert.getFrase().substring(i, j).toLowerCase();

                if (busqueda.equals(caracter)) {
                    contadorCaracter++;
                }

            }

        }
        System.out.println("Tu carcter se repite " + contadorCaracter);

    }

    public void compararLongitud(cadenaClass insert) {
        System.out.println("Ingrese una frase nueva para comparar la longitud con la anterior: ");
        String frase = leer.nextLine();
        int lFrase = frase.length();
        boolean bolean = insert.getLongitudFrase() == lFrase;

        if (bolean == true) {

            System.out.println("las frases tienen la misma Longitud");
        } else {

            System.out.println("las frases no tienen la misma Longitud");

        }

    }

    public void unirFrase(cadenaClass insert) {
        System.out.println("Ingrese una frase nueva para unir con la anterior: ");
        String frase = leer.nextLine();

        System.out.println(insert.getFrase().concat(" ").concat(frase).toUpperCase());

    }

    public void reemplazarCaracter(cadenaClass insert) {
        String caracterReemplazo, reemplazo, nuevaFrase;
        System.out.println("Ingrese el caracter que desea remplazar: ");
        caracterReemplazo = leer.next();
        System.out.println("Ingrese el nuevo caracter : ");
        reemplazo = leer.next();

        nuevaFrase = insert.getFrase().replace(caracterReemplazo, reemplazo);

        System.out.println("\n\n\n\n");
        System.out.println(insert.getFrase());
        System.out.println(nuevaFrase);

    }

    public void contiene(cadenaClass insert) {
        System.out.println("Ingrese la letra a buscar en la frase: ");
        String letra = leer.next(), caracter;
        boolean bolean = false;
        
        for (int i = 0; i < insert.getLongitudFrase(); i++) {
            if (letra.equals(String.valueOf(insert.getFrase().charAt(i)))) {
                bolean = letra.equals(String.valueOf(insert.getFrase().charAt(i)));
            } else {
            }

        }
        System.out.println("¿Se encuentra la letra en la frase? \n" + bolean);
    }
}
