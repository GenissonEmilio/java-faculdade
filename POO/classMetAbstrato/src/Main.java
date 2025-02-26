public class Main {
    public static void main(String[] args) {
        // ctrl + A para selecionar tudo na crição de codigo
        Visitante visitante = new Visitante(19, "Genisson", "M");
        Aluno aluno = new Aluno(22, "Jhony", "M", "BSI", 12902);
        Bolsista bolsista = new Bolsista(20, "Alisa", "F", "Engenharia", 128982, 1982);

        System.out.println(visitante.toString());
        System.out.println(aluno.toString());
        System.out.println(bolsista.toString());
    }
}