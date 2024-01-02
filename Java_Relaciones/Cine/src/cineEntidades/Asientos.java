/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineEntidades;

/**
 * @author jpach
 */
public class Asientos {
    private    String[][] asientos = {{"A1", "A2", "A3", "A4","A5","A6","A7","A8"},
                                      {"B1", "B2", "B3", "B4","B5","B6","B7","B8"},
                                      {"C1", "C2", "C3", "C4","C5","C6","C7","C8"},
                                      {"D1", "D2", "D3", "D4","D5","D6","D7","D8"},
                                      {"F1", "F2", "F3", "F4","F5","F6","F7","F8"},
                                      {"G1", "G2", "G3", "G4","G5","G6","G7","G8"}};

    public Asientos() {
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Asientos{" + "asientos=" + asientos + '}';
    }
    
    
    
}
