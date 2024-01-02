/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 * Los alojamientos se identifican por un nombre, una dirección, una localidad y
 * un gerente encargado del lugar. La compañía trabaja con dos tipos de
 * alojamientos: Hoteles y Alojamientos Extrahoteleros.
 *
 * @author jpach
 */
public class Destino {

    protected String nombre, direccion, localidad, gerente;

    public Destino() {
    }

    public Destino(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public void creaDestino() {
        String[] nombres = {"Hotel Estrella", "Gran Hotel Imperial", "Hotel del Mar", "Hotel Paraiso", "Hotel Encanto", "Hotel Oasis",
            "Hotel Sol y Luna", "Hotel Serenidad", "Hotel Esperanza", "Hotel Brillante", "Hotel Maravillas", "Hotel Encantado",
            "Hotel Sonado", "Hotel Divino", "Hotel Elegante", "Hotel Amanecer", "Hotel Delicia", "Hotel Sereno", "Hotel Belleza",
            "Hotel Suenos", "Hotel Dorado", "Hotel Marfil", "Hotel Primavera", "Hotel Celestial", "Hotel Encanto", "Hotel Dorado",
            "Hotel Paraiso", "Hotel Magnífico", "Hotel Mirador", "Hotel Fantasia", "Hotel Solitario", "Hotel Estelar",
            "Hotel Encantador", "Hotel Serenata", "Hotel Sonador", "Hotel Delirio"};
        this.nombre = nombres[(int) (Math.random() * nombres.length)];

        String[] direccion = {"123 Calle Principal", "Avenida de los Pinos 456", "Callejón del Sol 789", "12 Avenida Norte",
            "Calle del Mar 34", "Paseo de la Luna 567", "Avenida de los Robles 890", "Callejuela del Sol 1234", "456 Calle Principal",
            "Avenida de las Flores 7890", "Calle del Bosque 5678", "Paseo del Mar 901", "Avenida de los Girasoles 2345", "Calle del Sol 6789",
            "1234 Avenida Principal"};
        this.direccion = direccion[(int) (Math.random() * direccion.length)];

        localidad = "Cartagena";

        String[] gerente = {"Liam Smith", "Olivia Johnson", "Noah Williams", "Emma Brown", "Sophia Jones", "Jackson Davis",
            "Ava Martinez", "Lucas Taylor", "Mia Anderson", "Aiden Wilson", "Isabella Thomas", "Caleb Clark", "Harper Rodriguez",
            "Henry Martinez", "Ella Scott"};
        this.gerente = gerente[(int) (Math.random() * gerente.length)];
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "nombre: " + nombre + "/ direccion: " + direccion + "/ localidad: " + localidad + "/ gerente: " + gerente + '}';
    }
}
