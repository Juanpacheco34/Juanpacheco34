/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 * @author jpach
 */
public class Hotel5 extends Hotel {

    protected int cantSalonesConferencia, cantSuites, cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantSalonesConferencia, int cantSuites, int cantLimosinas, int cantHabitaciones, int numCamas, int cantpisos, String nomRestaurante, String gimnasio, double precioHabitaciones, int capRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantpisos, nomRestaurante, gimnasio, precioHabitaciones, capRestaurante, nombre, direccion, localidad, gerente);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(int cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public void crearHotel5() {
        crearHotel();
        cantSuites = (int) (Math.random() * 5 + 1);
        cantSalonesConferencia = (int) (Math.random() * 5 + 1);
        cantLimosinas = (int) (Math.random() * 5 + 1);
        precioHabitaciones += (15 * cantLimosinas);
    }

    @Override
    public String toString() {
return "Ubicacion{" + "nombre: " + nombre +  " / direccion: " + direccion +  " / localidad: " + localidad +  " / gerente: " + gerente 
               + "\nHotel5 " +  " / cantHabitaciones: " + cantHabitaciones + " / numCamas: " + numCamas + " / cantpisos: " + cantpisos 
               + " / gimnasio: " + gimnasio + " / nomRestaurante: " + nomRestaurante + " / precioHabitaciones: " + precioHabitaciones 
               + " / capRestaurante: " + capRestaurante + " / cantSalonesConferencia: " + cantSalonesConferencia + 
        " / cantSuites: " + cantSuites + " / cantLimosinas: " + cantLimosinas + "\n";
    }

}
