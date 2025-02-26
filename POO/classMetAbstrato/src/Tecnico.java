public class Tecnico extends Aluno {
    private int registroProf;

    public Tecnico(int idade, String nome, String sexo, String curso, int matricula, int registroProf) {
        super(idade, nome, sexo, curso, matricula);
        this.registroProf = registroProf;
    }

    public void praticar() {
        System.out.println("Pratiquei");
    }

    public int getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(int registroProf) {
        this.registroProf = registroProf;
    }
}
