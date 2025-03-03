public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public void status() {
        System.out.printf("Modelo: %s\n", this.modelo);
        System.out.printf("Cor %s.\n", this.cor);
        System.out.printf("Ponta: %f\n", this.ponta);
        System.out.printf("Carga: %d\n", this.carga);
        System.out.printf("Tampada: %b\n", this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! CANETA ESTÁ TAMPADA");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    private void destampar() {
        this.tampada = false;
    }
}
