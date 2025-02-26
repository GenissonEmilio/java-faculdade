import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //int[] ida = {60, 60, 120, 70, 120, 100, 90, 80, 70, 100};
        //int[] volta = {80, 90, 60, 100, 100, 60, 60, 120, 100, 120};
        int[] ida = new int[10];
        int[] volta = new int[10];
        int contConsec = 0, multa = 0;

        for (int i = 0; i < ida.length; i++) {
            ida[i] = random.nextInt(59, 140) + 1;
            volta[i] = random.nextInt(59, 140) + 1;

            System.out.println("Ida: " + ida[i]);

            if (i > 0 && ida[i] == ida[i - 1]) {
                contConsec++;
            }

            if (ida[i] > 80) {
                double limite80 = 80 * 1.2;

                if (ida[i] <= limite80) {
                    multa += 100;
                } else {
                    multa += 300;
                }

            }
        }

        // Acessa o vetor de ida ao contrario
        int contVolta = 0;
        System.out.print("Radares com velocidades iguais: ");
        for (int i = ida.length - 1; i >= 0 ; i--) {

            //Verifica se as velocidades são iguais, e mostra a posição baseada no i
            if (volta[contVolta] == ida[i]) {
                System.out.print((i + 1) + " ");
            }
            contVolta++;
        }

        System.out.println("\nVelocidades iguais na ida: " + contConsec);
        System.out.println("O valor da multa foir: R$" + multa);
    }
}