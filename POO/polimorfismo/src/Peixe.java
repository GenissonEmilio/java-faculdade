public class Peixe extends Animal{
    private String corEscama;

    public Peixe(float weight, int age, int members, String corEscama) {
        super(weight, age, members);
        this.corEscama = corEscama;
    }

    public void soltarBolha() {
        System.out.println("Blu BLU BLU...");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piexe não faz som...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
