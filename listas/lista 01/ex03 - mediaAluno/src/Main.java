import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] vMedia = new float[8];
        float[] vMediaAr = new float[8];
        float somaAri = 0;
        float mediaAri = 0;
        int contAri = 0;

        for (int i = 0; i < vMedia.length; i++) {
            System.out.printf("Insira a %d media: ", i);
            vMedia[i] = scanner.nextFloat();

             if (vMedia[i] >= 6) {
                 somaAri += vMedia[i];
                 contAri++;
             }
        }

        mediaAri = somaAri/contAri;

        for (int i = 0; i < vMediaAr.length; i++) {
            if (vMedia[i] >= mediaAri) {
                vMediaAr[i] = i;
                System.out.println(vMediaAr[i] + " ");
            }
        }
    }
}