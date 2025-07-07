package academy.introducao;

public class ArraysMultidimensional {
    public static void main(String[] args){
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 33;
        dias[0][2] = 37;

        dias[1][0] = 10;
        dias[1][1] = 16;
        dias[1][2] = 19;

        dias[2][0] = 70;
        dias[2][1] = 50;
        dias[2][2] = 5;

        for (int i = 0; i < dias.length; i ++){
            for (int j = 0; j< dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        for(int[] arrBase: dias){
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        int[][] arrayB = new int[3][];

        arrayB[0] = new int[2];
        arrayB[1] = new int[]{1,2,3};
        arrayB[2] = new int[]{1,3,6,7};

        for (int[] arrayBase : arrayB){
            for (int num : arrayBase){
                System.out.println(num);
            }
        }


    }
}
