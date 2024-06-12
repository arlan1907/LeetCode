package Arraytraining;

public class MultidimensionalArray {
    public static void main(String[] args) {

        //cok boyutlu diziler
        // int [] BirBoyutlu Array = new [5];
        //
        int[][] tablo = new int[][]{
                {1, 32, 23},
                {2, 76, 66},
                {3, 32, 900},
                {4, 56, 567},
                {5, 21, 432}
        };

        for (int i = 0; i < tablo.length; i++){
            for (int j = 0; j < tablo[0].length; j++) {
                System.out.print(tablo[i][j] + "  ");
            }
            System.out.println();

        }



    }
}
