import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int N = 7;
        Scanner teclado = new Scanner(System.in);
        float[] vNotas = new float[N];
        float[] vNotasValidas = new float[N];
        float maior = 0;
        float menor = 0;
        float soma = 0;
        int contV = 0;

        for (int cont = 0; cont <= N - 1; cont++) {
            System.out.printf("Nota do %d atleta: ", cont + 1);
            vNotas[cont] = teclado.nextFloat();

            if (cont == 0) {
                maior = vNotas[cont];
                menor = vNotas[cont];
            } else if (vNotas[cont] > maior) {
                maior = vNotas[cont];
            } else if (vNotas[cont] < menor) {
                menor = vNotas[cont];
            }
        }

        for (int cont = 0; cont < N - 1; cont++) {
            if (vNotas[cont] != maior && vNotas[cont] != menor) {
                vNotasValidas[cont] = vNotas[cont];
                soma += vNotasValidas[cont];
                contV++;
            }
        }

        float media = soma/contV;

        System.out.printf("Maior número: %.1f\n", maior);
        System.out.printf("Menor Número: %.1f\n", menor);
        System.out.printf("Media dos números: %.2f", media);
    }
}