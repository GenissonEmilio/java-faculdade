import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GerenciadorDeCodigos {
    private List<CodigoVisitante> codigos;

    public GerenciadorDeCodigos() {
        this.codigos = new ArrayList<>();
    }

    //Lê todos os codigos validos do arquivo .txt
    public void carregarCodigos(String caminho) {

    }

    //Pega o primeiro codigo nãu utilizado da lista caso tenha um
    public CodigoVisitante obterCodigoDisponivel() {
        for (CodigoVisitante codigo : this.listarCodigos()) {
            if (!codigo.isUsado()) {
                return codigo;
            }
        }

        return null;
    }

    //Salva os codigos com indicações de quais já foram usados
    public void salvarCodigos(String caminho) {

    }

    //Gera novos codigos seguindo o padrão
    public CodigoVisitante gerarNovoCodigo() {
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();
        codigo.append("VIS-");

        //Gera as três letras usando o random + hashcode dos chars
        for (int i = 0; i < 3; i++) {
            char letra = (char)(random.nextInt(26) + 'A');
            codigo.append(letra);
        }

        //Gera os 4 numeros aleatorios
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            int digito = random.nextInt(10);
            soma += digito;
            codigo.append(digito);
        }
        codigo.append("-");

        //Cria o digito verificador com base nos 4 digitos
        int verificador = soma % 10;
        codigo.append(verificador);

        return new CodigoVisitante(codigo.toString());
    }

    //Gera varios codigos com base na quantidade passada, e atualiza o arquivo com os novos codigos
    public void gerarNovosCodigos(int qtd) {
        for (int i = 0; i < qtd; i++) {
            this.adicionarCodigo(this.gerarNovoCodigo());

        }
    }

    //Adiciona codigos na lista de codigos
    public void adicionarCodigo(CodigoVisitante codigo) {
        codigos.add(codigo);
    }

    //Lista todos os codigos na lista
    public List<CodigoVisitante> listarCodigos() {
        return codigos;
    }
}
