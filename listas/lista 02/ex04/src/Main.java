import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frutas;
        boolean te = false;
        char caractIni, caractFinal;
        int startAB = 0, endAU = 0, frutImpar = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Nome da %do. fruta: ", i + 1);
            frutas = scanner.nextLine();
            caractIni = frutas.charAt(0);
            caractFinal = frutas.charAt(frutas.length() - 1);
            System.out.println("Tamanho: " + frutas.length());

            if (frutas.length() % 2 == 1) {
                frutImpar++;
            }

            if (Character.toUpperCase(caractIni) == 'A' || Character.toUpperCase(caractIni) == 'B') {
                startAB++;
            }

            if (Character.toUpperCase(caractFinal) == 'A' || Character.toUpperCase(caractFinal) == 'U') {
                endAU++;
            }
        }

        System.out.println("Iniciam com A ou B: " + startAB);
        System.out.println("Terminam com A ou U: " + endAU);
        System.out.println("Com caracteres impares: " + frutImpar);
    }
}