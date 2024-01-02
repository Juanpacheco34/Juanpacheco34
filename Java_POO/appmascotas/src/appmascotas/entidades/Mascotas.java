package appmascotas.entidades;

/**
 *
 * @author jpach
 */
public class Mascotas {

    private String nombre;
    private int edad;
    private String color;
    private String raza;
    private int energia;

    //Constructor sin parametros
    public Mascotas() {
    }

    //Constructor con Argumentos o parametros
    public Mascotas(String nombre, int edad, String color, String raza, int energia) {
        //Referenciar los atributos argumentados en el constructor
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.raza = raza;
        this.energia = energia;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public int pasear(int energiaRestar) { //Metodo de operacion
        this.energia -= energiaRestar;

        return energia;
    }

    //Sobre carga de un metodo
    /** Documentacion de metodos
     * 
     * @param energiaRestar
     * @param vueltas
     * @return 
     */
    public int pasear(int energiaRestar, int vueltas) {
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;

        }
        return energia;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", edad=" + edad + ", color=" + color + ", raza=" + raza + ", energia=" + energia + '}';
    }

}
