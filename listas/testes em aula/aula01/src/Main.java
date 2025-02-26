import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //final int num = 20;
        Random random = new Random();
        int[][] matriz = new int[20][6];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = random.nextInt(21);
                System.out.format("% 7d", matriz[i][j]);
            }
            System.out.println();
        }

    }
}