/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletaEntidad;

/**
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente.
 *
 * @author jpach
 */
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }
    

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevolver() {
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//  deben ser aleatorios.
        this.posicionActual = (int) (Math.random() * 6 + 1);
        this.posicionAgua = (int) (Math.random() * 6 + 1);
    }

    public boolean mojar() {
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
        return posicionActual == posicionAgua;
    }

    public int siguienteChorro() {
//• siguienteChorro(): cambia a la siguiente posición del tambor
        if (posicionActual == 6) {
            return this.posicionActual = 1;
        }
        return this.posicionActual += 1;
    }

    @Override
    public String toString() {
//• toString(): muestra información del revolver (posición actual y donde está el agua)
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

}
