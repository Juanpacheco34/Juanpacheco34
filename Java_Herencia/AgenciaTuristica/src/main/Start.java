/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entidades.Camping;
import entidades.Destino;
import entidades.Hotel;
import entidades.Hotel4;
import entidades.Hotel5;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Realizar un sistema de consulta que le permite al usuario consultar por
 * diferentes criterios: • todos los alojamientos. • todos los hoteles de más
 * caro a más barato. • todos los campings con restaurante • todos las
 * residencias que tienen descuento.
 *
 * @author jpach
 */
public class Start {

    /**
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        Destino d = new Destino();
        Hotel4 h4 = new Hotel4();
        Hotel5 h5 = new Hotel5();
        Camping c = new Camping();
        Residencia r = new Residencia();
        List<Destino> listaAlojamientos = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            d.creaDestino();
            h4.crearHotel4();
            listaAlojamientos.add(new Hotel4(h4.getCantHabitaciones(), h4.getNumCamas(), h4.getCantpisos(), h4.getNomRestaurante(), h4.getGimnasio(), h4.getPrecioHabitaciones(), h4.getCapRestaurante(), d.getNombre(), d.getDireccion(), d.getLocalidad(), d.getGerente()));
            d.creaDestino();
            h5.crearHotel5();
            listaAlojamientos.add(new Hotel5(h5.getCantSalonesConferencia(), h5.getCantSuites(), h5.getCantLimosinas(), h5.getCantHabitaciones(), h5.getNumCamas(), h5.getCantpisos(), h5.getNomRestaurante(), h5.getGimnasio(), h5.getPrecioHabitaciones(), h5.getCapRestaurante(), d.getNombre(), d.getDireccion(), d.getLocalidad(), d.getGerente()));
            d.creaDestino();
            c.crearCamping();
            listaAlojamientos.add(new Camping(c.getCantCarpas(), c.getCantbanos(), c.isRestaurante(), c.isPrivacidad(), c.getTamano(), d.getNombre(), d.getDireccion(), d.getLocalidad(), d.getGerente()));
            d.creaDestino();
            r.crearResidencia();
            listaAlojamientos.add(new Residencia(r.getCantHabitaciones(), r.isDescuentos(), r.isCampDeportivo(), r.isPrivacidad(), r.getTamano(), d.getNombre(), d.getDireccion(), d.getLocalidad(), d.getGerente()));
        }

        System.out.println("Mostrando los alojamientos Disponibles: ");
        listaAlojamientos.forEach((x) -> System.out.println(x));

        System.out.println("\n\n\nHoteles disponibles del mas caro a mas barato: ");
        ArrayList<Hotel> hoteles = new ArrayList();
        for (Destino x : listaAlojamientos) {
            if (x instanceof Hotel4 || x instanceof Hotel5) {
                hoteles.add((Hotel) x);
            }
        }

        Collections.sort(hoteles, Comparator.comparingDouble(Hotel::getPrecioHabitaciones).reversed());
        hoteles.forEach((x) -> System.out.println(x));

        System.out.println("\n\n\nResidencias con Descuentos y Camping con Restaurantes: ");
        for (Destino x : listaAlojamientos) {
            if (x instanceof Residencia && ((Residencia) x).isDescuentos() == true || x instanceof Camping && ((Camping) x).isRestaurante() == true) {
                System.out.println(x);
            }
        }

    }

}
