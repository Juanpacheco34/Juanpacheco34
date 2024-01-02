/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. 
 * @author jpach
 */
public class ExtraHoteles extends Destino{
    protected boolean privacidad;
    protected double tamano;

    public ExtraHoteles() {
    }

    
    public ExtraHoteles(boolean privacidad, double tamano) {
        this.privacidad = privacidad;
        this.tamano = tamano;
    }

    public ExtraHoteles(boolean privacidad, double tamano, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privacidad = privacidad;
        this.tamano = tamano;
    }
    
    

    public boolean isPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(boolean privacidad) {
        this.privacidad = privacidad;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    public void crearExtraHoteles(){
       boolean[] privacidad = {true,false};
       this.privacidad = privacidad[(int) (Math.random()*privacidad.length)];
       
       double largo = 500 + Math.random()*500,ancho = 500 + Math.random()*500;
       tamano = largo*ancho;
    }

    @Override
    public String toString() {
        return "ExtraHoteles{" + "privacidad=" + privacidad + ", tamano=" + tamano + '}';
    }
    
    
    


    
    
}
