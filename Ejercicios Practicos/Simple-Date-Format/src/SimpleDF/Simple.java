/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SimpleDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jpach
 */
public class Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String fechaTexto1 = "22-9-2023";
            String fechaTexto2 = "22-10-2023";
            Date fecha1 = sdf.parse(fechaTexto1);
            Date fecha2 = sdf.parse(fechaTexto2);
            System.out.println(fecha1);
            System.out.println(fecha2);
            String fechaPrestamo = sdf.format(fecha1);
            String fechaDevolucion = sdf.format(fecha2);
            Boolean validacionDeFechas = (fechaPrestamo.compareTo(fechaDevolucion) <= 0);
            System.out.println(fechaPrestamo +" "+fechaDevolucion+" "+  validacionDeFechas);
        }catch (ParseException e) {
            System.err.println("Error");
    }
}

}
