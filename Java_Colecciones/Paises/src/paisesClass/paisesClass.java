package paisesClass;

import java.util.Objects;

/**
 *Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)

 * @author jpach
 */
public class paisesClass {
    private String paises;

    public paisesClass() {
    }

    public paisesClass(String paises) {
        this.paises = paises;
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 59 * hash + Objects.hashCode(this.paises);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final paisesClass other = (paisesClass) obj;
//        if (!Objects.equals(this.paises, other.paises)) {
//            return false;
//        }
//        return true;
//    }
//    
//    

    @Override
    public String toString() {
        return "paises{" + "paises: " + paises + '}';
    }
    
    
    
}
