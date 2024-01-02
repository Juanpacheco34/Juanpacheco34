/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineEntidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class Sala {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Asientos A = new Asientos();
    Funcion F = new Funcion();
    Espectador E = new Espectador();
    private List<Espectador> esp = new ArrayList();
    private List<Funcion> fun = new ArrayList();

    public List<Espectador> getEsp() {
        return esp;
    }

    public void setEsp(List<Espectador> esp) {
        this.esp = esp;
    }

    public List<Funcion> getFun() {
        return fun;
    }

    public void setFun(List<Funcion> fun) {
        this.fun = fun;
    }

    public void asientosDisponibles() {
        String[][] asientos = A.getAsientos();

        for (int i = 0; i < asientos.length; i++) {//Columnas
            for (int j = 0; j < asientos.length + 2; j++) {//Filas
                int num = (int) (Math.random() * 60);

                if (num <= 8 && asientos[i][j].length() == 2) {
                    asientos[i][j] += "X";
                    System.out.print("[" + asientos[i][j] + "]");

                } else if (num >= 8 && asientos[i][j].length() == 2) {
                    asientos[i][j] += " ";
                    System.out.print("[" + asientos[i][j] + "]");
                }
            }
            System.out.println("");
        }
        A.setAsientos(asientos);
    }

    public void funcion() {
        F.setTitulo(F.getTituloAl()[(int) (Math.random() * F.getTituloAl().length)]);
        F.setDirector(F.getDirectorAl()[(int) (Math.random() * F.getDirectorAl().length)]);
        F.setDuracion((int) (Math.random() * 3 + 1));
        F.setEdadMinima(10 + (int) (Math.random() * 17));
        F.setValorTicket(10 + (int) (Math.random() * 17));

        fun.add(new Funcion(F.getTitulo(), F.getDirector(), F.getDuracion(), F.getEdadMinima(), F.getValorTicket()));

    }

    public void espectador() {

        E.setNombre(E.getNombreAl()[(int) (Math.random() * E.getNombreAl().length)]);
        E.setEdad(10 + (int) (Math.random() * 25));
        E.setDinero(10 + (int) (Math.random() * 30));

        esp.add(new Espectador(E.getNombre(), E.getEdad(), E.getDinero()));

    }

    public void cinema() {
        asientosDisponibles();
        funcion();
        espectador();
        int num = 0;
        do {
            int op = num;
            System.out.println("Menu:");
            System.out.println("1. Mostrar la Funcion Disponible");
            System.out.println("2. Comprar ticket para la Funcion");
            System.out.println("3. Salir");

            System.out.print("Ingresa tu Opcion:");
            num = leer.nextInt();

            switch (num) {
                case 1:
                    System.out.println(fun.get(0));
                    break;
                case 2:
                    System.out.println(esp.get(0));

                    if (E.getDinero() >= F.getValorTicket() && E.getEdad() >= F.getEdadMinima()) {
                        System.out.println("Compra Exitosa!!!");
                        System.out.print("Escriba el asiento donde se quiere sentar: ");
                        String a = leer.next().toUpperCase();

                        String[][] asientos = A.getAsientos();
                        for (int i = 0; i < A.getAsientos().length; i++) {//Columnas
                            for (int j = 0; j < A.getAsientos().length + 2; j++) {//Filas

                                if (a.equalsIgnoreCase(asientos[i][j].substring(0, 2)) && asientos[i][j].substring(2, 3).equalsIgnoreCase(" ")) {
                                    System.out.println("Asiento Vacio: " + " [" + asientos[i][j] + "] "
                                            + " Gracias por su Preferencia!!! "
                                            + "\n\nSr." + E.getNombre());
                                    asientos[i][j] = asientos[i][j].replace(" ", "X");
                                    System.out.println(fun.get(0));
                                    num = 3;

                                } else if (a.equalsIgnoreCase(asientos[i][j].substring(0, 2)) && asientos[i][j].substring(2, 3).equalsIgnoreCase("X")) {
                                    System.out.println("Asiento"
                                            + " [" + asientos[i][j] + "] " + "Ocupado!!! "
                                            + "\nRevisa los Asientos Disponibles "
                                            + "\nIntente de Nuevo...");

                                }
                            }
                            System.out.println("");
                        }
                        A.setAsientos(asientos);
//Mostrar Asientos
//                        for (int i = 0; i < asientos.length; i++) {//Columnas
//                            for (int j = 0; j < asientos.length + 2; j++) {//Filas
//                                System.out.print("[" + asientos[i][j] + "]");
//                            }
//                            System.out.println("");
//                        }

                    } else if (E.getDinero() < F.getValorTicket() && E.getEdad() < F.getEdadMinima()) {
                        System.out.println("No cumples con las condiciones para entrar al Cine!!");
                        System.out.print("Dinero Disponible: " + E.getDinero() + " Valor Ticket: " + F.getValorTicket() + "\n");
                        System.out.print("Tu Edad: " + E.getEdad() + " Edad Minima: " + F.getEdadMinima() + "\n");
                    } else if (E.getDinero() < F.getValorTicket() && E.getEdad() > F.getEdadMinima()) {
                        System.out.println("No cumples con las condiciones para entrar al Cine!!");
                        System.out.print("Dinero Disponible: " + E.getDinero() + " Valor Ticket: " + F.getValorTicket() + "\n");
                    } else if (E.getDinero() > F.getValorTicket() && E.getEdad() < F.getEdadMinima()) {
                        System.out.println("No cumples con las condiciones para entrar al Cine!!");
                        System.out.print("Tu Edad: " + E.getEdad() + " Edad Minima: " + F.getEdadMinima() + "\n");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\n\nError de Opcion\n\n");
                    break;
            }

        } while (num
                != 3);
        {
        }

    }
}
