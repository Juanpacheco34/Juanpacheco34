/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;


/**
 * Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 *
 * @author jpach
 */
public class Circulo implements calculosFormas {

    protected double radio;
    protected double diametro;

    @Override
    public void calcularArea() {
        System.out.print("Ingrese radio del Circulo: ");
        this.radio = leer.nextDouble();
        
        System.out.println("Tu Área circulo es: " + Math.pow((pi * this.radio), 2));
    }

    @Override
    public void calcularPerimetro() {
        System.out.print("Ingrese Diametro del Circulo: ");
        this.diametro = leer.nextDouble();
        
        System.out.println("Tu Perímetro circulo es: " + pi * this.diametro);    }

}
