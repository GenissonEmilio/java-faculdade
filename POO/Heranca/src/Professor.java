public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public Professor(int idade, String nome, String sexo, String especialidade, float salario) {
        super(idade, nome, sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);
    }

    public void receberAum(float aum) {
        this.setSalario(this.getSalario() + aum);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
