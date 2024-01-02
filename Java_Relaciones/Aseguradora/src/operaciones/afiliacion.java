/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jpach
 */
public class afiliacion {

    ArrayList<clientes> listaClientes = new ArrayList<>();

    public void cliente() {
        clientes cl = new clientes();

        String[] nombres = {"Juan", "Maria", "Carlos", "Sofia", "Andres", "Laura", "Alejandro", "Gabriela", "Pedro", "Valentina", "Daniel", "Camila", "Andrés", "Natalia", "Felipe"};
        cl.setNombre(nombres[(int) (Math.random() * nombres.length)]);

        String[] apellidos = {"Perez", "Lopez", "Rodriguez", "Garcia", "Martinez", "Gonzalez", "Hernandez", "Torres", "Ramirez", "Morales", "Sanchez", "Castro", "Flores", "Jimenez", "Vargas"};
        cl.setApellido(apellidos[(int) (Math.random() * apellidos.length)]);

        int[] documentos = {1002193756, 872605843, 609384726, 518927460, 938471025, 275063981, 492817503, 736495182, 105726394, 649381207, 827340591, 304958712, 573019482, 912837045, 420591738};
        cl.setDocumento(documentos[(int) (Math.random() * documentos.length)]);

        String email = cl.getApellido() + cl.getNombre() + String.valueOf((int) (Math.random() * 999)) + "@gmail.com";
        cl.setEmail(email);

        String[] domicilios = {"Olaya Herrera Cl26 #55-A15", "San Martín Av. 12 #30-B10", "Bella Vista Calle 8B #47-19", "La Pradera Cl7 #22-33", "Los Alamos Av. 5 #14-12", "El Recreo Cl14 #56-8", "Centro Histórico Cl15 #10-22", "El Bosque Av. 20 #45-6", "La Floresta Calle 30 #16-27", "El Carmen Av. 9A #70-11", "San Francisco Cl10 #25-14", "Miraflores Av. 3 #18-5", "Ciudad Jardín Calle 40 #35-9", "San Pedro Cl12 #42-20", "La Quinta Av. 7 #60-16"};
        cl.setDomicilio(domicilios[(int) (Math.random() * domicilios.length)]);

        String t = String.valueOf(300 + (int) (Math.random() * 24));
        t += String.valueOf((int) (Math.random() * 9999999));
        cl.setTelefono(Long.valueOf(t));

        listaClientes.add(new clientes(cl.getNombre(), cl.getApellido(), cl.getDocumento(), cl.getEmail(), cl.getDomicilio(), cl.getTelefono()));

    }

    public void cuotas() {
        cuotas c = new cuotas();
        int numeroCuotas = (int) (Math.random() * 6 + 2);
        c.setNumeroCuotas(numeroCuotas);

        int[] montoTotalCuotas = {5000, 10000, 150000, 20000};
        c.setMontoDeuda(montoTotalCuotas[(int) (Math.random() * montoTotalCuotas.length)]);

        int dia = (int) (Math.random() * 27 + 1);
        int mes = (int) (Math.random() * 12 + 1);
        int anio = 2010 + (int) (Math.random() * 14);
        c.setFechaVencimiento(new Date(anio, mes, dia));

        String[] validacionPago = {"Pagado", "Mora"};
        c.setValidacionPago(validacionPago[(int) Math.random() * validacionPago.length]);

        String[] metodoPago = {"Tarjetas de crédito", "Tarjetas de débito", "Transferencias bancarias", "Efectivo"};
        c.setFormaPago(metodoPago[(int) Math.random() * metodoPago.length]);

    }

    public void poliza() {

    }
}
