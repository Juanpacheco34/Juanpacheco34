/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 * Existen dos tipos de alojamientos extrahoteleros: los Camping y las
 * Residencias. Para los Camping se indica la capacidad máxima de carpas, la
 * cantidad de baños disponibles y si posee o no un restaurante dentro de las
 * instalaciones.
 *
 * @author jpach
 */
public class Camping extends ExtraHoteles {

    protected int cantCarpas;
    protected int cantbanos;
    protected boolean restaurante;

    public Camping() {
    }

    public Camping(int cantCarpas, int cantbanos, boolean restaurante, boolean privacidad, double tamano, String nombre, String direccion, String localidad, String gerente) {
        super(privacidad, tamano, nombre, direccion, localidad, gerente);
        this.cantCarpas = cantCarpas;
        this.cantbanos = cantbanos;
        this.restaurante = restaurante;
    }



    public Camping(int cantCarpas, int cantbanos, boolean restaurante, boolean privacidad, double tamano) {
        super(privacidad, tamano);
        this.cantCarpas = cantCarpas;
        this.cantbanos = cantbanos;
        this.restaurante = restaurante;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getCantbanos() {
        return cantbanos;
    }

    public void setCantbanos(int cantbanos) {
        this.cantbanos = cantbanos;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    public void crearCamping() {
        super.crearExtraHoteles();
        cantCarpas = 100 + (int) (Math.random() * 45);
        cantbanos = 30 + (int) (Math.random() * 40);
        boolean[] restaurante = {true, false};
        this.restaurante = restaurante[(int) (Math.random() * restaurante.length)];
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "nombre: " + nombre + " / direccion: " + direccion + " / localidad: " + localidad + " / gerente: " + gerente 
                + "\nCamping " + " / cantCarpas: " + cantCarpas + " / cantbanos: " + cantbanos + " / restaurante: " + restaurante
                + " / privacidad: " + privacidad + " / tamano: " + (Math.round(tamano*100) /100.0) + "\n";
    }

}
