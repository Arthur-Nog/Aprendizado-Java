package javacore.introducaoClasses.AintrocucaoMetodo;

public class Funcionario {

    private String nome;
    private int idade;
    public double[] salario;
    public double media;

//    public void imprime(){
//        System.out.println("Nome: "+ this.nome);
//        System.out.println("Idade: "+ this.idade);
//        for(double salarios : this.salario){
//            System.out.print(salarios + " ");
//        }
//    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void mediaSalarial(){
        double soma = 0;
        for(double salarios : this.salario){
            soma += salarios;
        }
        media = soma/ salario.length;
        System.out.println("\n A média salarial é: " + media);


    }
}