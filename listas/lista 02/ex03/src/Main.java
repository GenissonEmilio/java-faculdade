import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totP = 0, totFinal = 0;
        String tamanho;

        System.out.print("Informe a quantidade de pizzas: ");
        totP = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Informe o tamanho da pizza: ");
        tamanho = scanner.nextLine();

        if (tamanho.equals("p")) {
            totFinal = totP * 20;
        } else if (tamanho.equals("m")) {
            totFinal = totP * 30;
        } else if (tamanho.equals("G")) {
            totFinal = totP * 40;
        } else {
            System.out.println("Erro! Tamanho invalido");
        }

        System.out.println("O total a ser pago é: " + totFinal);

        scanner.close();
    }
}