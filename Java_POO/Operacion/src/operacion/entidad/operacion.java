/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion.entidad;

/**
 *
 * @author jpach
 */
public class operacion {
    private int num1;
    private int num2;

    public operacion() {
    }

    public operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
        public int suma(){
        int suma = this.num1 + this.num2;
        return suma;
    }
    
        public int resta(){
        int resta = this.num1 - this.num2;
        return resta;
    }
        
        public int multiplicar(){
            int multiplicar = 0;
            if (num1 == 0 || num2 ==0){
                System.out.println("Error nose puede multiplicar por '0' ");
                
            }
            else{
                multiplicar = this.num1 * this.num2;
            }
            return multiplicar;
        }
        
                public int dividir(){
            int dividir = 0;
            if (num1 == 0 || num2 ==0){
                System.out.println("Error nose puede dividir  por '0' ");
                
            }
            else{
                dividir = this.num1 / this.num2;
            }
            return dividir;
        }
    
    
}
