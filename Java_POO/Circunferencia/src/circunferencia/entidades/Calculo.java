package circunferencia.entidades;

import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class Calculo {

    private double radio;

    public Calculo(double radio) {
        this.radio = radio;
    }

   public void setRadio(double radio) {
        this.radio = radio;
    }

    public  double getRadio() {
        return radio;
    }

    public static double crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el radio de la circunferencia");
        double radio = leer.nextDouble();

        return radio;
    }
    
    public double area(){
        double area = Math.PI * (this.radio*this.radio);
        
        return area;
    }
    
        public double perimetro(){
        double perimetro = 2 * Math.PI * this.radio;
        
        return perimetro;
    }

}

