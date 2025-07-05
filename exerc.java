package academy.introducao;

public class exerc {
    //Dado o valor de um carro, descubra em quantas ele pode ser parcelado;
    //Condição: ValorParcela >=1000;
    public static void main(String [] agrs) {

        double valorCarro = 75000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela>=1000){
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }else{
                break;
            }

        }

    }
}
