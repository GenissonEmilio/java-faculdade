import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int maiorPeso = 0;
        int menorIdade = 0; 
        int contIdosoF = 0;
        int contIdoso = 0;
        int contObe = 0;
        int contFinal = 0;

        for (int cont=1; cont <= 5; cont++) {
            int idade = random.nextInt(80) + 10;
            int filhos = random.nextInt(6);
            int peso = random.nextInt(90) + 30;
            contFinal += 1;

            System.out.printf("%d° pessoa\n", cont);
            System.out.printf("Idade: %d\n", idade);
            System.out.printf("Filhos: %d\n", filhos);
            System.out.printf("Peso: %dkg\n", peso);
            System.out.println("");

            //Menor idade
            if (cont == 1) {
                menorIdade = idade;
            } else if (idade < menorIdade) {
                menorIdade = idade;
            }

            //Idosos acima de 65 sem filhos
            if (idade > 65 && filhos == 0) {
                contIdosoF += 1;
            }
            if (idade > 65) {
                contIdoso += 1;
            }

            //Maior peso
            if (peso > maiorPeso) {
                maiorPeso = peso;
            }

            //Pessoas obesas
            if (peso > 90) {
                contObe += 1;
            }
        }

        float percentIdosoF = ((float) contIdosoF/contIdoso) * 100;
        float percentObe = ((float) contObe/contFinal) * 100;

        System.out.println("A menor idade é: " + menorIdade);
        System.out.printf("O percentual de idosos acima de 65 e sem filhos é: %.2f \n", percentIdosoF);
        System.out.printf("O percentual de pessoas obesas acima de 90kg é: %.2f \n", percentObe);
        System.out.printf("Os divisores do maior peso %d foi: ", maiorPeso);

        for (int cont=1; cont <= maiorPeso; cont++) {
            if (maiorPeso % cont == 0) {
                System.out.print(cont + " ");
            }
        }
    }
}