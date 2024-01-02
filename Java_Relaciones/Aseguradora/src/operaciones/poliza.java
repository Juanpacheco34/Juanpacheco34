/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;


import java.util.Date;


/**
 * Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos
 * tanto de un vehículo, como los datos de un solo cliente. Los datos incluidos
 * en ella son: número de póliza, fecha de inicio y fin de la póliza, cantidad
 * de String, forma de pago, monto total asegurado, incluye granizo, monto
 * máximo granizo, tipo de cobertura (total, contra terceros, etc.). Nota:
 * prestar atención al principio de este enunciado y pensar en las relaciones
 * entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
 * muchos a uno o de muchos a muchos.
 *
 * @author jpach
 */
public class poliza {
    private int numeroPoliza;
    private Date fechaInicio;
    private Date fechaTermino;
    private int cantidadCuotas;
    private String formaPago;
    private String granizo;
    private int montoGranizo;
    private String tipoCobertura;

    public poliza() {
    }

    public poliza(int numeroPoliza, Date fechaInicio, Date fechaTermino, int cantidadCuotas, String formaPago, String granizo, int montoGranizo, String tipoCobertura) {
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getGranizo() {
        return granizo;
    }

    public void setGranizo(String granizo) {
        this.granizo = granizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "poliza{" + "numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaTermino=" + fechaTermino + ", cantidadCuotas=" + cantidadCuotas + ", formaPago=" + formaPago + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }



 

 
    
    
    
    
    
    
    

}
