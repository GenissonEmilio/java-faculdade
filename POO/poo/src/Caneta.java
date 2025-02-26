public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    void status() {
        System.out.printf("Modelo: %s\n", this.modelo);
        System.out.printf("Cor %s.\n", this.cor);
        System.out.printf("Ponta: %f\n", this.ponta);
        System.out.printf("Carga: %d\n", this.carga);
        System.out.printf("Tampada: %b\n", this.tampada);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! CANETA ESTÁ TAMPADA");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
