/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class Hotel extends Destino{

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected int cantHabitaciones, numCamas, cantpisos;
    protected String nomRestaurante, gimnasio;
    protected double precioHabitaciones;
    protected int capRestaurante;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantpisos, String nomRestaurante, String gimnasio, double precioHabitaciones, int capRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantpisos = cantpisos;
        this.nomRestaurante = nomRestaurante;
        this.gimnasio = gimnasio;
        this.precioHabitaciones = precioHabitaciones;
        this.capRestaurante = capRestaurante;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantpisos() {
        return cantpisos;
    }

    public void setCantpisos(int cantpisos) {
        this.cantpisos = cantpisos;
    }

    public String getNomRestaurante() {
        return nomRestaurante;
    }

    public void setNomRestaurante(String nomRestaurante) {
        this.nomRestaurante = nomRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(int capRestaurante) {
        this.capRestaurante = capRestaurante;
    }



    public void crearHotel() {
        int valorRestaurante, valorGimnasio;

        cantHabitaciones = 100 + (int) (Math.random() * 145);
        numCamas = cantHabitaciones;

        String[] tipoGimnasio = {"A", "B"};
        gimnasio = tipoGimnasio[(int) (Math.random() * tipoGimnasio.length)];
        if (gimnasio.equalsIgnoreCase("A")) {
            valorGimnasio = 50;
        } else {
            valorGimnasio = 30;
        }

        String[] nombres = {"La Mesa Dorada", "El Sabor Auténtico", "Delicias del Mar", "Cocina Exótica",
            "Sazón Tradicional", "Sabores del Mundo", "El Rincón Gourmet", "La Parrilla Caliente",
            "Fusión Gastronómica", "Rincón de Sabores", "El Bocado Perfecto", "Delicias Mediterráneas",
            "Gusto y Sabor", "La Mesa Deliciosa", "Sabor a Casa"};
        nomRestaurante = nombres[(int) (Math.random() * nombres.length)];
        
        cantpisos = 6 + (int) (Math.random() * 5+1);

        capRestaurante = (int) (Math.random() * 60);
        if (capRestaurante < 30) {
            valorRestaurante = 10;
        } else if (capRestaurante >= 30 && capRestaurante <= 50) {
            valorRestaurante = 30;
        } else {
            valorRestaurante = 50;

        }

        precioHabitaciones = 50 + (1 * cantHabitaciones) + valorRestaurante + valorGimnasio;

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
