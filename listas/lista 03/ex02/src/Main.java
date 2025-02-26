import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String profissional, servico;
        int contSC = 0, totLucro = 0;
        float cont = 0, contD = 0, percent = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Qual profissional deseja escolher [D,B,N]: ");
            profissional = scanner.nextLine();
            System.out.print("Qual serviço deseja escolher [SC,SB,CB]: ");
            servico = scanner.nextLine();
            cont++;

            if (servico.equalsIgnoreCase("SC")) {
                contSC++;
                totLucro += 30;
            } else if (servico.equalsIgnoreCase("SB")) {
                totLucro += 20;
            } else if (servico.equalsIgnoreCase("CB")) {
                totLucro += 40;
            } else {
                System.out.println("Erro! Serviço invalido");
            }

            if (profissional.equalsIgnoreCase("D")) {
                contD++;
            }
        }

        percent = (contD/cont) * 100;

        System.out.println("Total de serviços para SC: " + contSC);
        System.out.println("Percentual de serviços prestados por Dilsinho: " + percent);
        System.out.println("Lucro total da barbearia: " + totLucro);
    }
}