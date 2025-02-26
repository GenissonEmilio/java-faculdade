import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int linha = 20;
        final int coluna = 7;
        int[][] mProdutos = new int[linha][coluna];
        int[] vVendas = new int[mProdutos.length];
        int maisVenda = 0, maisVendaFDS = 0, produto = 0, produtoFDS = 0;

        for (int i = 0; i < linha; i++) {
            //Variaveis de escopo local para serem resetadas a cada loop
            int soma = 0, somaFDS = 0, somaVendas = 0;

            for (int j = 0; j < coluna; j++) {
                mProdutos[i][j] = random.nextInt(101);
                System.out.format("% 7d", mProdutos[i][j]);
                soma += mProdutos[i][j];

                //Soma as vendas do final de samana
                if (j == 0 || j == 6) {
                    somaFDS += mProdutos[i][j];
                }

                //Soma das vendas de segunda a quarta
                if (j > 0 && j <= 3) {
                    somaVendas += mProdutos[i][j];
                }
            }
            System.out.println( );

            //Vendas de segunda a quarta
            vVendas[i] = somaVendas;

            //Produto com mais venda na semana
            if (soma > maisVenda) {
                maisVenda = soma;
                produto = i;
            }

            //Produto com mais venda no fim de semana
            if (somaFDS > maisVendaFDS) {
                maisVendaFDS = somaFDS;
                produtoFDS = i;
            }
        }

        System.out.printf("O produto com mais venda é: produto %d\n", produto);
        System.out.printf("A maior venda do fim de semana foi: produto %d\n", produtoFDS);
        System.out.println("O total das vendas de segunda a quarta foi: ");
        for (int i = 0; i < vVendas.length; i++) {
            System.out.printf("Produto %d: %d\n", i, vVendas[i]);
        }
    }
}