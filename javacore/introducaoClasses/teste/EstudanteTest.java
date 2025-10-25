package javacore.introducaoClasses.teste;

import javacore.introducaoClasses.AintrocucaoMetodo.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante1.nome = "Arthur";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Cláudinete";
        estudante2.idade = 60;
        estudante2.sexo = 'F';

       estudante1.imprime();
       estudante2.imprime();

    }


}
