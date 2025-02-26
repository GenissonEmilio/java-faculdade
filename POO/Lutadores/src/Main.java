public class Main {
    public static void main(String[] args) {
        LutadorUFC[] lutador = new LutadorUFC[6];
        lutador[0] = new LutadorUFC("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        lutador[1] = new LutadorUFC("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutador[2] = new LutadorUFC("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lutador[3] = new LutadorUFC("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        lutador[4] = new LutadorUFC("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutador[5] = new LutadorUFC("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        Luta luta = new Luta();
        luta.marcarLuta(lutador[0], lutador[1]);
        luta.lutar();

        /*lutador[0].ganharLuta();
        lutador[0].status();
        lutador[1].status();
        lutador[2].status();
        lutador[3].status();
        lutador[4].status();
        lutador[5].status();*/
    }
}