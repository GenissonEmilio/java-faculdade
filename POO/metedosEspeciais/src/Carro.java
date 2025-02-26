public class Carro {
    private String modelo;
    private int ano;
    private int gasolina;

    public Carro(String modelo, int ano, int gasolina) {
        this.modelo = modelo;
        this.ano = ano;
        this.gasolina = gasolina;
    }

    public void status() {
        System.out.println("SOBRE O CARRO");
        System.out.printf("Modelo do carro: %s \n", this.modelo);
        System.out.printf("Ano do carro: %d \n", this.ano);
        System.out.printf("Gasolina do carro: %d \n", this.gasolina);
    }

    public String getModelo() {
        return  this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
}
