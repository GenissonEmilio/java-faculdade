import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int linha = 4;
        final int coluna = 3;
        int[][] mNotas = new int[linha][coluna];
        float[] vMedias = new float[linha];

        for (int i = 0; i < linha; i++) {
            int soma = 0;

            //Gera notas de cada aluno e faz uma soma para cada um deles
            for (int j = 0; j < coluna; j++) {
                mNotas[i][j] = random.nextInt(11);
                System.out.format("% 7d", mNotas[i][j]);
                soma += mNotas[i][j];
            }
            System.out.println();

            //Calcula a media para cada aluno
            vMedias[i] = (float) soma/coluna;
        }

        //Mostra as medias dos alunos
        System.out.print("Medias: ");
        for (float vMedia : vMedias) {
            System.out.printf("%.2f |", vMedia);
        }

    }
}