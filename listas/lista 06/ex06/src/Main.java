import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int linha = 10;
        final int coluna = 6;
        int[][] mFaturamento = new int[linha][coluna];
        int[][] mFaturBimestre = new int[linha][coluna/2];
        int[] vFatur = new int[mFaturamento.length];

        int cont = 0;
        for (int i = 0; i < linha; i++) {
            int faturamentoT1 = 0, faturamentoT2 = 0;

            System.out.printf("Loja %d ", i);
            for (int j = 0; j < coluna; j++) {
                mFaturamento[i][j] = random.nextInt(10000) + 10000;
                System.out.format("% 7d", mFaturamento[i][j]);

                //Faturamento por trimestre
                if (j <= 2) {
                    faturamentoT1 += mFaturamento[i][j];
                } else {
                    faturamentoT2 += mFaturamento[i][j];
                }

                //Faturamento dos bimestres
                if (j < 2) {
                    //Primeiro bimestre
                    mFaturBimestre[i][0] += mFaturamento[i][j];
                } else if (j < 4) {
                    //Segundo bimestre
                    mFaturBimestre[i][1] += mFaturamento[i][j];
                } else {
                    //Terceiro bimestre
                    mFaturBimestre[i][2] += mFaturamento[i][j];
                }

            }

            //Faturamento geral acima de 50000
            if (faturamentoT1 + faturamentoT2 > 100000) {
                vFatur[cont] = i;
                cont++;
            }

            //Faturamento dos trimestres
            System.out.printf(" faturamento do trimestre 1: %d ", faturamentoT1);
            System.out.printf("faturamento do trimestre 2: %d", faturamentoT2);
            System.out.println();
        }

        System.out.println("\nAs lojas com faturamentos acima de 50000 foram: ");
        for (int i = 0; i < vFatur.length; i++) {
            System.out.printf("loja %d.\n", vFatur[i]);
        }

        //Faturamento por bimestre
        System.out.println("\nFaturamentos dos bimestres");
        for (int i = 0; i < linha; i++) {
            System.out.printf("Loja %d ", i);
            for (int j = 0; j < coluna/2; j++) {
                System.out.format("% 7d", mFaturBimestre[i][j]);
            }
            System.out.println();
        }
    }
}