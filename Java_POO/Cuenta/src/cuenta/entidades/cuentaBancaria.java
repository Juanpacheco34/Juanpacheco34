package cuenta.entidades;

/** 
 * @author jpach
 */
public class cuentaBancaria {
    private long numeroCuenta;
    private int dni;
    private long saldoActual;
    
    public cuentaBancaria(){
        
    }
    public cuentaBancaria(long numeroCuenta, int dni, long saldoActual){
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        
    }
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public long getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public int getDni(){
        return dni;
    }
    public void setSaldoActual(long saldoActual){
        this.saldoActual = saldoActual;
    }
    public long getSaldoActual(){
        return saldoActual;
    }

    @Override
    public String toString() {
        return "cuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    
}
