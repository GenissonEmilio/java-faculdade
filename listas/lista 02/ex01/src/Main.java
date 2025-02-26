import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, digito, digito2, digito3, digito4, numberInvertido;

        System.out.print("Digite um número de quatro digitos: ");
        number = scanner.nextInt();

        digito = number % 10;
        digito2 = (number/10) % 10;
        digito3 = (number/100) % 10;
        digito4 = number/1000;
        numberInvertido = (((digito * 10) + digito2) * 10 + digito3) * 10 + digito4;

        System.out.println("Numero invertido é: " + numberInvertido);
    }
}