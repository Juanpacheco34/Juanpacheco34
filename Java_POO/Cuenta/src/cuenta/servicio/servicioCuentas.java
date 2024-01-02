package cuenta.servicio;

import java.util.Scanner;
import cuenta.entidades.cuentaBancaria;

/**
 * @author jpach
 */
public class servicioCuentas {

    private Scanner leer = new Scanner(System.in);

    public cuentaBancaria crearCuenta() {
        System.out.println("Ingrese los datos de su Cuenta: ");
        System.out.println("Ingrese su numero de cuenta");
        long numeroCuenta = leer.nextLong();
        System.out.println("Ingrese du DNI");
        int dni = leer.nextInt();
        System.out.println("¿ Cual es su saldo actual ?");
        long saldoActual = leer.nextLong();

        return new cuentaBancaria(numeroCuenta, dni, saldoActual);

    }

    public void ingreso(cuentaBancaria crearCuenta) {
        long  ingreso = crearCuenta.getSaldoActual();
        System.out.println("Cual es el monto a ingresar: ");
        ingreso += leer.nextDouble();
        crearCuenta.setSaldoActual(ingreso);
        System.out.println("Su saldo actual es: " + crearCuenta.getSaldoActual());
        
    }

    public void retirar(cuentaBancaria crearCuenta) {
        System.out.println("Cual es el monto a retirar: ");
        long retirar = leer.nextLong();
        if(retirar > crearCuenta.getSaldoActual()){
            System.out.println("Saldo Insuficiente");
            System.out.println("Su saldo actual es: "+ crearCuenta.getSaldoActual());
            
        }
        
        else{
        System.out.println("Retiro exitoso");
        crearCuenta.setSaldoActual(crearCuenta.getSaldoActual() - retirar);
        System.out.println("Su saldo actual es: "+ crearCuenta.getSaldoActual());
        }
    }
    
    public void extracionRapida(cuentaBancaria crearCuenta){
        System.out.println("La extraccion rapida permitirá sacar solo un 20% de su saldo. ");
        System.out.println("Ingrese la cantidad a retirar: ");
        double S = crearCuenta.getSaldoActual(),ER = leer.nextDouble(), P = 20;
        P = (P * S)/100;
        if(ER>P){
            System.out.println("El retiro a realizar es mayor al 20%");
        }
        else{
             S = crearCuenta.getSaldoActual() - ER;
            System.out.println("Retiro exitoso: " + ER);
            crearCuenta.setSaldoActual((long) S);
            System.out.println("Su saldo actual es:" + crearCuenta.getSaldoActual());
        }
    }
        public void consultarSaldo(cuentaBancaria crearCuenta) {
        System.out.println("Su saldo actual es: " + crearCuenta.getSaldoActual());
        }

        public void consultarDatos(cuentaBancaria crearCuenta) {
        System.out.println(crearCuenta);
        }

}
