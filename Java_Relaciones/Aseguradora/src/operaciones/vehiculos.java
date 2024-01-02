/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 * Gestión de vehículos. Se registra la información de cada vehículo asegurado.
 * Marca, modelo, año, número de motor, chasis, color, tipo (camioneta, sedán,
 * etc.).
 *
 * @author jpach
 */
public class vehiculos {
    private String marca; 
    private String modelo;
    private int anio;
    private int numeroMotor;
    private String chasis;
    private String color;
    private String[] tipo = {"Camioneta","Sedan"};

    public vehiculos() {
    }
    

    public vehiculos(String marca, String modelo, int anio, int numeroMotor, String chasis, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "vehiculos{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }

}
