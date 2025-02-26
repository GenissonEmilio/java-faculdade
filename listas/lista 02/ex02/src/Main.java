import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contP = 0, contR = 0, tot = 0;

        System.out.print("Quantidade de Pizzas: ");
        contP = scanner.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        contR = scanner.nextInt();

        tot = (contP * 40) + (contR * 8);
        System.out.println("O total a ser pago é: " + tot);
    }
}