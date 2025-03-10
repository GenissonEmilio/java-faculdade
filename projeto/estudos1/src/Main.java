import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int linha = 10;
        final int coluna = 5;
        //int[][] mVelocidades = new int[linha][coluna];
        float[] vMedVelCaar = new float[linha];
        float[] vPerCarRad = new float[coluna];
        float[] vMedVelRad = new float[coluna];
        int[][] mVelocidades = {
                {120, 110, 130, 100, 90},
                {140, 100, 120, 110, 80},
                {130, 90, 110, 120, 100},
                {110, 120, 100, 90, 130},
                {100, 130, 140, 110, 120},
                {90, 140, 130, 100, 110},
                {120, 110, 100, 130, 140},
                {130, 100, 120, 110, 90},
                {110, 120, 130, 100, 140},
                {100, 110, 120, 130, 90}
        };

        //Gerando as velocidades
        int maiorVelocidade = 0, cont100 = 0, contAla = 0;
        for (int i = 0; i < linha; i++) {
            int soma = 0;

            for (int j = 0; j < coluna; j++) {
                System.out.printf("% 7d", mVelocidades[i][j]);
                soma += mVelocidades[i][j];

                //Pega a maior velocidade do carro 5
                if (i == 4) {
                    if (mVelocidades[i][j] > maiorVelocidade) {
                        maiorVelocidade = mVelocidades[i][j];
                    }
                }

                //Velocidades acima de 100 no radar 2
                if (j == 1) {
                    if (mVelocidades[i][j] > 100) {
                        cont100++;
                    }
                }

                //Velocidades acima de 100 em Alagoas
                if (j >= 3 && j <= 4) {
                    if (mVelocidades[i][j] > 100) {
                        contAla++;
                    }
                }
            }
            System.out.println();

            vMedVelCaar[i] = (float) soma/coluna;
        }

        //Percentual de carros acima de 100 em cada radar
        for (int j = 0; j < coluna; j++) {
            int contPerAci100 = 0, soma = 0;

            for (int i = 0; i < linha; i++) {
                soma += mVelocidades[i][j];

                if (mVelocidades[i][j] > 100) {
                    contPerAci100++;
                }
            }

            //Percentual
            vPerCarRad[j] = ((float) contPerAci100/linha) * 100;

            //Media das velocidades
            vMedVelRad[j] = (float) soma/linha;
        }

        System.out.println("A maior velocidade do carro 5 foi: " + maiorVelocidade);
        System.out.println("A quantidade de velocidades acima de 100 foi: " + cont100);
        System.out.println("A quantidade de velocidades acima de 100 em Alagoas é: " + contAla);
        System.out.print("A media das velocidades: ");
        for (float velocidade : vMedVelCaar) {
            System.out.print(velocidade + " ");
        }

        System.out.print("\nO percentual de carros acima de 100 em cada radar é: ");
        for (float percentual : vPerCarRad) {
            System.out.printf("%.2f%% ", percentual);
        }


        System.out.print("\nA media de velocidades de cada radar é: ");
        for (float media : vMedVelRad) {
            System.out.printf("%.2f ", media);
        }
    }
}