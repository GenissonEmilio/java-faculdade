public class LutadorUFC implements Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public LutadorUFC(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getIdade() {
        return idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    @Override
    public void apresentar() {
        System.out.printf("Lutador: %s\n", this.getNome());
        System.out.printf("Origem: %s\n", this.getNacionalidade());
        System.out.printf("%d anos\n", this.getIdade());
        System.out.printf("%.2fm de altura\n", this.getAltura());
        System.out.printf("Pesando: %.2fkg\n", this.getPeso());
        System.out.printf("Ganhou: %d\n", this.getVitorias());
        System.out.printf("Perdeu: %d\n", this.getDerrotas());
        System.out.printf("Empates: %d\n", this.getEmpates());
        System.out.println(" ");
    }

    @Override
    public void status() {
        System.out.printf("%s", this.getNome());
        System.out.printf("é um peso %s ", this.getCategoria());
        System.out.printf("%d viórias ", this.getVitorias());
        System.out.printf("%d derrotas ", this.getDerrotas());
        System.out.printf("%d empates \n", this.getEmpates());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);;
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
