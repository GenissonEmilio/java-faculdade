import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[5];
        int[] menorV = new int[5];
        int menorNum = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(21);
            System.out.print(vetor[i] + " ");

            if (i == 0) {
                menorNum = vetor[i];
            } else if (vetor[i] < menorNum) {
                menorNum = vetor[i];
            }
        }

        System.out.println(" ");
        for (int i = 0; i < menorV.length; i++) {
            menorV[i] = vetor[i] * menorNum;
            System.out.print(menorV[i] + " ");
        }
    }
}