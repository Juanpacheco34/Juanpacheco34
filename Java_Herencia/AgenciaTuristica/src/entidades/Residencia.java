/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 * Para las residencias se indica la cantidad de habitaciones, si se hacen o no
 * descuentos a los gremios y si posee o no campo deportivo. Realizar un
 * programa en el que se representen todas las relaciones descriptas.
 *
 * @author jpach
 */
public class Residencia extends ExtraHoteles {

    protected int cantHabitaciones;
    protected boolean descuentos;
    protected boolean campDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentos, boolean campDeportivo, boolean privacidad, double tamano, String nombre, String direccion, String localidad, String gerente) {
        super(privacidad, tamano, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentos = descuentos;
        this.campDeportivo = campDeportivo;
    }



    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampDeportivo() {
        return campDeportivo;
    }

    public void setCampDeportivo(boolean campDeportivo) {
        this.campDeportivo = campDeportivo;
    }

    public void crearResidencia() {
        super.crearExtraHoteles();
        cantHabitaciones = 100 + (int) (Math.random() * 45);
        boolean[] descuentos = {true, false};
        this.descuentos = descuentos[(int) (Math.random() * descuentos.length)];
        boolean[] campDeportivo = {true, false};
        this.descuentos = campDeportivo[(int) (Math.random() * campDeportivo.length)];
    }
    
    @Override
    public String toString() {
        return "Ubicacion{" + "nombre: " + nombre + "/ direccion: " + direccion + "/ localidad: " + localidad + "/ gerente: " + gerente 
                + "\nResidencia " + " / cantHabitaciones: " + cantHabitaciones + " / descuentos: " + descuentos + " / campDeportivo: " 
                + campDeportivo + " / privacidad: " + privacidad + " / tamano: " + (Math.round(tamano*100) /100.0) + "\n";
    }


}
