public class Bolsista extends Aluno {
    private int bolsa;

    public Bolsista(int idade, String nome, String sexo, String curso, int matricula, int bolsa) {
        super(idade, nome, sexo, curso, matricula);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovei a bolsa");
    }

    @Override
    public void pagarMensalidade(int valor) {
        this.setBolsa(this.getBolsa() - valor);
        System.out.printf("Paguei a bolsa");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
