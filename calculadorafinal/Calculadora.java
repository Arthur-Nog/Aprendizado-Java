package calculadorafinal;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;


public class Calculadora {
    Scanner ler = new Scanner(System.in);
    ArrayList<Double> valores = new ArrayList<>();
    int acao;


    String p1 = "sim";
    double valor;

    public ArrayList<Double> pedir_valores(){
        while (Objects.equals(p1, "sim")){
            System.out.println("Digite um valor: \n");
            valor = ler.nextDouble();
            valores.add(valor);
            ler.nextLine();
            System.out.println("Digite 'sim' se quiser continuar!");
            p1 = ler.next();
            ler.nextLine();
        }
        return valores;
    }

    public void iniciar(){
            System.out.println("\nDigite uma ação que você deseja fazer na calculadora!!\n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - Encerrar Operação\n");
            acao = ler.nextInt();
            ArrayList<Double> vals = pedir_valores();
            switch (acao) {
                case 1:
                    System.out.println(adicao(vals));
                    break;

                case 2:
                    vals = pedir_valores();
                    System.out.println(sub(vals));
                    break;

                case 3:
                    vals = pedir_valores();
                    System.out.println(mul(vals));
                    break;


                case 4:
                    vals = pedir_valores();
                    System.out.println(div(vals));
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
