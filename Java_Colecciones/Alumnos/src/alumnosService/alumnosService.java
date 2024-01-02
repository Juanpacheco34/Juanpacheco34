package alumnosService;

import alumnosClass.alumnosClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 *
 * @author jpach
 */
public class alumnosService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<alumnosClass> alumnos = new ArrayList<>();
    String salir = "";

    public void CrearAlumnos() {
        do {

            System.out.print("Ingresa el nombre del alumno:");
            String nombre = leer.next();
            System.out.println("Ingrese la nota 1");
            int n1= leer.nextInt();
            System.out.println("Ingresa la nota 2");
            int n2 = leer.nextInt();
            System.out.println("Ingrese la nota 3");
            int n3 = leer.nextInt();

            alumnos.add(new alumnosClass(nombre, n1, n2, n3));

            System.out.println("Ingresar otro Alumno: \t(S/N)");
            salir = leer.next();

        } while (!salir.equalsIgnoreCase("n")); //\n Salto de Linea
        {
            alumnos.forEach((aux) -> System.out.println(aux));
        }
    }

    public void notaFinal() {

        // Opcion 1 para buscar
        System.out.println("\"Calcular Nota Final\"");
        System.out.println("Ingresa el nombre del alumno: ");
        salir = leer.next(); //Reutilizaremos la variable salir creada anteriormente

        for (alumnosClass aux : alumnos) {
            if (aux.getNombre().equalsIgnoreCase(salir)) {
                System.out.println("La nota final del Alumn@: " + "\"" + aux.getNombre() + "\""
                        + " es: " + (aux.getN1() + aux.getN2() + aux.getN3()) / 3);

            }

        }

        // Opcion 2 para buscar
//        Iterator<alumnosClass> it = alumnos.iterator();
//        System.out.println("\"Calcular Nota Final\"");
//        System.out.println("Ingresa el nombre del alumno: ");
//        salir = leer.next(); //Reutilizaremos la variable salir creada anteriormente
//
//        while (it.hasNext()) {
//            alumnosClass aux = it.next();
//            if (aux.getNombre().equalsIgnoreCase(salir)) {
//
//                System.out.println("La nota final del Alumn@: " + "\"" + aux.getNombre() + "\""
//                        + " es: " + (aux.getN1() + aux.getN2() + aux.getN3()) / 3);
//
//            }
//
//        }
    }
}
