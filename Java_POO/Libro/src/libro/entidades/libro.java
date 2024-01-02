package libro.entidades;

/**
 *
 * @author jpach
 */
public class libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int n_pagina;
    
    public libro(){
        
    }
    
    public libro(int isbn, String titulo, String autor,int n_pagina){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.n_pagina = n_pagina;
        
    }
    
    public void setIsbn(int isbn){
        this.isbn = isbn;
        
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setN_pagina(int n_pagina) {
        this.n_pagina = n_pagina;
    }
    
    public int getIsbn(){
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getN_pagina() {
        return n_pagina;
    }

    @Override
    public String toString() {
        return "libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", n_pagina=" + n_pagina + '}';
    }
    
    
    
}
