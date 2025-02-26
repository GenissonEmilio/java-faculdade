import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int linhas = 3;
        final int colunas = 5;
        int[][] numbers = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
              numbers[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Tamanho: " + numbers.length);
        System.out.println("Array: ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("|" + numbers[i][j] + "|");
            }
            System.out.println(" ");
        }
    }
}