package tiendaClass;

import java.util.Objects;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas.
 *
 * @author jpach
 */
public class tiendaClass {
    private Integer id; 
    private String nombre; //Nombre del producto
    private Integer precio; //Precio por unidad
    private Integer cantidad; //Cantidad actual
    private Integer valorTotal; //Valor de todas las udidades
    
    public tiendaClass(){
        
    }

    public tiendaClass(Integer id, String nombre, Integer precio, Integer cantidad, Integer valorTotal) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.valorTotal = valorTotal;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final tiendaClass other = (tiendaClass) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }


    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "tiendaClass{" + "id: " + id + ", producto: " + nombre + ", precio: " + precio + ", cantidad: " + cantidad + ", valorTotal: " + valorTotal + '}';
    }
    
    


}
