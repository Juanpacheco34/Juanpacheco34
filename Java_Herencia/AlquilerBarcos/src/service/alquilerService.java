/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entidades.BarcoMotor;
import entidades.Registro;
import entidades.Velero;
import entidades.Yate;
import java.util.ArrayList;
import java.util.List;


/**
 * Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
 * módulo normal y sumándole el atributo particular de cada barco. En los
 * veleros se suma el número de mástiles, en los barcos a motor se le suma la
 * potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes. Utilizando la herencia de forma apropiada, deberemos programar en
 * Java, las clases y los métodos necesarios que permitan al usuario elegir el
 * barco que quiera alquilar y mostrarle el precio final de su alquiler.
 *
 * @author jpach
 */
public class alquilerService {

    List<Registro> listaAlquiler = new ArrayList();
    Registro r = new Registro();
    Velero v = new Velero();
    BarcoMotor bm = new BarcoMotor();
    Yate y = new Yate();

    public void alquilerVelero() {
        System.out.println("Precio del velero c/10 metros de esloras*5$ + 2$*mastil ");
        r.crearcliente();
        v.crearBarco();
        r.setValorPagar((r.getDias() * ((int) (v.getTamañoEslora() * 0.1) * 5)) + (v.getNumeroMastil() * 2));
        Velero velero = new Velero(v.getMatricula(), v.getNumeroMastil(), v.getTamañoEslora(), v.getAñoFabricacion());
        listaAlquiler.add(new Registro(r.getNombre(), r.getDocumento(), r.getFechaAlq(), r.getFechaDev(), r.getDias(), r.getPosicionAmarre(), r.getValorPagar(), velero));
    }

    public void alquilerBarcoMotor() {
        System.out.println("Precio del barco con motor c/10 metros de esloras*3$ + 20$*potencia en cv del motor ");
        r.crearcliente();
        bm.crearBarco();
        r.setValorPagar((r.getDias() * ((int) (bm.getTamañoEslora() * 0.1) * 5)) + (bm.getPotenciaCv() * 3));
        BarcoMotor barcoMotor = new BarcoMotor(bm.getMatricula(), bm.getTamañoEslora(), bm.getPotenciaCv(), bm.getAñoFabricacion());
        listaAlquiler.add(new Registro(r.getNombre(), r.getDocumento(), r.getFechaAlq(), r.getFechaDev(), r.getDias(), r.getPosicionAmarre(), r.getValorPagar(), barcoMotor));
    }

    public void alquilerYate() {
        System.out.println("Precio del velero c/10 metros de esloras*5$ + 3$*potencia en cv del motor + 6$*Camarote ");
        r.crearcliente();
        y.crearBarco();
        r.setValorPagar((r.getDias() * ((int) (y.getTamañoEslora() * 0.1) * 5)) + (y.getPotenciaCv() * 3) + (y.getNumeroCamarotes() * 6));
        Yate yate = new Yate(y.getMatricula(), y.getTamañoEslora(), y.getPotenciaCv(), y.getAñoFabricacion(), y.getNumeroCamarotes());
        listaAlquiler.add(new Registro(r.getNombre(), r.getDocumento(), r.getFechaAlq(), r.getFechaDev(), r.getDias(), r.getPosicionAmarre(), r.getValorPagar(), yate));
    }

    public void registro() {
        
        System.out.println("\nRegistro de los Alquileres");
        listaAlquiler.forEach((x) -> System.out.println(x + "\n*---------------------------------------------------*\n"));
    

}
    
}
