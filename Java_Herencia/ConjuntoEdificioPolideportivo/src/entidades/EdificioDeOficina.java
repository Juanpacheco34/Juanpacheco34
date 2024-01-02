/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre.
 *
 * @author jpach
 */
public class EdificioDeOficina extends Edificio {

    private int numeroOficina;
    private int cantidadPersona;
    private int numeroPisos;

    public EdificioDeOficina() {
    }

    public EdificioDeOficina(int numeroOficina, int cantidadPersona, int numeroPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numeroOficina = numeroOficina;
        this.cantidadPersona = cantidadPersona;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroOficina() {
        return numeroOficina;
    }

    public void setNumeroOficina(int numeroOficina) {
        this.numeroOficina = numeroOficina;
    }

    public int getCantidadPersona() {
        return cantidadPersona;
    }

    public void setCantidadPersona(int cantidadPersona) {
        this.cantidadPersona = cantidadPersona;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public void crearEdificio() {

        System.out.print("Cuantos pisos tiene el edificio: ");
        numeroPisos = leer.nextInt();
        System.out.print("Cuantas Oficinas hay por piso: ");
        numeroOficina = leer.nextInt();
        System.out.print("Cuantas personas tiene permitido tener una oficina: ");
        cantidadPersona = leer.nextInt();
        
        largo = (int) (Math.random() * 100 + 60);
        ancho = (int) (Math.random() * 50 + 30);
        alto = numeroPisos * 3;

    }

    public void cantidadPersona() {
        System.out.println("En el edificio hay un total de: " + (numeroPisos * numeroOficina) * cantidadPersona + " Personas trabajando");
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("la superficie del polideportivo  es de: " + (largo * ancho) + "m²");
    }

    @Override
    public void calcularVolumen() {

        System.out.println("el volumen del polideportivo  es de: " + (alto * ancho * largo) + "m³");

    }

    @Override
    public String toString() {
        return "Edificio{ancho=" + ancho + ", alto=" + alto + ", largo=" + largo +", Oficinas" + "numeroOficina=" + numeroOficina + ", cantidadPersona=" + cantidadPersona + ", numeroPisos=" + numeroPisos ;
    }
    
    

}
