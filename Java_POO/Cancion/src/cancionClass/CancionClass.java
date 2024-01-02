package cancionClass;

/**
 *
 * @author jpach
 */
public class CancionClass {
    private String titulo,autor;
    
//Constructores

    public CancionClass() {
    }

    public CancionClass(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    //Get y Set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}

