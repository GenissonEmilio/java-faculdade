public class teste {
    public static void main(String[] args) {
        int[][] mVendas2022 = {
                {200, 400, 600, 500},
                {100, 900, 800, 300},
                {700, 800, 200, 900},
                {400, 100, 600, 700}
        };

        int[][] mVendas2023 = {
                {600, 400, 700, 300},
                {100, 400, 500, 900},
                {100, 100, 100, 400},
                {800, 700, 300, 400}
        };

        // Criando e preenchendo vMaxMes2022
        int[] vMaxMes2022 = new int[4];
        for (int j = 0; j < 4; j++) {
            int max = 0;
            for (int i = 0; i < 4; i++) {
                if (mVendas2022[i][j] > max) {
                    max = mVendas2022[i][j];
                }
            }
            vMaxMes2022[j] = max;
        }

        // Criando e preenchendo vParImpar
        int[] vParImpar = new int[16];
        int index = 0;
        for (int i = 0; i < 4; i += 2) { // Linhas pares
            for (int j = 0; j < 4; j++) { // Todas as colunas
                vParImpar[index++] = mVendas2022[i][j];
            }
        }
        for (int i = 1; i < 4; i += 2) { // Linhas ímpares
            for (int j = 1; j < 4; j += 2) { // Colunas ímpares
                vParImpar[index++] = mVendas2022[i][j];
            }
        }

        // Impressão dos vetores
        System.out.print("vMaxMes2022: ");
        for (int num : vMaxMes2022) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("vParImpar: ");
        for (int num : vParImpar) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
