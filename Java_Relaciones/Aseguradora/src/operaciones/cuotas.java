/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import java.util.Date;

/**
 *Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 * @author jpach
 */
public class cuotas {
    private int numeroCuotas;
    private int montoDeuda;
    private String validacionPago;
    private Date fechaVencimiento;
    private String formaPago;

    public cuotas() {
    }

    public cuotas(int numeroCuotas, int montoDeuda, String validacionPago, Date fechaVencimiento, String formaPago) {
        this.numeroCuotas = numeroCuotas;
        this.montoDeuda = montoDeuda;
        this.validacionPago = validacionPago;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }



    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public int getMontoDeuda() {
        return montoDeuda;
    }

    public void setMontoDeuda(int montoDeuda) {
        this.montoDeuda = montoDeuda;
    }

    public String getValidacionPago() {
        return validacionPago;
    }

    public void setValidacionPago(String validacionPago) {
        this.validacionPago = validacionPago;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "cuotas{" + "numeroCuotas=" + numeroCuotas + ", montoDeuda=" + montoDeuda + ", validacionPago=" + validacionPago + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }


    
    
    
}
