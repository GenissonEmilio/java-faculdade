public class Canguru extends Mamifero {
    public Canguru(float weight, int age, int members, String corPelo) {
        super(weight, age, members, corPelo);
    }

    public void usarBolsa() {
        System.out.println("Usou a bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
}
