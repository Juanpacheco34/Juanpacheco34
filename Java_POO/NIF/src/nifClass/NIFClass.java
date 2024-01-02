package nifClass;

/**
 *
 * @author jpach
 */
public class NIFClass {
    private long dni;
    private String letra;

    public NIFClass() {
    }

    public NIFClass(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIFClass{" + "dni=" + dni + ", letra=" + letra + '}';
    }
    
    
    
}
