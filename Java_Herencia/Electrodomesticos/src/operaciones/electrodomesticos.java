/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jpach
 */
public class electrodomesticos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//atributos: precio, color, consumo energético (letras entre A y F) y peso.FF

    protected String nombre;
    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;

//    Constructores
    public electrodomesticos() {
    }

    public electrodomesticos(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public electrodomesticos(String nombre, int precio, String color, char consumo, int peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

//    Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

//    ToString
    @Override
    public String toString() {
        return "electrodomesticos ->" + " nombre: " + nombre + " / precio: " + precio + " / color: " + color + " / consumo: " + consumo + " / peso: " + peso + '}';
    }

//    Metodos
    public void consumoEnergetico() {

//Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
        System.out.print("Ingrese la letra del consumo enegetico [A-F]: ");
        consumo = leer.next().toUpperCase().charAt(0);
        if (consumo >= 'A' && consumo <= 'F') {
            this.consumo = consumo;
        } else {
            this.consumo = 'F';
        }

    }

    public void comprobarColor() {

//• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        System.out.println("Ingrese un color " + Arrays.toString(colores) + ": ");
        color = leer.next().toUpperCase();
        if (Arrays.stream(colores).anyMatch(x -> x.equalsIgnoreCase(color))) {
            this.color = color;

        } else {
            this.color = "Blanco";
        }
    }

    public void comprobarPeso() {
        this.peso = (int) (Math.random() * 100 + 1);
    }

    public void crearElectrodomesticos() {

//Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
        setPrecio(1000);
        comprobarColor();
        consumoEnergetico();
        comprobarPeso();

    }

    public void precioFinal() {

//• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
        switch (getConsumo()) {
            case 'A':
                setPrecio(getPrecio() + 1000);
                break;
            case 'B':
                setPrecio(getPrecio() + 800);
                break;
            case 'C':
                setPrecio(getPrecio() + 600);
                break;
            case 'D':
                setPrecio(getPrecio() + 500);
                break;
            case 'E':
                setPrecio(getPrecio() + 300);
                break;
            case 'F':
                setPrecio(getPrecio() + 100);
                break;
            default:

        }

        if (getPeso() >= 1 && getPeso() <= 19) {
            setPrecio(getPrecio() + 100);
        } else if (getPeso() >= 20 && getPeso() <= 49) {
            setPrecio(getPrecio() + 500);
        } else if (getPeso() >= 50 && getPeso() <= 79) {
            setPrecio(getPrecio() + 800);
        } else if (getPeso() >= 80) {
            setPrecio(getPrecio() + 1000);
        }

    }
}
