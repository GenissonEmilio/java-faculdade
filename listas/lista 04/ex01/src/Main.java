import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int idade = 0, cont18 = 0, cont65 = 0, cont = 0;
        float percent18, percent65 = 0;

        while (true) {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                break;
            } else if (idade >= 18 && idade < 65) {
                cont18++;
            } else if (idade >= 65) {
                cont65++;
            }
            cont++;
        }

        percent18 = ((float) cont18/cont) * 100;
        percent65 = ((float) cont65/cont) * 100;

        System.out.println("O percentual de pessoas acima de 18 é: " + percent18);
        System.out.println("O percentual de pessoas acima de 65 é: " + percent65);
    }
}