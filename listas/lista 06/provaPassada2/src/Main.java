import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int linha = 10;
        final int coluna = 5;
        int[][] mVelocidades = new int[linha][coluna];
        float[] vMediaVelo = new float[linha];
        float[] vMediaRadar = new float[coluna];
        float[] vPercentCar = new float[coluna];
        int maior = 0, cont100 = 0, cont100Alagoas = 0;

        for (int i = 0; i < linha; i++) {
            int soma = 0;

            for (int j = 0; j < coluna; j++) {
                mVelocidades[i][j] = (random.nextInt(0, 14) + 1) * 10;
                System.out.printf("% 7d", mVelocidades[i][j]);
                soma += mVelocidades[i][j];

                //Maior velocidade do carro 5
                if (i == 4) {
                    if (mVelocidades[i][j] > maior) {
                        maior = mVelocidades[i][j];
                    }
                }

                //Velocidades acima de 100 no radar 2
                if (j == 1) {
                    if (mVelocidades[i][j] > 100) {
                        cont100++;
                    }
                }

                //Velocidades acima de 100 em Alagoas
                if (j == 3 || j == 4) {
                    if (mVelocidades[i][j] > 100) {
                        cont100Alagoas++;
                    }
                }
            }
            System.out.println();

            vMediaVelo[i] = (float) soma/coluna;

        }

        //Percentual de carros acima de 100 em cada radar e a media de cada radar
        for (int j = 0; j < coluna; j++) {
            int contGeral = 0, somaRadar = 0;

            for (int i = 0; i < linha; i++) {
                somaRadar += mVelocidades[i][j];

                if (mVelocidades[i][j] > 100) {
                    contGeral++;
                }
            }

            vPercentCar[j] = ((float) contGeral/linha) * 100;
            vMediaRadar[j] = (float) somaRadar/linha;
        }

        System.out.println("A maior velocidade do carro 5 foi: " + maior);
        System.out.println("A quantidade de velocidades acima de 100 no radar 2 foi: " + cont100);
        System.out.println("A quantidade de velocidades acima de 100 em Alagoas foi: " + cont100Alagoas);

        System.out.print("Media das velocidades de cada carro: ");
        for (int i = 0; i < vMediaVelo.length; i++) {
            System.out.print(vMediaVelo[i] + " | ");
        }

        System.out.print("\nPercentual de carros acima de 100 em cada radar: ");
        for (int i = 0; i < vPercentCar.length; i++) {
            System.out.print(vPercentCar[i] + " | ");
        }

        System.out.print("\nA media de velocidade de cada radar foi: ");
        for (int i = 0; i < vMediaRadar.length; i++) {
            System.out.print(vMediaRadar[i] + " | ");
        }
    }
}