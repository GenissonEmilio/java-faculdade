public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    public Aluno(int idade, int matr, String nome, String sexo, String curso) {
        super(idade, nome, sexo);
        this.setMatr(matr);
        this.setCurso(curso);
    }

    public void cancelarMatr() {
        this.setMatr(0);
    }

    public int getMatr() {
        return matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }
}
