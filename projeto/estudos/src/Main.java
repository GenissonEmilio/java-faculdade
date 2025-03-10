import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int linha = 4;
        final int coluna = 4;
        int[] vMaxMes2022 = new int[linha];
        int[] vParImpar = new int[linha * linha];

        int[][] mVenda2022 = {
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
        };

        //Gerando valores para mVendas2022 e mmVendas2023
        /*for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                mVenda2022[i][j] = random.nextInt(1001);
                mVenda2023[i][j] = random.nextInt(1001);
            }
        }*/

        //imprimindo o mVendas2022
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("% 7d", mVenda2022[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        //imprimindo o mVendas2023
        int loja = 0, menor = 0;
        for (int i = 0; i < linha; i++) {
            int soma = 0;

            for (int j = 0; j < coluna; j++) {
                System.out.printf("% 7d", mVenda2023[i][j]);
                soma += mVenda2023[i][j];
            }
            System.out.println();

            //loja com menos clientes de 2022
            if (i == 0) {
                menor = soma;
                loja = i;
            } else {
                if (soma < menor) {
                    loja = i;
                }
            }
        }

        //Pegando os maiores valores de cada mês de 2022
        for (int j = 0; j < linha; j++) {
            int maiorValor = 0;

            for (int i = 0; i < coluna; i++) {
                //Pega o maior valor do mês
                if (mVenda2022[i][j] > maiorValor) {
                    maiorValor = mVenda2022[i][j];
                }
            }

            //Coloca os maiores valores dos meses
            vMaxMes2022[j] = maiorValor;
        }

        //Valores das linhas pares
        int index = 0;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i % 2 == 0) {
                    vParImpar[index++] = mVenda2022[i][j];
                }
            }
        }

        //Valores das colunas impares
        for (int j = 0; j < linha; j    ++) {
            for (int i = 0; i < coluna; i++) {
                if (j % 2 != 0) {
                    vParImpar[index++] = mVenda2022[i][j];
                }
            }
        }

        //Imprime os maiores valores de cada  mês
        System.out.print("Os maiores valores dos meses de 2022: ");
        for (int i = 0; i < vMaxMes2022.length; i++) {
            System.out.print(vMaxMes2022[i] + " ");
        }

        //Imprime os valores das linhas pares e colunas impares
        System.out.print("\nLinhas pa: ");
        for (int i = 0; i < vParImpar.length; i++) {
            System.out.print(vParImpar[i] + " ");
        }


    }
}