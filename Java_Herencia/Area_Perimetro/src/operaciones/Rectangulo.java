/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import static operaciones.calculosFormas.leer;


/**
 *Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 * @author jpach
 */
public class Rectangulo implements calculosFormas{
    protected int base;
    protected int altura;

    @Override
    public void calcularArea() {
        System.out.print("Ingrese la base del Rectangulo: ");
        this.base = leer.nextInt();
        System.out.print("Ingrese la altura del Rectangulo: ");
        this.altura = leer.nextInt();
        
        System.out.println("Tu Área rectángulo es: " + this.base * this.altura);
    }

    @Override
    public void calcularPerimetro() {
        
        System.out.println("Tu Perímetro rectángulo es: " + (this.base + this.altura) * 2);

}
    
}
