/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo.entidades;

/**
 *
 * @author jpach
 */
public class rectanguloClass {
    private int base;
    private int altura;
    
    public rectanguloClass(){
        
    }
    
    public rectanguloClass(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public void setAltura(int altura){
        this.altura= altura;
    }
    
    public int getBase(){
        return base;
    }
    
    public int getAltura(){
        return altura;
    }
    
}
