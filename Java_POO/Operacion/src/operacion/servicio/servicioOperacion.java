package operacion.servicio;

import java.util.Scanner;
import operacion.entidad.operacion;


/**
 *
 * @author jpach
 */
public class servicioOperacion {
    private Scanner leer = new Scanner(System.in);
    
    public operacion crearOperacion(){
        System.out.println("Ingrese el valor numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el valor numero 2");
        int num2 = leer.nextInt();
        
        return new operacion(num1,num2);

    
}

    
}
