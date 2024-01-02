package persona.service;

import java.util.Scanner;
import persona.entidades.personaClass;

public class personaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public personaClass crearPersona() {

        System.out.println("Ingrese su Nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese su Edad: ");
        int edad = leer.nextInt();

        System.out.println("Ingrese su Sexo: ");
        System.out.println("H - Hombre");
        System.out.println("M - Mujer");
        System.out.println("O - Otro");
        String sexo = leer.next().toUpperCase();
        System.out.println("Su sexo es Correcto:  S/N");
        String sex = leer.next();

        while ("n".equalsIgnoreCase(sex)) {
            System.out.println("Ingrese su Sexo: ");
            System.out.println("H - Hombre");
            System.out.println("M - Mujer");
            System.out.println("O - Otro");
            sexo = leer.next().toUpperCase();
            System.out.println("Su sexo es Correcto:  S/N");
            sex = leer.next().toUpperCase();

        }

        System.out.println("Ingrese su Peso: ");
        int peso = leer.nextInt();
        System.out.println("Ingrese su Altura: ");
        double altura = leer.nextDouble();

        return new personaClass(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(personaClass crearPersona) {
        int peso =crearPersona.getPeso() / ((int) Math.pow(crearPersona.getAltura(), 2));
        
        if (peso < 20) {
            peso = peso + 1 - peso;
        } else if (peso == 20 || peso <= 25) {
            peso -= peso;

        } else {
            peso -= peso + 1;

        }
        return peso;

    }

    public boolean esMayorDeEdad(personaClass crearPersona) {
        boolean bolean;
        int edad = crearPersona.getEdad();

        if (edad >= 18) {
            bolean = edad >= 18;

        } else {
            bolean = edad >= 18;

        }
        return bolean;

    }

}
