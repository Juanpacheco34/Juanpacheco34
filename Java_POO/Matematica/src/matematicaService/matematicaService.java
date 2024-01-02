/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicaService;

import matematicaClass.matematicaClass;

/**
 * Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos
 * valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
 * del número.
 *
 *
 * @author jpach
 */
public class matematicaService {

    public matematicaClass insert() {
        double num1 = Math.random() * 100;
        double num2 = Math.random() * 100;

        return new matematicaClass(num1, num2);

    }

    public double devolverMayor(matematicaClass insert) {
        double mayor = Math.max(insert.getNum1(), insert.getNum2());

        return mayor;

    }

    public double calcularPotencia(matematicaClass insert) {
        double mayor = Math.max(insert.getNum1(), insert.getNum2());
        double menor = Math.min(insert.getNum1(), insert.getNum2());

        double potencia = Math.pow(mayor, menor);

        return potencia;

    }

    public double calcularRaiz(matematicaClass insert) {
        double menor = Math.abs(Math.min(insert.getNum1(), insert.getNum2()));
        menor = Math.sqrt(menor);

        return menor;

    }

}
