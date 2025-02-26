import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] idades = new int[10];
        int[] pares = new int[idades.length];
        int[] impares = new int[idades.length];
        int[] iDMAIMEDP = new int[idades.length];
        int[] iDMENMENI = new int[idades.length];
        int somaPares = 0, contPares = 0, somaImpares = 0, contImpares = 0;
        float mediaPares = 0, mediaImpares = 9;

        System.out.print("Valores originais: ");
        int semBuraco = 0;
        int semBuraco1 = 0;
        for (int i = 0; i < idades.length; i++) {
            /*System.out.print("Idade: ");
            idades[i] = scanner.nextInt();*/
            idades[i] = random.nextInt(61);
            System.out.print(idades[i] + " ");

            if (idades[i] % 2 == 0) {
                pares[semBuraco] = idades[i];
                somaPares += pares[semBuraco];
                contPares++;
                semBuraco++;
            } else {
                impares[semBuraco1] = idades[i];
                somaImpares += impares[semBuraco1];
                contImpares++;
                semBuraco1++;
            }
        }

        System.out.print("\nImpares: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }

        System.out.print("\nPares: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        mediaPares = (float) somaPares/contPares;
        mediaImpares = (float) somaImpares/contImpares;

        int contPares2 = 0;
        int contImpares2 = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > mediaPares) {
                iDMAIMEDP[contPares2] = idades[i];
                //System.out.println("Idade menor que a media de pares: " + iDMAIMEDP[contPares2] + " ");
                contPares2++;
            }

            if (idades[i] < mediaImpares) {
                iDMENMENI[contImpares2] = idades[i];
                //System.out.println("Idade menor que a media de impares: " + iDMENMENI[contImpares2] + " ");
                contImpares2++;
            }
        }

        System.out.println("\nMedia pares: " + mediaPares);
        System.out.println("Media impares: " + mediaImpares);

        System.out.print("\nPares: ");
        for (int i = 0; i < iDMAIMEDP.length; i++) {
            System.out.print(iDMAIMEDP[i] + " ");
        }

        System.out.print("\nImpares: ");
        for (int i = 0; i < iDMENMENI.length; i++) {
            System.out.print(iDMENMENI[i] + " ");
        }
    }
}