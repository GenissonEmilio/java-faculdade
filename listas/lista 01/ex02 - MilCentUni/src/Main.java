import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int N = 4;
        int[] vAlgorismo = new int[N];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1000 e 9999: ");
        int userNumber = scanner.nextInt();

        if (userNumber >= 1000 && userNumber <= 9999) {
            int milhar = userNumber/1000;
            int centena = (userNumber/100) % 10;
            int dezena = (userNumber/10) % 10;
            int unidade = userNumber % 10;

            vAlgorismo[0] = milhar;
            vAlgorismo[1] = centena;
            vAlgorismo[2] = dezena;
            vAlgorismo[3] = unidade;
        } else {
            System.out.println("Erro! Digite um número válido");
        }

        for (int i = 0; i < N; i++) {
            System.out.print(vAlgorismo[i] + " ");
        }
    }
}