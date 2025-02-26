import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "";
        int perimetro = 0, area = 0;

        while (true) {
            System.out.println("---------------");
            System.out.println("R: rentângulo");
            System.out.println("C: circulo");
            System.out.println("Q: quadrado");
            System.out.println("Z: fechar programa");
            System.out.println("---------------");

            System.out.print("Sua escolha: ");
            userChoice = scanner.next();

            if (userChoice.equalsIgnoreCase("Z")) {
                break;
            }

            switch (userChoice) {
                case "R":
                    System.out.print("Lado do retângulo: ");
                    int lado = scanner.nextInt();
                    System.out.print("Altura: ");
                    int altura = scanner.nextInt();
                    perimetro = (lado * 2) + (altura * 2);
                    area = lado * altura;
                    break;

                case "C":
                    System.out.print("Raio do circulo: ");
                    int raio = scanner.nextInt();
                    perimetro = (int) ((2*Math.PI) * raio);
                    area = (int) (Math.PI * (raio * raio));
                    break;

                case "Q":
                    System.out.print("Lado: ");
                    int ladoQ = scanner.nextInt();
                    perimetro = ladoQ * 4;
                    area = ladoQ * ladoQ;
                    break;
            }

            System.out.println("Perimetro: " + perimetro);
            System.out.println("Area: " + area);
        }

        scanner.close();
    }
}