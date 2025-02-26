import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[1000];
        int[] ocorrencias = new int[21];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(21);
        }

        for (int i = 0; i < vetor.length; i++) {
            ocorrencias[vetor[i]]++;
        }

        for (int i = 0; i < ocorrencias.length; i++) {
            System.out.printf("%d ocorreu %d vezes.\n", i, ocorrencias[i]);
        }
    }
}