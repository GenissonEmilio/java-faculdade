import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diaTreino;
        float cont = 0, contFimDeSemana = 0, contSemanaP = 0, contSemanaI = 0;
        String tipoTreino;

        for (int i = 0; i < 4; i++) {
            System.out.print("Qual o dia do treino [1-7]: ");
            diaTreino = scanner.nextInt();
            System.out.print("Qual o tipo de treino [P-I-A]: ");
            tipoTreino = scanner.next();
            cont++;

            if (diaTreino == 1 || diaTreino == 7) {
                contFimDeSemana++;
            } else if (diaTreino >= 2 && diaTreino <= 4 && tipoTreino.equalsIgnoreCase("P")) {
                contSemanaP++;
            } else if (diaTreino >= 2 && diaTreino <= 6 && tipoTreino.equalsIgnoreCase("I")) {
                contSemanaI++;
            }

        }

        contFimDeSemana = (contFimDeSemana/cont) * 100;
        contSemanaP = (contSemanaP/cont) * 100;
        contSemanaI = (contSemanaI/cont) * 100;

        System.out.println("Percentual de pessoas treinaram no fim de semana: " + contFimDeSemana);
        System.out.println("Percentual de pessoas que treinaram de Segunda a Quarta somente posterior: " + contSemanaP);
        System.out.println("Percentual de pessoas que treinaram de Segunda a Sexta somente inferior: " + contSemanaI);
    }
}