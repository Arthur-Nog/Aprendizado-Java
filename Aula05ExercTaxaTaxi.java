package academy.introducao;
/*
    Dado o valor de um salário e uma taxa de imposto.
    Digite a taxa que a pessoa deverá pagar baseada em qual faixa salarial ela se encontrar!
 */
public class Aula05ExercTaxaTaxi {
    public static void main(String[] args){
        double salario_anual = 50000;
        double taxa1 = 9.7 / 100;
        double taxa2 = 37.35 / 100;
        double taxa3 = 49.50 / 100;

        if (salario_anual <= 34712){
            double pagamento = taxa1 * salario_anual;
            System.out.println("Deverá ser pago: " + pagamento);

        } else if (salario_anual >= 34713 && salario_anual <= 68507){
            double pagamento = taxa2 * salario_anual;
            System.out.println("O valor de taxa a ser pago é: " + pagamento);

        } else {
            double pagamento = taxa3 * salario_anual;
            System.out.println("A taxa a ser cobrada é: " + pagamento);

         }

        byte dia = 1;
        switch (dia){

            case 1:
                System.out.println("É dia ùtil");
                break;
            case 2:
                System.out.println("Não é dia útil");
                break;
            case 3:
                System.out.println("Não é dia útil");
                break;
            case 4:
                System.out.println("Não é dia útil");
                break;
            case 5:
                System.out.println("Não é dia útil");
                break;
            case 6:
                System.out.println("Não é dia útil");
                break;
            case 7:
                System.out.println("É dia útil");
                break;

            default:
                System.out.println("Digite um valor válido!");
                break;



        }


    }


}
