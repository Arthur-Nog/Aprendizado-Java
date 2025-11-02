package calculadorafinal;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;


public class Calculadora {
    Scanner ler = new Scanner(System.in);
    ArrayList<Double> valores = new ArrayList<>();
    String acao;


    String p1 ="s";
    double valor;

    public ArrayList<Double> pedir_valores(){
        while (Objects.equals(p1, "s")){
            System.out.println("Digite um valor: \n");
            valor = ler.nextDouble();
            valores.add(valor);
            ler.nextLine();
            System.out.println("Digite s se quiser continuar!");
            p1 = ler.next();
            ler.nextLine();
        }
        return valores;
    }

    public void iniciar(){
            System.out.println("\nDigite uma ação que você deseja fazer na calculadora!!\n +  Adição \n -  Subtração \n *  Multiplicação \n /  Divisão \n !  Encerrar Operação\n");
            acao = ler.next();

            ArrayList<Double> vals = pedir_valores();
            switch (acao) {
                case "+":
                    System.out.println("O resultado da operação é: " + adicao(vals));
                    break;

                case "-":
                    vals = pedir_valores();
                    System.out.println("O resultado da operação é: " + sub(vals));
                    break;

                case "*":
                    vals = pedir_valores();
                    System.out.println("O resultado da operação é: " + mul(vals));
                    break;

                case "/":
                    vals = pedir_valores();
                    System.out.println("O resultado da operação é: " + div(vals));
                    break;

                default:
                    break;
            }
    }

    public double adicao(ArrayList<Double> valores){
        double soma = 0;
        for (Double valore : valores) {
            soma = soma + valore;
        }
        return soma;
    }

    public double sub(ArrayList<Double> valores){
        double subi = valores.get(0);
        for (int i = 1; i < valores.size(); i++) {
            subi = subi - valores.get(i);
        }
        return subi;
    }

    public double mul(ArrayList<Double> valores){
        double mul = 1;
        for (Double valore : valores) {
            mul = valore * mul;
        }
        return mul ;
    }

    public double div(ArrayList<Double> valores){
        double divi = valores.get(0);
        for(int i = 1; i < valores.size(); i++){
            divi = divi / valores.get(i);
        }
        return divi;
    }


    }
