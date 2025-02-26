public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(float weight, int age, int members, String corPelo) {
        super(weight, age, members);
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        // pesquisar como colocar um som no java
        System.out.println("Som de mamifero...");
    }

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
