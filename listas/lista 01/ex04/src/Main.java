import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[10];
        int[] idadesPares = new int[10];
        int[] idadesImpares = new int[10];
        int[] paresMaior18 = new int[10];
        int[] imparesMaior18 = new int[10];
        int contPar = 0, contPar18 = 0, contImpar = 0, contImpar18 = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite a %do. Idade: ", i + 1);
            idades[i] = scanner.nextInt();

            if (idades[i] % 2 == 0) {
                idadesPares[contPar] = idades[i];

                if (idadesPares[contPar] > 18) {
                    paresMaior18[contPar18] = idadesPares[contPar];
                    contPar18++;
                }

                contPar++;
            } else if (idades[i] % 2 == 1) {
                idadesImpares[contImpar] = idades[i];

                if (idadesImpares[contImpar] > 18) {
                    imparesMaior18[contImpar18] = idadesImpares[contImpar];
                    contImpar18++;
                }

                contImpar++;
            }
        }

        System.out.print("Idades: ");
        for (int idade : idades) {
            System.out.print(idade + " ");
        }
        System.out.println();

        System.out.print("Idades pares: ");
        for (int idadePar : idadesPares) {
            System.out.print(idadePar + " ");
        }
        System.out.println();

        System.out.print("Idades impares: ");
        for (int idadeImpar : idadesImpares) {
            System.out.print(idadeImpar + " ");
        }
        System.out.println();

        System.out.print("Idades pares maiores que 18: ");
        for (int idadePar18 : paresMaior18) {
            System.out.print(idadePar18 + " ");
        }
        System.out.println();

        System.out.print("Idades impares maiores que 18: ");
        for (int idadeImpar18 : imparesMaior18) {
            System.out.print(idadeImpar18 + " ");
        }
        System.out.println();
    }
}