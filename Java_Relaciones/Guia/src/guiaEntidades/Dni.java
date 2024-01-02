/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiaEntidades;

/**
 *
 * @author jpach
 */
public class Dni {

    private String dni;


    public Dni() {
    } 
    
    public Dni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Dni{" + "dni=" + dni + '}';
    }


    
    
}
