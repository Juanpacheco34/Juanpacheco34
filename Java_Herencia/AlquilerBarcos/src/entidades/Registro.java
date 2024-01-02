/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
 * Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler,
 * fecha de devolución, la posición del amarre y el barco que lo ocupará.
 *
 * @author jpach
 */
public class Registro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private int documento;
    private LocalDate fechaAlq;
    private LocalDate fechaDev;
    private String posicionAmarre;
    private long valorPagar;
    private long dias;
    private Velero velero;
    private BarcoMotor barcoMotor;
    private Yate yate;

    public Registro() {
    }

    public Registro(String nombre, int documento, LocalDate fechaAlq, LocalDate fechaDev, long dias, String posicionAmarre) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.dias = dias;
        this.posicionAmarre = posicionAmarre;
    }

    public Registro(String nombre, int documento, LocalDate fechaAlq, LocalDate fechaDev, long dias, String posicionAmarre, long valorPagar, Velero velero) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.dias = dias;
        this.posicionAmarre = posicionAmarre;
        this.valorPagar = valorPagar;
        this.velero = velero;
    }

    public Registro(String nombre, int documento, LocalDate fechaAlq, LocalDate fechaDev, long dias, String posicionAmarre, long valorPagar, BarcoMotor barcoMotor) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.dias = dias;
        this.posicionAmarre = posicionAmarre;
        this.valorPagar = valorPagar;
        this.barcoMotor = barcoMotor;
    }

    public Registro(String nombre, int documento, LocalDate fechaAlq, LocalDate fechaDev, long dias, String posicionAmarre, long valorPagar, Yate yate) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.dias = dias;
        this.posicionAmarre = posicionAmarre;
        this.valorPagar = valorPagar;
        this.yate = yate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(LocalDate fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public long getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(long valorPagar) {
        this.valorPagar = valorPagar;
    }

    public long getDias() {
        return dias;
    }

    public void setDias(long dias) {
        this.dias = dias;
    }

    public void crearcliente() {
        System.out.print("Nombre: ");
        setNombre(leer.next().toUpperCase());

        setDocumento((int) (Math.random() * 1002193737 + 1000000000));

//        System.out.println("Fecha Alquiler: ");

        int anio = 2023; //2010 + (int) (Math.random() * 14);
        int mes = (int) (Math.random() * 10 + 1);
        int dia = (int) (Math.random() * 27 + 1);

        fechaAlq = LocalDate.of(anio, mes, dia);
        fechaDev = LocalDate.of(anio, mes+1, dia);

        setDias(ChronoUnit.DAYS.between(fechaAlq, fechaDev));

        String amarres[] = {"AMARRE DE BOYA UNICA", "AMARRE DE BOYA CONVENCIONAL", "AMARRE BALTICO", "AMARRE MEDITERRANEO", "AMARRES CON USO DE ANCLA"};
        setPosicionAmarre(amarres[(int) (Math.random() * amarres.length)]);
    }

    @Override
    public String toString() {

        if (null != velero) {
            return "Registro " + "\nnombre: " + nombre + "\ndocumento: " + documento + "\nfecha alquiler: " + fechaAlq + "\nfecha devolucion: " + fechaDev + "\nposicion amarre: " + posicionAmarre + "\ndias: " + dias + "\nvalor pagar: " + valorPagar + "\n\nbarco:" + velero;

        }
        if (null != barcoMotor) {
            return "Registro " + "\nnombre: " + nombre + "\ndocumento: " + documento + "\nfecha alquiler: " + fechaAlq + "\nfecha devolucion: " + fechaDev + "\nposicion amarre: " + posicionAmarre + "\ndias: " + dias + "\nvalor pagar: " + valorPagar + "\n\nbarco:" + barcoMotor;

        }
        if (null != yate) {
            return "Registro " + "\nnombre: " + nombre + "\ndocumento: " + documento + "\nfecha alquiler: " + fechaAlq + "\nfecha devolucion: " + fechaDev + "\nposicion amarre: " + posicionAmarre + "\ndias: " + dias + "\nvalor pagar: " + valorPagar + "\n\nbarco:" + yate;

        }
        return null;

    }

}
