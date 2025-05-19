public class Main {
    public static void main(String[] args) {
        GerenciadorDeCodigos gerenciadorDeCodigos = new GerenciadorDeCodigos();
        String caminho = "codigos.txt";

        //1. Leitura do arquivo com códigos(e exibição dos codigos)
        gerenciadorDeCodigos.carregarCodigos(caminho);

        //2. Entrega de um código disponivel / gera codigos quando todos já tiverem sido usados
        if (gerenciadorDeCodigos.isDisponivel()) {
            CodigoVisitante codigoUsado = gerenciadorDeCodigos.obterCodigoDisponivel();
            System.out.println("\nCódigo entregue: " + codigoUsado.getCodigo());

        } else {
            System.out.println("\nNenhum codigo disponivel");
            gerenciadorDeCodigos.gerarNovosCodigos(15, caminho);
        }

        //4. Salvamento das alterações no arquivo
        gerenciadorDeCodigos.salvarCodigos(caminho);

    }
}