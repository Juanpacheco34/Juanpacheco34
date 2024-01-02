package fraccionClass;

/**
 * Crear una clase llamada fracción que contenga 4 atributos (denominador y
 * numerador de cada fracción). Crear la clase servicio que contenga métodos
 * para sumar, restar, multiplicar y dividir fracciones. Mostrar por pantalla un
 * menú de opciones para que el usuario decida que ver.
 *
 * @author jpach
 */
public class FraccionClass {
    private int num1;
    private int deno1;
    private int num2;
    private int deno2;
    
    
    public FraccionClass(){
        
    }
    
    public FraccionClass(int num1,int deno1,int num2, int deno2){
        this.num1 = num1;
        this.deno1 = deno1;
        this.num2 = num2;
        this.deno2 = deno2;
        
    }
    
    public void setNum1(int num1){
        
    }
    
    public int getNum1(){
        return num1;
    }

    public int getDeno1() {
        return deno1;
    }

    public void setDeno1(int deno1) {
        this.deno1 = deno1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDeno2() {
        return deno2;
    }

    public void setDeno2(int deno2) {
        this.deno2 = deno2;
    }
    

}
