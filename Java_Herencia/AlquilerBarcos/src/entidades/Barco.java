/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.

 * @author jpach
 */
public class Barco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String matricula;
    protected int tamañoEslora;
    protected int añoFabricacion;

    public Barco() {
    }

    
    public Barco(String matricula, int tamañoEslora, int añoFabricacion) {
        this.matricula = matricula;
        this.tamañoEslora = tamañoEslora;
        this.añoFabricacion = añoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTamañoEslora() {
        return tamañoEslora;
    }

    public void setTamañoEslora(int tamañoEslora) {
        this.tamañoEslora = tamañoEslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    public void crearBarco(){
       System.out.print("Ingrese la matricula del barco: ");
        setMatricula(leer.next().toUpperCase());
        setAñoFabricacion(1900 + (int)(Math.random()*110));
       
        
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", tama\u00f1oEslora=" + tamañoEslora + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }
    
    
    
    
}
