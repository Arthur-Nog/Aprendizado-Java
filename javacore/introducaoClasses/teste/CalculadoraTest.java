package javacore.introducaoClasses.teste;

import javacore.introducaoClasses.AintrocucaoMetodo.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora calculo1 = new Calculadora();
        calculo1.somarDoisNumeros();
        calculo1.multiplicaDoisNumeros(5,3);
        double result = calculo1.divideDoisNumeros(6,2);
        System.out.println(result);

        Calculadora calculadora = new Calculadora();
        int[] nums= {1,2,3,4,5,6};
        calculadora.somar(1,2,3,4,5,6,7);
    }


}
