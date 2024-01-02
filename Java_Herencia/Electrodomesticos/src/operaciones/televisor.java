/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author jpach
 */
public class televisor extends electrodomesticos {

    protected int resolucion;
    protected boolean tdt;

//    Constructores
    public televisor() {
    }

    public televisor(int resolucion, boolean tdt) {
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public televisor(int resolucion, boolean tdt, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

//    Get y Set
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

//    ToString
        @Override
    public String toString() {
        return "Televisor ->" + " precio: " + precio + " / color: " + color + " / consumo: " + consumo + " / peso: " + peso + " / resolucion: " + resolucion +" / TDT: " + tdt +'}';
    }
    
//    Metodos
    public void crearTelevisor() {

//Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
        crearElectrodomesticos();
        precioFinal();

//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio
        this.resolucion = (int) (Math.random() * 50+24);
        if (this.resolucion > 40) {
            setPrecio((int) (getPrecio() * 1.30));

        }
        
        System.out.println("Indique si el televisor tiene TDT incorporado [true/false]");
        this.tdt = leer.nextBoolean();
        
       if(this.tdt == true){
           setPrecio(getPrecio()+500);
       }

    }

}
