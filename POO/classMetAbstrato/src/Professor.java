public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public Professor(int idade, String nome, String sexo, String especialidade, float salario) {
        super(idade, nome, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAum(float aum) {
        this.setSalario(this.getSalario() + aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
