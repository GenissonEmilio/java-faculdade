public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Celta", 2020, 100);
        Carro carro1 = new Carro("Fusca", 2000, 68);

        carro.setModelo("Uno");
        carro1.setAno(1990);

        carro.status();
        carro1.status();
    }
}