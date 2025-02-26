import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        //double[] vVeloc = {110, 70, 120, 120, 50, 50, 130, 90, 110};
        double[] vVeloc = new double[9];
        double[] vEstados = new double[3];
        double limite = 80, contConsec = 0, excedeu20 = 0, multa = 0, somaSE = 0, somaAL = 0, somaPE = 0, contSE = 0, contAL = 0, contPE = 0;

        System.out.print("Valores originais: ");
        for (int i = 0; i < vVeloc.length; i++) {
            vVeloc[i] = random.nextInt(40/10, 151/10) * 10;
            System.out.print(vVeloc[i] + " ");

            if (i > 0 && vVeloc[i] == vVeloc[i - 1]) {
                contConsec++;
            }

            if (i <= 2) {
                somaSE += vVeloc[i];
                contSE++;
            } else if (i <= 5) {
                somaAL += vVeloc[i];
                contAL++;
            } else {
                somaPE += vVeloc[i];
                contPE++;
            }

            if (vVeloc[i] > limite) {
               double limite20 = limite * 1.2;

               if (vVeloc[i] <= limite20) {
                   multa += 100;
                   excedeu20++;
               } else {
                   multa += 300;
               }
            }


        }

        vEstados[0] = (float) somaSE/contSE;
        vEstados[1] = (float) somaAL/contAL;
        vEstados[2] = (float) somaPE/contPE;

        System.out.print("\nMedias: ");
        for (int i = 0; i < vEstados.length; i++) {
            System.out.print(vEstados[i] + " ");
        }

        for (int i = 0; i < vVeloc.length; i++) {
            if (i % 2 == 0) {
                vVeloc[i] -= (vVeloc[i] * 0.1);
            } else {
                vVeloc[i] += (vVeloc[i] * 0.2);
            }
        }

        System.out.println("\nMesma velocidade em radares consecutivos: " + contConsec);
        System.out.println("Quantidade de vezes que excedeu 20% do limite: " + excedeu20);
        System.out.println("Total da multa a ser pago: " + multa);

        System.out.print("Original: ");
        for (int i = 0; i < vVeloc.length; i++) {
            System.out.print(vVeloc[i] + " ");
        }
    }
}