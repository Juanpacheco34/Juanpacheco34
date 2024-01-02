package movilClass;

/**

 * @author jpach
 */
public class MovilClass {
        private String marca;
        private double precio;
        private String modelo;
        private int memoriRam;
        private int almacenamiento;
        private int[] codigo = new int [7];
        
        
        //Constructores

    public MovilClass() {
    }

    public MovilClass(String marca, double precio, String modelo, int memoriRam, int almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriRam = memoriRam;
        this.almacenamiento = almacenamiento;

    }
        
    //Set y Get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriRam() {
        return memoriRam;
    }

    public void setMemoriRam(int memoriRam) {
        this.memoriRam = memoriRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    //toString

    @Override
    public String toString() {
        return "MovilClass{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriRam=" + memoriRam + ", almacenamiento=" + almacenamiento + '}';
    }

   
    
        
        
    
}
