package profesorService;

import java.util.Scanner;
import profesorClass.ProfesorClass;

/**
 * método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el 
nombre de cada alumno. 
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor 
al atributo alumnos 
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por 
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que 
se repite el encuentro.
 * @author jpach
 */
public class ProfesorService {
    Scanner leer = new Scanner(System.in);
    
    public String[] cargarAlumnos(){
        
        String[] alumno = new String[5];
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Ingrese el nombre del Alumno: " + (i+1));
            alumno[i] = leer.next();

        }
        return alumno;
    }
    
    public void CrearCurso(ProfesorClass insert){
        System.out.println("Ingresa el nombre del curso: ");
        insert.setNombreCurso(leer.next());
        System.out.println("Ingresa la cantidad de horas por dia: ");
        insert.setCantidadHorasDia(leer.nextInt());
        System.out.println("Ingresa la cantidad de dias a la semana: ");
        insert.setCantidadDiasSemana(leer.nextInt());
        System.out.println("Ingresa el turno (Manaña(M)/Tarde(T))");
        insert.setTurno(leer.next());
        System.out.println("Ingrese el precio por horas del curso");
        insert.setPrecioHora(leer.nextDouble());
        insert.setAlumno(cargarAlumnos());
        
    }
    
    public void calcularGananciaSemanal(ProfesorClass insert){
        double ganancia = (insert.getCantidadHorasDia() * insert.getPrecioHora())*(insert.getCantidadDiasSemana()*insert.getAlumno().length);
        
        System.out.println("La ganancia semanal es: " + ganancia);
    }
    
}
