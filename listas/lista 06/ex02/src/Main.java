import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int quadrada = 10;
        int[][] matriz = new int[quadrada][quadrada];
        int cont = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(21);
                System.out.print(matriz[i][j] + "\t");

                if (i + j > matriz.length - 1 && matriz[i][j] > 10) {
                    cont++;
                }
            }
            System.out.println();
        }

        System.out.println("Os elemntos abaixo da diagonal secundaria acima de 10: " + cont);
    }
}