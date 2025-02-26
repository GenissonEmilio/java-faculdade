public class Lobo extends Mamifero {

    public Lobo(int age, int members, float weight, String corPelo) {
        super(age, members, weight, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuu!");
    }
}
