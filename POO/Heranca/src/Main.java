public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(18, "Genisson", "M");
        Aluno pessoa1 = new Aluno(18, 1234, "Luisa", "F", "BSI");
        Funcionario pessoa2 = new Funcionario(34, "Professor", "M", "Vendas");
        Professor pessoa3 = new Professor(45, "Wilsson", "M", "Matematica", 4780f);

        pessoa1.cancelarMatr();
        pessoa2.mudarTrabalho();
        pessoa3.receberAum(500f);
        pessoa1.fazerAni();

        System.out.println(pessoa3.toString());
    }
}