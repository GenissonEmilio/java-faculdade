public class Operations {
    public static int soma(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static String contador(int inicio, int fim) {
        String nuns = "";

        for (int cont = inicio; cont <= fim; cont++) {
            nuns += cont + " ";
        }

        return nuns;
    }
}
