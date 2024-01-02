package dateService;

import dateClass.dateClass;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class dateService {

    Scanner leer = new Scanner(System.in);

    public dateClass fecha() {
        System.out.println("Dia");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();
        Date f = new Date(anio - 1900, mes - 1, dia);
        Date fecha = f;

        return new dateClass(fecha);

    }

    public void diferencia(dateClass fecha) {
        Date hoy = new Date();
        int diferencia = hoy.getYear() - fecha.getFecha().getYear();
        System.out.println(diferencia);

    }

    public void fechaA(dateClass fecha) {
        Date hoy = new Date();
        System.out.println(hoy);
    }

}
