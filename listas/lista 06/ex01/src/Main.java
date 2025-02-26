import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int tamanho = 3;
        int[][] matriz = new int[tamanho][tamanho];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(51);
                System.out.print(matriz[i][j] + "\t");
                if (j > i) {
                   soma += matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("A soma dos elementos acima da diagonal principal é: " + soma);
    }
}