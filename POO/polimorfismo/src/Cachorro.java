public class Cachorro extends Mamifero {
    public Cachorro(float weight, int age, int members, String corPelo) {
        super(weight, age, members, corPelo);
    }

    public void enterrarOsso() {
        System.out.println("Cavando...");
    }

    public void abanarRabo() {
        System.out.println("Abanando o Rabo");
    }
}
