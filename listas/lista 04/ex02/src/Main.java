import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String esporte = "", time = "", sexo = "";
        int cont = 0, contFut = 0, contF = 0, contFV = 0, contV = 0, contCON = 0;
        float percentFut = 0, percentFV = 0, percentV = 0, percentCON = 0;

        while (true) {
            System.out.print("Esporte favorito[F-V-B]: ");
            esporte = scanner.next();
            System.out.print("Time[SER-CON-LAG-ITA]: ");
            time = scanner.next();
            System.out.print("Sexo: ");
            sexo = scanner.next();

            if (esporte.equalsIgnoreCase("Z")) {
                break;
            } else if (esporte.equalsIgnoreCase("F")) {
                contFut++;

                if (time.equalsIgnoreCase("CON")) {
                    contCON++;
                }
            }

            if (esporte.equalsIgnoreCase("V")) {
                contV++;
            }

            if (sexo.equalsIgnoreCase("F")) {
                contF++;

                if (esporte.equalsIgnoreCase("V")) {
                    contFV++;
                }
            }

            cont++;
        }

        percentFut = ((float) contFut/cont) * 100;
        percentFV = ((float) contFV/contF) * 100;
        percentV = ((float) contV/cont) * 100;
        percentCON = ((float) contCON/contFut) * 100;

        System.out.println("O percentual de pessoas que escolheram Futbol: " + percentFut);
        System.out.println("O percentual de mulheres que preferem vôlei é: " + percentFV);
        System.out.println("O percentual de pessoas que preferem vôlei: " + percentV);
        System.out.println("O percentual de pessoas que preferem futbol e torcem para CON: " + percentCON);
    }
}