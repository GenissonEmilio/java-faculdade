import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[6];
        Arrays.fill(num, 2);

        for (int valor: num) {
            System.out.println(valor);
        }
    }
}