public class Funcionario extends  Pessoa {
    private String setor;
    private boolean trabalando;

    public Funcionario(int idade, String nome, String sexo, String setor) {
        super(idade, nome, sexo);
        this.setSetor(setor);
        this.setTrabalando(false);
    }

    public void mudarTrabalho() {
        this.setTrabalando(!this.isTrabalando());
    }

    public String getSetor() {
        return setor;
    }

    public boolean isTrabalando() {
        return trabalando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalando(boolean trabalando) {
        this.trabalando = trabalando;
    }
}
