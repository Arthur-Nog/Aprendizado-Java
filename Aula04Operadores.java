package academy.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        int numero01 = 10;
        float numero02 = 20;
        float resultado = numero01 / numero02;
        System.out.println("O resultado é: " + resultado);

        boolean isNumero01MaiorNumero02 = numero01 > numero02;
        System.out.println(isNumero01MaiorNumero02);

        boolean isDentroDaLei = numero01 > 5 && numero02 > numero01;
        System.out.println(isDentroDaLei);

    }
}

