package javacore.introducaoClasses.teste;

import javacore.introducaoClasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa estudante01 = new Pessoa();
        estudante01.nome = "Arthur";
        estudante01.sexo = 'M';
        estudante01.idade = 18;
        System.out.println(estudante01.nome);

    }
}
