import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int quadrada = 4;
        int[][] matriz = new int[quadrada][quadrada];
        int[] vMatriz = new int[matriz.length * matriz.length];
        int soma5 = 0, cont5 = 0;
        float media5 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(21);
                System.out.print(matriz[i][j] + "\t");

                if (matriz[i][j] < 5) {
                    soma5 += matriz[i][j];
                    cont5++;
                }
            }
            System.out.println();
        }

        media5 = (float) soma5/cont5;

        int c = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > media5) {
                    vMatriz[c] = matriz[i][j];
                    c++;
                }
            }
        }

        System.out.println("A media dos valores abaixo de 5: " + media5);
        System.out.print("Os valores acima da média: ");
        for (int i = 0; i < vMatriz.length; i++) {
            System.out.print(vMatriz[i] + " ");
        }
    }
}