/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author jpach
 */
public class lavadora extends electrodomesticos {
//atributo carga,además de los atributos heredados.

    protected int carga;

//    Constructores
    public lavadora() {

    }

    public lavadora(int carga, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

//    Get y Set
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

//    ToString
    @Override
    public String toString() {
        return "Lavadora ->" + " precio: " + precio + " / color: " + color + " / consumo: " + consumo + " / peso: " + peso + " / carga: " + carga +'}';
    }

    public void crearLavadora() {

//Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
        crearElectrodomesticos();
        precioFinal();
        
//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.

        this.carga = 10 + (int) (Math.random() * 30);
        if (this.carga > 30) {
            setPrecio(getPrecio() + 500);
        } else{

        }

    }


}
