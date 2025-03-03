import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean venceu = false;
        boolean jogador1 = true;
        int jogadas = 0;
        char[][] tabuleiro = {
                {'-','-','-'},
                {'-','-','-'},
                {'-','-','-'}
        };

        //Jogo principal
        while (!venceu && jogadas < 9) {
            imrpimirTabuleiro(tabuleiro);

            //Jogada de cada jogador
            System.out.println("Jogador " + (jogador1? "1 (X)" : "2 (O)") + ", escolha uma linha e uma coluna (0-2)");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != '-') {
                System.out.println("Erro! Jogada invalida");
                continue;
            }

            //Marca as jogadas
            tabuleiro[linha][coluna] = jogador1? 'X' : 'O';
            jogadas++;

            //Verifica se há um vencedor
            venceu = verificarVencedor(tabuleiro);

            //Alterna o jogador
            jogador1 = !jogador1;

            clear();
        }

        imrpimirTabuleiro(tabuleiro);
        if (venceu) {
            System.out.println("Parabéns, jogador " + (jogador1 ? "2 (O)" : "1 (X)") + "Venceu");
        } else {
            System.out.println("Deu velha! O jogo impatou");
        }

        scanner.close();
    }

    //Função para imprimir o tabuleiro
    public static void imrpimirTabuleiro(char[][] tabuleiro) {
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.printf("%7s", tabuleiro[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    //Função para verificar quem venceu
    public static boolean verificarVencedor(char[][] tabuleiro) {
        //Verificar as linhas e as colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != '-') || (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i] && tabuleiro[0][i] != '-')) {
                return true;
            }
        }

        //Verifica as diagonais
        if ((tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != '-') || (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != '-')) {
            return true;
        }

        return false;
    }

    //Metodo para simular a limpeza do terminal
    public static void clear() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
}