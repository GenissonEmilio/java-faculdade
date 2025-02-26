public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(int age, int members, float weight, String corPelo) {
        super(age, members, weight);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    @Override
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
