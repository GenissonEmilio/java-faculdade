public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno(int idade, String nome, String sexo, String curso, int matricula) {
        super(idade, nome, sexo);
        this.curso = curso;
        this.matricula = matricula;
    }

    public void pagarMensalidade(int valor) {
        System.out.printf("Paguei a mensalidade do aluno %s no valor de %d \n", this.getNome(), valor);
    };

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
