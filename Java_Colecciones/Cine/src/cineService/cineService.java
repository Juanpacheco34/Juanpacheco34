package cineService;

import cineClass.cineClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Metodos: • Mostrar en pantalla todas las películas. • Mostrar en pantalla
 * todas las películas con una duración mayor a 1 hora. • Ordenar las películas
 * de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. •
 * Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
 * en pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo
 * en pantalla. • Ordenar las películas por director, alfabéticamente y
 * mostrarlo en pantalla.
 *
 * @author jpach
 */
public class cineService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<cineClass> album = new ArrayList<>();
    String salir = "";

    //Compartor en tradicional
    public static Comparator<cineClass> compararDuracionAsc = new Comparator<cineClass>() {
        @Override
        public int compare(cineClass t1, cineClass t2) {
            return t1.getDuracion().compareTo(t2.getDuracion());
        }
    };

    //Comparator en 1 sola linea
    public static Comparator<cineClass> compararDuracionDesc = (cineClass t1, cineClass t2) -> t2.getDuracion().compareTo(t1.getDuracion());
    //Comparator por titulo alfabeticamente
    public static Comparator<cineClass> compararTituloAsc = (cineClass t1, cineClass t2) -> t1.getTitulo().compareTo(t2.getTitulo());
    //Comparator por Director alfabeticamente
    public static Comparator<cineClass> compararDirectorAsc = (cineClass t1, cineClass t2) -> t1.getDirector().compareTo(t2.getDirector());

    public void insert() {

        do {
            System.out.println("Ingrese el titulo de la pelicula: ");
            String titulo = leer.next();
            System.out.println("Ingrese el nombre del director de la pelicula: ");
            String director = leer.next();
            System.out.println("Duracion de la pelicula: ");
            int duracion = leer.nextInt();

            album.add(new cineClass(titulo, director, duracion));

            System.out.println("Ingresar otra Pelicula: \t(S/N)");
            salir = leer.next();

        } while (!salir.equalsIgnoreCase("n"));
        {
            album.forEach((aux) -> System.out.println(aux));
        }
    }

    public void peliMayor1Hora() {
        System.out.println("\n\tPeliculas mayor a 1hr de Duracion: \n");
        Iterator<cineClass> it = album.iterator();
        while (it.hasNext()) {
            cineClass aux = it.next(); // creamos un objeto aux para guardar el it.next() y asi poder llamar a los get y set sin que se nos rompa el codigo por utilizar el next
            if (aux.getDuracion() > 1) {
                System.out.println(aux.getTitulo() + " " + aux.getDuracion() + "hrs");

            }

        }
    }

    public void peliMayorMenor() {
        System.out.println("\n\tPeliculas por orden de Duracion (Mayor->Menor): \n");
        Collections.sort(album, compararDuracionDesc); //Ordenamos de forma descendente por duracion de las horas
        album.forEach((aux) -> System.out.println(aux)); // Nos muestra si estan ordenados de formas descendentes

    }

    public void peliMenorMayor() {
        System.out.println("\n\tPeliculas por orden de Duracion (Menor->Mayor): \n");
        Collections.sort(album, compararDuracionAsc); //Ordenamos de forma Ascendente por duracion de las horas
        album.forEach((aux) -> System.out.println(aux)); // Nos muestra si estan ordenados de formas Ascendentes
    }

    public void peliOrdenadaTitulo() {
        System.out.println("\n\tPeliculas ordenadas por Titulo: \n");
        Collections.sort(album, compararTituloAsc); //Ordenamos de forma Ascendente por Titulos de la pelicula
        album.forEach((aux) -> System.out.println(aux)); // Nos muestra si estan ordenados de formas Ascendentes
    }

    public void peliOrdenadaDirector() {
        System.out.println("\n\tPeliculas ordenadas por Director: \n");
        Collections.sort(album, compararDirectorAsc); //Ordenamos de forma Ascendente por Director de la pelicula
        album.forEach((aux) -> System.out.println(aux)); // Nos muestra si estan ordenados de formas Ascendentes
    }
}
