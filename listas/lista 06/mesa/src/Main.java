import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int quadrada = 3;
        int[][] matriz = new int[quadrada][quadrada];

        /*
        [2 3 4 5 6]
        [3 8 7 5 4]
        [4 6 3 8 9]
         */

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(21);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}