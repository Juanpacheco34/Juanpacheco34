/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *• Potencia en CV para barcos a motor.

 * @author jpach
 */
public class BarcoMotor extends Barco {
    protected int potenciaCv;

    public BarcoMotor() {
    }
    

    public BarcoMotor(String matricula, int tamañoEslora, int potenciaCv, int añoFabricacion) {
        super(matricula, tamañoEslora, añoFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        setTamañoEslora(50 + (int)(Math.random()*70));
        setPotenciaCv(1000 + (int)(Math.random()*850));
    }
    
    

    @Override
    public String toString() {
        return "BarcoMotor" + "\nmatricula: " + matricula + "\ntamano eslora: " + tamañoEslora + "\nanio fabricacion: " + añoFabricacion +  "\npotencia cv: " + potenciaCv ;
    }
    
    
    
    
}
