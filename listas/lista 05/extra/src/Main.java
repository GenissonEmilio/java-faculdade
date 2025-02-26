import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double[] vVeloc = new double[9];
        float[] vEstados = new float[3];
        int contConsec = 0, contExce = 0, limite = 80, multa = 0;
        double acimaLimite = limite * 1.2, somaSE = 0, somaAl = 0, somaPE = 0, contSE = 0, contAL = 0, contPE = 0;
        float mediaSE = 0, mediaAL = 0, mediaPE = 0;

        for (int i = 0; i < vVeloc.length; i++) {
            vVeloc[i] = (random.nextInt(15 - 4) + 4) * 10;
            System.out.print(vVeloc[i] + " ");

            if (i > 0) {
                if (vVeloc[i] == vVeloc[i - 1]) {
                    contConsec++;
                }
            }

            if (i <= 2) {
                somaSE += vVeloc[i];
                contSE++;
            } else if (i <= 5) {
                somaAl += vVeloc[i];
                contAL++;
            } else {
                somaPE += vVeloc[i];
                contPE++;
            }

            if (vVeloc[i] > limite && vVeloc[i] < acimaLimite) {
                multa += 100;
                contExce++;
            } else if (vVeloc[i] > limite && vVeloc[i] > acimaLimite) {
                multa += 300;
            }

            /*Outro jeito de calcular a multa
            if (vVeloc[i] > limite) {
                contExce++;
                multa += (vVeloc[i] <= acimaLimite)? 100 : 300;
            }*/

        }

        vEstados[0] = (float) ((float) somaSE/contSE);
        vEstados[1] = (float) ((float) somaAl/contAL);
        vEstados[2] = (float) ((float) somaPE/contPE);

        System.out.println("\nMesma velocidade em radares consecutivos: " + contConsec);
        System.out.println("Velocidades que excedeu até 20% do limite: " + contExce);
        System.out.println("Multa a ser paga: " + multa);

        System.out.println("Media da velocidade de cada estado: ");
        for (int i = 0; i < vEstados.length; i++) {
            System.out.printf("%.2f ", vEstados[i]);
        }

        System.out.println();
        for (int i = 0; i < vVeloc.length; i++) {
            if (i % 2 == 0) {
                vVeloc[i] -= vVeloc[i] * 0.1;
            } else {
                vVeloc[i] += vVeloc[i] * 0.2;
            }
            System.out.printf("%.2f ", vVeloc[i]);
        }
    }
}