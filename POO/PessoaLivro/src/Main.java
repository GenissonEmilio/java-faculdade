public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        Livro[] livros = new Livro[2];

        pessoas[0] = new Pessoa("Harry Potter", "M", 35);
        pessoas[1] = new Pessoa("Genisson", "M", 19);
        pessoas[2] = new Pessoa("Elen", "F", 19);

        livros[0] = new Livro("Senhor dos Anais", "Anal", 235, pessoas[0]);
        livros[1] = new Livro("A fenda", "Bundonido", 456, pessoas[1]);

        livros[0].abrir();
        livros[0].folhear(200);
        livros[0].avancarPag();
        System.out.println(livros[0].detalhes());
    }
}