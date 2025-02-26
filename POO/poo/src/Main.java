public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("A01", "preta", 0.4f, 100, true);
        //c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta("A02", "azul", 1f, 78, false);
        //c2.status();
        c2.rabiscar();

    }
}