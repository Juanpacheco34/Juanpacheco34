/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
 * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad y
 * raza del Animal. Crear un método en la clase Animal a través del cual cada
 * clase hija deberá mostrar luego un mensaje por pantalla informando de que se
 * alimenta. Generar una clase Main que realice lo siguiente:
 *
 * @author jpach
 */
public class animal {

    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public void alimentacion(){
        System.out.println("Me alimento de " + alimento);
    }
    
    @Override
    public String toString() {
        return "animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    
}
