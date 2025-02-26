import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lado, lado1, area, perimetro;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        lado = scanner.nextInt();
        System.out.print("Digite a altura do retagulo: ");
        lado1 = scanner.nextInt();

        area = lado * lado1;
        perimetro = (lado*2) + (lado1*2);

        System.out.printf("A area do retangulo é %d e o perimetro é %d", area, perimetro);
    }
}