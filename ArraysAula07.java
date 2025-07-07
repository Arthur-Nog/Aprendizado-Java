package academy.introducao;

public class ArraysAula07 {
    public static void main(String[] args){

        // 1 opção para criar um Array:
        int[] nomes = new int[3];
        nomes[0] = 18;
        nomes[1] = 38;
        nomes[2] = 28;
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        // 2 opção para criar um Array
        int[] idades = {18,19,20,18};

        // 3 opção para criar um Array
        int[] pesos = new int[]{50, 70,19,29};


        //For normal
        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

        // SINTAXE FOR EACH
        for(int p : pesos){
            System.out.println(p);
        }


    }
}
