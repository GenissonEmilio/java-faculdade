import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int quadrada = 4;
        int[][] mVenda2022 = new int[quadrada][quadrada];
        int[][] mVenda2023 = new int[quadrada][quadrada];

        /*int[][] mVenda2022 = {
                {200, 400, 600, 500},
                {100, 900, 800, 300},
                {700, 800, 200, 900},
                {400, 100, 600, 700}
        };
        int[][] mVenda2023 = {
                {600, 400, 700, 300},
                {100, 400, 500, 900},
                {100, 100, 100, 400},
                {800, 700, 300, 400}
        };*/

        int[] vMaxMes2022 = new int[quadrada];
        int[] vParImpar = new int[quadrada * quadrada];
        int[] vLojas = new int[quadrada];

        //Gera os valores para 2022 e 2023
        for (int i = 0; i < quadrada; i++) {
            for (int j = 0; j < quadrada; j++) {
                mVenda2022[i][j] = random.nextInt(1001);
                mVenda2023[i][j] = random.nextInt(1001);
                System.out.printf("% 7d", mVenda2022[i][j]);
            }
            System.out.println();
        }

        //Imprime os valores de 2023
        System.out.println("\n" + "-".repeat(100));
        for (int i = 0; i < quadrada; i++) {
            for (int j = 0; j < quadrada; j++) {
                System.out.printf("% 7d", mVenda2023[i][j]);
            }
            System.out.println();
        }

        //Pega os maiores valores de cada mês e verifica as lojas com aumento de 10%
        for (int j = 0; j < quadrada; j++) {
            int maior = 0, soma22 = 0, soma23 = 0;

            for (int i = 0; i < quadrada; i++) {
                soma22 += mVenda2022[i][j];
                soma23 += mVenda2023[i][j];

                if (mVenda2022[i][j] > maior) {
                    maior = mVenda2022[i][j];
                }
            }
            vMaxMes2022[j] = maior;

            //Ver se o mês de 2022 teve um aumento de 10% se comparado com 2023
            float aumento = (float) (soma22 * 1.1);
            //System.out.println("Aumento: " + aumento + " e soma23: " + soma23);
            if (soma23 > aumento) {
                vLojas[j] = j + 1;
            }
        }

        //Valores das linhas pares
        int index = 0;
        for (int i = 0; i < quadrada; i+=2) {
            for (int j = 0; j < quadrada; j++) {
                vParImpar[index++] = mVenda2022[i][j];
            }
        }

        //Valores das colunas impares
        for (int j = 1; j < quadrada; j+=2) {
            for (int i = 0; i < quadrada; i++) {
                vParImpar[index++] = mVenda2022[i][j];
            }
        }

        //Pega a loja com menos clientes
        int loja = 0, menor = 0;
        for (int i = 0; i < quadrada; i++) {
            int soma = 0;

            for (int j = 0; j < quadrada; j++) {
                soma += mVenda2023[i][j];
            }

            if (i == 0) {
                menor = soma;
                loja = i;
            } else {
                if (soma < menor) {
                    menor = soma;
                    loja = i;
                }
            }

        }

        System.out.println("\n" + "-".repeat(100));
        //Imprime as maiores vendas de cada mês
        System.out.print("Maiores vendas de 2022: ");
        for (int i = 0; i < vMaxMes2022.length; i++) {
            System.out.print(vMaxMes2022[i] + " ");
        }

        System.out.println("\n" + "-".repeat(100));

        //Imprime os valores das linhas pares e colunas impares
        System.out.print("Valores linhaP e colunaI: ");
        for (int i = 0; i < vParImpar.length; i++) {
            System.out.print(vParImpar[i] + " ");
        }

        System.out.println("\n" + "-".repeat(100));

        System.out.printf("A loja com menos clientes em 2023 foi: loja %d", loja);

        System.out.println("\n" + "-".repeat(100));

        System.out.print("\nOs meses com aumento de 10% foram: \n");
        for (int i = 0; i < vLojas.length; i++) {
            //Imprime apenas os meses que tiveram aumento
            if (vLojas[i] != 0) {
                System.out.printf("O mês %d\n", vLojas[i]);
            }
        }
    }
}