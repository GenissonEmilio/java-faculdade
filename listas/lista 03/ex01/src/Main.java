import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int contManha = 0, maiorVel = 0, multa = 0;

        System.out.print("Numeros: ");
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(201);
            System.out.print(num + " ");

            if (i <= 50) {
                if (num > 100) {
                    contManha++;
                }
            } else {
                if (num > maiorVel) {
                    maiorVel = num;
                }
            }

            if (num >= 100 && num <= 140) {
                multa += 100;
            } else if (num > 140) {
               multa += 200;
            }
        }


        System.out.println("\nCarros com velocidade acima de 100 no turno da manhã: " + contManha);
        System.out.println("Maior velocidade a tarde: " + maiorVel);
        System.out.println("Total arrecadado de multas: " + multa);
    }
}