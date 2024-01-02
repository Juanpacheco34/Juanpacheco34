package raicesService;

import raicesClass.RaicesClass;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class RaicesService {

    Scanner leer = new Scanner(System.in);

    public RaicesClass insert() {
        System.out.print("Ingresa el valor de a: ");
        int a = leer.nextInt();
        System.out.print("Ingresa el valor de b: ");
        int b = leer.nextInt();
        System.out.print("Ingresa el valor de c: ");
        int c = leer.nextInt();

        return new RaicesClass(a, b, c);
    }

    public void getDiscriminante(RaicesClass insert) {
        double discriminante = Math.pow(insert.getB(), 2) - (4 * insert.getA() * insert.getC());
        System.out.print("El Discriminante es: " + discriminante);

    }

    /* devuelve un booleano indicando si tiene dos soluciones, para 
    que esto ocurra, el discriminante debe ser mayor o igual que 0*/
    public boolean tieneRaices(RaicesClass insert) {
        double discriminante = Math.pow(insert.getB(), 2) - (4 * insert.getA() * insert.getC());
        boolean bolean = discriminante > 0;

        return bolean;
    }

    /*devuelve un booleano indicando si tiene una única solución, para 
    que esto ocurra, el discriminante debe ser igual que 0
     */
    public boolean tieneRaiz(RaicesClass insert) {
        double discriminante = Math.pow(insert.getB(), 2) - (4 * insert.getA() * insert.getC());
        boolean bolean = discriminante == 0;

        return bolean;

    }

    public void obtenerRaices(RaicesClass insert) {

        if (tieneRaices(insert) == true) {
            int x = (int) Math.pow(insert.getB(), 2) - 4 * insert.getA() * insert.getC();
            int xx = 2 * insert.getA();

            x = (int) Math.sqrt(x);

            System.out.print("\nSolucion 1: " + (-insert.getB() + x) / xx);
            System.out.print("\nSolucion 2: " + (-insert.getB() - x) / xx + "\n");

        }

    }

    public void obtenerRaiz(RaicesClass insert) {

        if (tieneRaiz(insert) == true) {
            int x = (int) Math.pow(insert.getB(), 2) - 4 * insert.getA() * insert.getC();
            int xx = 2 * insert.getA();

            x = (int) Math.sqrt(x);

            System.out.print("\nSolucion 1: " + (-insert.getB() + x) / xx + "\n");

        }

    }


    }