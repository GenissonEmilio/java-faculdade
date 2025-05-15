import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ContaBancaria {
    private String titular;
    private StringBuilder agencia;
    private StringBuilder contaCorrente;
    private StringBuilder historico = new StringBuilder();
    private String path;
    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(String titular) {
        this.setTitular(titular);
        this.setAgencia(this.gerarAgencia());
        this.setContaCorrente(this.gerarContaCorrente());
        this.setNumero(this.gerarNumConta(this.getAgencia(), this.getContaCorrente()));
        this.setSaldo(0);
        this.setAtiva(true);
    }

    @Override
    public String toString() {
        return "ContaBancaria: \n" +
                "agencia: " + agencia +
                "\ntitular: " + titular +
                "\ncontaCorrente: " + contaCorrente +
                "\nnumero: " + numero +
                "\nsaldo: " + saldo +
                "\nativa: " + ativa;
    }

    public String gerarNumConta(StringBuilder agencia, StringBuilder contaCorrente) {
        String agenciaNum = agencia.toString().substring(0, 4);
        String contaCorrenteNum = contaCorrente.toString().substring(0, 2);

        return agenciaNum + contaCorrenteNum;
    }

    public StringBuilder gerarAgencia() {
        Random random = new Random();
        StringBuilder agencia = new StringBuilder();
        int menor = 0;

        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(0, 10);
            agencia.append(num);
            if (i == 0) {
                menor = num;
            } else if (num < menor) {
                menor = num;
            }
        }
        agencia.append("-");
        agencia.append(random.nextInt(0, menor + 1));

        return agencia;
    }

    public StringBuilder gerarContaCorrente() {
        Random random = new Random();
        StringBuilder contaCorrente = new StringBuilder();
        int menor = 0;

        for (int i = 0; i <= 5; i++) {
            int num = random.nextInt(0, 10);

            if (i == 2) {
                contaCorrente.append(".");
            } else {
                contaCorrente.append(num);
            }

            if (i == 0) {
                menor = num;
            } else if (num < menor) {
                menor = num;
            }

        }
        contaCorrente.append("-");
        contaCorrente.append(random.nextInt(0, menor + 1));

        return contaCorrente;

    }

    public void deposito(double valor) {
        if (this.isAtiva()) {
            this.setSaldo(this.getSaldo() + valor);
            this.historico.append("Deposito de: R$").append(valor).append("\n");
            return;
        }
        System.out.println("Erro! A conta precisa está ativa para o deposito");
    }

    public double sacar(double valor) {
        if (this.isAtiva() && valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            historico.append("Saque de: R$").append(valor).append("\n");
            return valor;
        } else {
            System.out.println("Erro! Conta precisa ter saldo e esta ativa");
            return 0;
        }
    }

    public void salvarExtrato() {
        this.setPath("extrato_" + this.getNumero() + ".txt");
        try (FileWriter writer = new FileWriter(this.getPath(), true)) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String dataHora = LocalDateTime.now().format(formato);

            writer.write("==========Extrato==========" + "\n");
            writer.write("Número da conta: " + this.getNumero() + "\n");
            writer.write("Saldo atual: " + this.getSaldo() + "\n");
            writer.write("Histórico: \n");
            writer.write(historico.toString());
            writer.write(dataHora + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar extrato: " + e.getMessage());
        }
    }

    public void mostrarExtrato() {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.getPath()))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public StringBuilder getAgencia() {
        return agencia;
    }

    public void setAgencia(StringBuilder agencia) {
        // Criar metodo de gerar extrato e salvar em um txt (obs: usar try e catch)
        String newAgencia = agencia.toString().replace("-", "");

        if (newAgencia.matches("^\\d{5}$")) {
            this.agencia = agencia;
            return;
        }
        System.out.println("Erro! padrão invalido");
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public StringBuilder getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(StringBuilder contaCorrente) {
        String newContaCorrente = contaCorrente.toString().replace(".", "").replace("-", "");

        if (newContaCorrente.matches("^\\d{6}$")) {
            this.contaCorrente = contaCorrente;
            return;
        }
        System.out.println("Erro! padrão invalido");
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saudo) {
        this.saldo = saudo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
