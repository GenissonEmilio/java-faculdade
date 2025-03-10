import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int linha = 10;
        final int coluna = 12;
        int[][] mMetaVenda = new int[linha][coluna];
        int[][] mVendaReal = new int[linha][coluna];
        int[] vAnalise = new int[coluna];

        //Gerando valores para as metas vendas e as venda real
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                //Coloca valoress até a coluna 11
                if (j < (coluna - 1)) {
                    mMetaVenda[i][j] = random.nextInt(10001);
                }

                //Gera os valores das vendas reais
                mVendaReal[i][j] = random.nextInt(10001);
            }
        }

        //Colocando os valores da coluna 12
        int index = 0;
        for (int j = 0; j < coluna; j++) {
            int soma = 0;

            for (int i = 0; i < linha; i++) {
                //Soma apenas os valores ate a coluna 11
                if (j < (coluna - 1)) {
                    soma += mMetaVenda[i][j];
                }
            }

            //Coloca os valores na ultima coluna
            if (j < 10) {
                mMetaVenda[index++][11] = (int) ((float) (soma/linha) * 1.4);
            }

        }

        //Imprime os valores do mMetas
        System.out.println("Metas de vendas");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("% 7d", mMetaVenda[i][j]);
            }
            System.out.println();
        }

        //Imprime os valores do mVendaReal
        System.out.println("\nVenda reais");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("% 7d", mVendaReal[i][j]);
            }
            System.out.println();
        }

        //Ver o percentual de crescimento da meta em relação a venda real
        int mes = 0, maior = 0;
        for (int j = 0; j < coluna; j++) {
            int somaMeta = 0, somaReal = 0, contSuperacao = 0;

            for (int i = 0; i < linha; i++) {
                //Soma os valores de cada mês para a comparação
                somaMeta += mMetaVenda[i][j];
                somaReal += mVendaReal[i][j];

                if (mVendaReal[i][j] > mMetaVenda[i][j]) {
                    contSuperacao++;
                }
            }

            /*Faz uma "regra de três" com o valor que aumentou(somaReal-somaMeta é positiva) ou
              diminuio(somaReal-somaMeta é negativa) na comparação. O que queremos saber é quantos
              porcentos esse valor da diferença equivale quando comparamos com a somaMeta, ou seja,
              quanto (somaReal-somaMeta) equivale a somaMeta.
            */
            vAnalise[j] = ((somaReal - somaMeta) * 100)/somaMeta;

            if (contSuperacao > maior) {
                maior = contSuperacao;
                mes = j;
            }
        }

        //Mostrando a analise de cada mês
        System.out.print("\nAnalises: ");
        for (int i = 0; i < vAnalise.length; i++) {
            System.out.print(vAnalise[i] + " ");
        }

        //Mostra o mes que mais superou sua meta
        System.out.println("\nO mais que mais superou sua meta foi: " + mes);
    }
}