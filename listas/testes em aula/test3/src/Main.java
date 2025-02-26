import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Matrizes
        //Revisar matrizes na matematica
        //Os valores da diagonal principa são os valores em que o i e j são iguais
        //j > i para pegar os valores acima da diagonal principal
        //i > j para pegar os valores abaixo da diagonal principal
        //i + j < tamanho da matriz - 1 para pegar os valores acima da diagonal secundaria
        //i + j > tamanho da matriz - 1 para pegar os valores abaixo da secundaria


        Random random = new Random();

        //Define as linhas e colunas da matriz
        final int linha = 4;
        final int coluna = 4;

        //Define uma matriz quadrada
        int[][] matriz = new int[linha][coluna];

        //Define os vetores para a diagonal principal e para a secundaria
        int[] dPrincipal = new int[matriz.length];
        int[] dSecundaria = new  int[matriz.length];

        //Gera valores para a matriz
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = random.nextInt(11);
            }
        }

        //Imprime os valores e verifica os valores da diagonal principal e os da secundaria
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("linha %d| coluna %d: %d\n", i, j, matriz[i][j]);

                //Pega os valores da diagonal principal
                if (i == j) {
                    dPrincipal[j] = matriz[i][j];
                }

                //Pega os valores da diagonal secundaria
                if (i + j == 3) {
                    dSecundaria[j] = matriz[i][j];
                }
            }
        }

        //Imprime os valores da DP
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < dPrincipal.length; i++) {
            System.out.print(dPrincipal[i] + " ");
        }

        //Imprime os valores da DS
        System.out.print("\nDiagonal secundaria: ");
        for (int i = 0; i < dSecundaria.length; i++) {
            System.out.print(dSecundaria[i] + " ");
        }

    }
}