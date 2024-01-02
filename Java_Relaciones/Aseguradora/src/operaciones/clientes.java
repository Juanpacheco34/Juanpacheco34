/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 * Gestión Integral de clientes. En este módulo vamos a registrar la información
 * personal de cada cliente que posea pólizas en nuestra empresa. Nombre y
 * apellido, documento, mail, domicilio, teléfono.
 *
 * @author jpach
 */
public class clientes {
    private String nombre;
    private String apellido;
    private int documento;
    private String email;
    private String domicilio;
    private long telefono;

    public clientes() {
    }

    public clientes(String nombre, String apellido, int documento, String email, String domicilio, long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", email=" + email + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }

}
