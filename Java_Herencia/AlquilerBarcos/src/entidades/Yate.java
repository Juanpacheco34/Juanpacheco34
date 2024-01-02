/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *• Potencia en CV y número de camarotes para yates de lujo.
 * @author jpach
 */
public class Yate extends BarcoMotor{
    protected int numeroCamarotes;

    public Yate() {
    }
    

    
    public Yate(String matricula, int tamañoEslora, int potenciaCv, int añoFabricacion, int numeroCamarotes) {
        super(matricula, tamañoEslora, potenciaCv, añoFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        setTamañoEslora(50 + (int)(Math.random()*85));
        setNumeroCamarotes((int) (Math.random()*4+1));
    }
    

    @Override
    public String toString() {
        return "Yate" + "\nmatricula: " + matricula + "\ntamano eslora: " + tamañoEslora + "\nanio fabricacion: " + añoFabricacion +  "\npotencia cv: " + potenciaCv + "\nnumeroCamarotes: " + numeroCamarotes ;
    }
    
    
    
}
