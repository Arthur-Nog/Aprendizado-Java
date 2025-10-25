package javacore.introducaoClasses.teste;

import javacore.introducaoClasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args){

    Carro carro1 = new Carro();
    carro1.nome = "Fiat";
    carro1.modelo = "Uno";
    carro1.ano = 2000;

    Carro carro2 = new Carro();
    carro2.nome = "Gol";
    carro2.modelo = "Bolinha";
    carro2.ano = 2010;

    System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
    System.out.println("--------------------------------------------------------------------------");
    System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);



    }

}
