import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Luta {
    private LutadorUFC desafiado;
    private LutadorUFC desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(@NotNull LutadorUFC lutador, @NotNull LutadorUFC lutador1) {
        if (lutador.getCategoria().equals(lutador1.getCategoria()) && lutador != lutador1) {
            this.setAprovada(true);
            this.setDesafiado(lutador);
            this.setDesafiante(lutador1);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.isAprovada()) {
            Random random = new Random();
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            int vencedor = random.nextInt(3);

            if (vencedor == 0) {
                System.out.println("Empatou!!");
                this.getDesafiado().empatarLuta();
                this.getDesafiante().empatarLuta();
            } else if (vencedor == 1) {
                System.out.printf("Vencedor foi: %s", this.getDesafiado().getNome());
                this.getDesafiado().ganharLuta();
                this.getDesafiante().perderLuta();
            } else {
                System.out.printf("Vencedor foi: %s", this.getDesafiante().getNome());
                this.getDesafiante().ganharLuta();
                this.getDesafiado().perderLuta();
            }
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public int getRounds() {
        return rounds;
    }

    public LutadorUFC getDesafiado() {
        return desafiado;
    }

    public LutadorUFC getDesafiante() {
        return desafiante;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void setDesafiado(LutadorUFC desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(LutadorUFC desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
