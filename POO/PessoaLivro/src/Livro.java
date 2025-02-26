public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPag(totPag);
        this.setLeitor(leitor);
        this.setPagAtual(0);
        this.setAberto(false);
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totPag=" + totPag +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome() +
                '}';
    }

    public boolean isAberto() {
        return aberto;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public int getTotPag() {
        return totPag;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    @Override
    public void abrir() {
        if (!this.isAberto()) {
            this.setAberto(true);
        } else {
            System.out.println("Erro!!!!!!!");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
        } else {
            System.out.println("Erro");
        }
    }

    @Override
    public void folhear(int page) {
        if (this.isAberto() && page <= this.getTotPag()) {
            this.setPagAtual(page);
        } else {
            System.out.println("Erro!!!!!!");
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("Erro!!!!!!!");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Erro");
        }
    }
}
