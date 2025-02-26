public class Main {
    public static void main(String[] args) {
        Lobo lobo = new Lobo(10, 4, 15.7f, "Branco");
        Cachorro cachorro = new Cachorro(8, 4, 25.9f, "Preto");


        lobo.emitirSom();
        cachorro.reagir("vem ca garoto");
        cachorro.reagir(13);
        cachorro.reagir(17, 4.5f);
        cachorro.reagir(true);
    }
}