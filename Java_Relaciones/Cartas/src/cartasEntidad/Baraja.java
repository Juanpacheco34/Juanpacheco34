/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartasEntidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
 * un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas,
 * bastos, oros y copas). Esta clase debe contener un método toString() que
 * retorne el número de carta y el palo. La baraja estará compuesta por un
 * conjunto de cartas, 40 exactamente.
 *
 * @author jpach
 */
public class Baraja {

    private Scanner leer = new Scanner(System.in);

    private String[] espadas = {"1 E", "2 E", "3 E", "4 E", "5 E", "6 E", "7 E", "10 E", "11 E", "12 E"}, bastos = {"1 B", "2 B", "3 B", "4 B", "5 B", "6 B", "7 B", "10 B", "11 B", "12 B"}, oros = {"1 O", "2 O", "3 O", "4 O", "5 O", "6 O", "7 O", "10 O", "11 O", "12 O"}, copas = {"1 C", "2 C", "3 C", "4 C", "5 C", "6 C", "7 C", "10 C", "11 C", "12 C"};
    private int totalCartas = (espadas.length + bastos.length + oros.length + copas.length);
    private List<String> mazo = new ArrayList<>();
    private List<String> desecho = new ArrayList<>();

    public Baraja() {
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String[] getEspadas() {
        return espadas;
    }

    public void setEspadas(String[] espadas) {
        this.espadas = espadas;
    }

    public String[] getBastos() {
        return bastos;
    }

    public void setBastos(String[] bastos) {
        this.bastos = bastos;
    }

    public String[] getOros() {
        return oros;
    }

    public void setOros(String[] oros) {
        this.oros = oros;
    }

    public String[] getCopas() {
        return copas;
    }

    public void setCopas(String[] copas) {
        this.copas = copas;
    }

    public int getTotalCartas() {
        return totalCartas;
    }

    public void setTotalCartas(int totalCartas) {
        this.totalCartas = totalCartas;
    }

    public List<String> getMazo() {
        return mazo;
    }

    public void setMazo(List<String> mazo) {
        this.mazo = mazo;
    }

    public List<String> getDesecho() {
        return desecho;
    }

    public void setDesecho(List<String> desecho) {
        this.desecho = desecho;
    }

    public void barajar() {
//• barajar(): cambia de posición todas las cartas aleatoriamente.
        for (String x : this.espadas) {
            mazo.add(x);
        }
        for (String x : this.bastos) {
            mazo.add(x);
        }
        for (String x : this.oros) {
            mazo.add(x);
        }
        for (String x : this.copas) {
            mazo.add(x);
        }

        for (int i = 0; i < mazo.size(); i++) {
            for (int j = 0; j < mazo.size() - 10; j++) {
                int num = (int) (Math.random() * 10 + 1);
                String aux = mazo.get(j);
                mazo.set(j, mazo.get(j + num));
                mazo.set((j + num), aux);
            }

        }

    }

    public void siguienteCarta() {
//  • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//  se haya llegado al final, se indica al usuario que no hay más cartas.

        Iterator<String> it = mazo.iterator();

        while (it.hasNext()) {
            String x = it.next();
            System.out.println("Tu carta es: " + x);
            desecho.add(x);
            it.remove();
            break;

        }
        if (mazo.size() == 0) {
            System.out.println("Se terminaron las Cartas del Mazo....");
        }

    }

    public void cartasDisponibles() {
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
        System.out.print("Cartas Disponibles: ");
        System.out.println(mazo.size());
    }

    public void darCatas() {
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//  cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//  debemos indicárselo al usuario.
        System.out.print("Cuantas cartas quieres: ");
        int num = leer.nextInt();

        if (num > this.mazo.size()) {
            System.out.println("La cantidad de cartas pedidas no las hay...");
        } else {

            Iterator<String> it = mazo.iterator();
            for (int i = 0; i < num; i++) {
                while (it.hasNext()) {
                    String x = it.next();
                    System.out.println("Tu carta es: " + x);
                    desecho.add(x);
                    it.remove();
                    break;

                }

            }
            if (mazo.size() == 0) {
                System.out.println("Se terminaron las Cartas del Mazo....");
            }
        }

    }

    public void cartasMonton() {
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//  indicárselo al usuario

        if (desecho.size() == 0) {
            System.out.println("No hay cartas en la basura...");
        } else {
            System.out.println("Cartas Desechadas: " + desecho.toString());
        }

    }

    public void mostrarBaraja() {
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//  luego se llama al método, este no mostrara esa primera carta.

        System.out.println("Cartas disponibles: ");
        for (String aux : this.mazo) {
            System.out.print(aux + ", ");
        }
    }

    @Override
    public String toString() {
        return "Baraja:" + "\nespadas=" + Arrays.toString(espadas) + "\nbastos =" + Arrays.toString(bastos) + "\noros   =" + Arrays.toString(oros) + "\ncopas  =" + Arrays.toString(copas) + "\nmazo   =" + mazo.size() + '}';
    }

}
