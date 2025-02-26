import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int N = 30;
        Scanner scanner = new Scanner(System.in);
        int[] vNumbers = new int[N];
        Random random = new Random();
        int contValor = 0;

        for (int cont = 0; cont < N - 1; cont++) {
            int randomNumber = random.nextInt(50) + 1;
            vNumbers[cont] = randomNumber;
            System.out.printf("Número gerado: %d\n", randomNumber);
        }

        System.out.print("Informe um número inteiro para a busca: ");
        int userNumber = scanner.nextInt();

        for (int cont = 0; cont < N - 1; cont++) {
            if (userNumber == vNumbers[cont]) {
                contValor++;
            }
        }

        System.out.printf("Um total de %d valores iguais ao número informado foram encontrados", contValor);
    }
}