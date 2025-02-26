import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("Segunda nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("Terceira nota: ");
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3)/3;
        System.out.println("Sua media é: " + media);
    }
}