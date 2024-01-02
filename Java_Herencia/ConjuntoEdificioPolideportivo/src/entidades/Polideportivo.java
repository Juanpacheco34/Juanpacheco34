/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 * Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado
 * o Abierto, esta clase implementará los dos métodos abstractos y los atributos
 * del padre.
 *
 * @author jpach
 */
public class Polideportivo extends Edificio {

    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(boolean techado) {
        this.techado = techado;
    }

    public Polideportivo(boolean techado, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.techado = techado;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    public void crearPolideportivo() {
        largo = (int) (Math.random() * 100 + 60);
        ancho = (int) (Math.random() * 50 + 30);
        alto = (int) (Math.random() * 500 + 120);

        boolean[] techo = {true, false};
        techado = techo[(int) (Math.random() * techo.length)];
//        System.out.print("Techo: ");
//        techado = leer.nextBoolean();
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("la superficie del edificio  es de: " + (largo * ancho) + "m²");

    }

    @Override
    public void calcularVolumen() {
        System.out.println("el volumen del edificio es de: " + (alto * ancho * largo) + "m³");
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "techado=" + techado + '}';
    }

}
