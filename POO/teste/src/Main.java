import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira seu nome : ");
        String nome = teclado.nextLine();

        System.out.println("Insira sua idade : ");
        int idade = teclado.nextInt();

        System.out.println("Insira sua nota : ");
        float nota1 = teclado.nextFloat();

        System.out.println("A sua nota é : " + nota1);
        float nota2 = teclado.nextFloat();

        System.out.println("A sua nota é : " + nota2);
        float nota3 = teclado.nextFloat();

        System.out.format("A sua nota é : %2f", nota3);

    }
}
