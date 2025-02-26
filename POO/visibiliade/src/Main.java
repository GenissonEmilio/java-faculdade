public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "big";
        c1.cor = "azul";
        //c1.tampada = true;
        c1.tampar();
        c1.rabiscar();
        //c1.ponta = 1f;
        c1.status();
    }
}