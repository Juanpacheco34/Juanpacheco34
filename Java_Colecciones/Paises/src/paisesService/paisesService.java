package paisesService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import paisesClass.paisesClass;

/**
 * Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto
 * recordar cómo se ordena un conjunto. Por último, al usuario se le pedirá un
 * país y se recorrerá el conjunto con un Iterator, se buscará el país en el
 * conjunto y si está en el conjunto se eliminará el país que ingresó el usuario
 * y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le
 * informará al usuario.
 *
 * @author jpach
 */
public class paisesService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<paisesClass> paises = new HashSet<>();
    ArrayList<paisesClass> paisesList = new ArrayList();
    String pais = ""; //Reutilizaremos la variable en varios puntos....

    //Comparator Tradicional
//    public static Comparator<paisesClass> paisesAsc = new Comparator<paisesClass>() {
//        @Override
//        public int compare(paisesClass t1, paisesClass t2) {
//            return t1.getPaises().compareTo(t2.getPaises());
//        }
//    };
    //Comparator en una Linea
    public static Comparator<paisesClass> paisesAsc = (paisesClass t1, paisesClass t2) -> t1.getPaises().compareTo(t2.getPaises());

    public void insertPaises() {
        do {
            System.out.println("Ingrese un pais:");
            pais = leer.next().toLowerCase();

            paises.add(new paisesClass(pais));

            System.out.println("Ingresar otro Pais:\t(S/N)");
            pais = leer.next();
        } while (!pais.equalsIgnoreCase("n"));
        {
            System.out.println("\n\tPaises Insertados\n");
            paises.forEach((aux) -> System.out.println(aux));

        }

    }

    public void ordenarPaises() {
        paisesList = new ArrayList(paises);
        Collections.sort(paisesList, paisesAsc);

        System.out.println("\n\tPaises Ordenados Alfabeticamente\n");
        paisesList.forEach((aux) -> System.out.println(aux));
    }

    public void eliminarPaises() {
        Iterator<paisesClass> it = paisesList.iterator();

        System.out.print("\nIngrese el Pais a eliminar: ");
        pais = leer.next();
        while (it.hasNext()) {
            paisesClass aux = it.next();
            if (aux.getPaises().equalsIgnoreCase(pais)) {
                it.remove();
                pais = "1"; //Reutilizamos la variable para gusradar un numero tipo string que nos ayudara en el condicional

            }

        }
        if (pais.equals("1")) {
            System.out.println("");
            paisesList.forEach((aux) -> System.out.println(aux));

        } else {
            System.out.println("\nEl pais no se encuentra registrado..");
        }

    }

}
