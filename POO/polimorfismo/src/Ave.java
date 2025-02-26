public class Ave extends Animal {
    private String corPena;

    public Ave(float weight, int age, int members, String corPena) {
        super(weight, age, members);
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.println("Ninho feito");
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
