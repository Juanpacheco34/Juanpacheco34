/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.

 */
public class Velero extends Barco {
    protected int numeroMastil;

    public Velero() {
    }
 
    
    public Velero( String matricula, int numeroMastil, int tamañoEslora, int añoFabricacion) {
        super(matricula, tamañoEslora, añoFabricacion);
        this.numeroMastil = numeroMastil;
    }

    public int getNumeroMastil() {
        return numeroMastil;
    }

    public void setNumeroMastil(int numeroMastil) {
        this.numeroMastil = numeroMastil;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        setTamañoEslora(50 + (int)(Math.random()*59));
        setNumeroMastil((int) (Math.random()*4+1));
    }
    
    

    @Override
    public String toString() {
        
        return "Velero" + "\nmatricula: " + matricula + "\ntamano eslora: " + tamañoEslora + "\nanio fabricacion: " + añoFabricacion + "\nnumero Mastil: " + numeroMastil ;
    }
    
    
    
    
}
