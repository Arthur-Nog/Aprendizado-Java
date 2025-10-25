package javacore.introducaoClasses.teste;

import javacore.introducaoClasses.AintrocucaoMetodo.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario();


        funcionario1.salario = new double[]{1050,4900,4500};

        funcionario1.setNome("Arthur");
        funcionario1.setIdade(18);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getIdade());
        funcionario1.mediaSalarial();

    }
}
