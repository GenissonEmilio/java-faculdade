import java.util.Random;
import java.util.HashMap;

public class Aluno {
    private String nome;
    private StringBuilder matricula;
    private double notaFinal;
    private static final HashMap<String, String> professores = new HashMap<>();

    static {
        professores.put("Telmo", "Telmo101");
        professores.put("Juno", "Juno101");
    }

    public Aluno(String nome) {
        this.setNome(nome);
        this.setMatricula(gerarMatricula());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula + ", notafinal=" + this.getNotaFinal() +
                ", nome='" + nome + '\'' +
                '}';
    }

    public StringBuilder gerarMatricula() {
        Random random = new Random();
        StringBuilder matricula = new StringBuilder();
        int posicao = 0;

        for (int i = 0; i <= 2; i++) {
            char letraAleatoria = (char) (random.nextInt(26) + 'A');
            posicao += letraAleatoria - 'A' + 1;
            matricula.append(letraAleatoria);
        }
        matricula.append(".");

        for (int i = 0; i <= 3; i++) {
            int numAleatorio = random.nextInt(10);
            if (i == 0 && numAleatorio == 0) {
                numAleatorio = random.nextInt(1, 10);
            }
            posicao += numAleatorio;
            matricula.append(numAleatorio);
        }
        matricula.append("-");

        posicao = String.valueOf(posicao).length() == 1 ? String.valueOf(posicao).charAt(0) - '0' : String.valueOf(posicao).charAt(1) - '0';
        matricula.append(posicao);

        return matricula;
    }

    public StringBuilder getMatricula() {
        return matricula;
    }

    public void setMatricula(StringBuilder matricula) {
        if (this.getMatricula() != null && this.getMatricula().length() == 10) {
            this.matricula = matricula;
        } else {
            System.out.println("Erro! Formato invalido");
        }

    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(String login, String senha, double notaFinal) {
        if (professores.containsKey(login) && professores.get(login).equals(senha) ) {
            this.notaFinal = notaFinal;
            return;
        }
        System.out.println("Ero! Acesso negado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
