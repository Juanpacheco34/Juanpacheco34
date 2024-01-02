package rectangulo.servicio;

import java.util.Scanner;
import rectangulo.entidades.rectanguloClass;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 */
public class rectanguloServicio {

    private Scanner leer = new Scanner(System.in);

    public rectanguloClass crearRectangulo() {
        System.out.println("Ingresa el valor de tu Base");
        int base = leer.nextInt();
        System.out.println("Ingresa el valor de tu Altura");
        int altura = leer.nextInt();

        return new rectanguloClass(base, altura);
    }

    public void superficie(rectanguloClass crearRectangulo) {
        int superficie = crearRectangulo.getBase() * crearRectangulo.getAltura();
        System.out.println("La superficie es: " + superficie);

    }

    public void perimetro(rectanguloClass crearRectangulo) {
        int perimetro = (crearRectangulo.getBase() + crearRectangulo.getAltura()) * 2;
        System.out.println("El perimetro es: " + perimetro);

    }

    public void mostrarRectangulo(rectanguloClass crearRectangulo) {
        for (int i = 0; i < crearRectangulo.getAltura(); i++) {
            for (int j = 0; j < crearRectangulo.getBase(); j++) {
                
                
                if (i == 0 || i == crearRectangulo.getAltura()) { 
                    System.out.print("* ");

                } 
                
                else if (j == 0 || j == crearRectangulo.getBase()) {
                    System.out.print("* ");
                } 
                
                else if (i == crearRectangulo.getAltura() -1||j == crearRectangulo.getBase() -1) {
                    System.out.print("* ");
                } 
                
                else {
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }

    }
}
