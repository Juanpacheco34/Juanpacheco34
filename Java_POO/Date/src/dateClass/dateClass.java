package dateClass;

import java.util.Date;

/**
 *
 * @author jpach
 */
public class dateClass {

    // Atributos
    private Date fecha;

    //Constructor por defecto
    public dateClass() {

    }

    //Constructor por parametros
    public dateClass(Date fecha) {
        this.fecha = fecha;

    }

    // SETTER Y GETTER
    public void setFecha(Date fecha) {
        this.fecha = fecha;

    }

    public Date getFecha() {
        return fecha;

    }

    @Override
    public String toString() {
        return "dateClass{" + "fecha=" + fecha + '}';
    }

}
