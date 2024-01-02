/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.Entidades;

/**
 *
 * @author jpach
 */
public class Fabricantes {
    private int codigo;
    private String nombre;

    public Fabricantes() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabricantes{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
    
}
