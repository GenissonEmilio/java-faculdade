public class Main {
    public static void main(String[] args) {
        int size = 5;

        Mamifero mamifero = new Mamifero(45f, 47, 4, "Marrom");
        Reptil reptil = new Reptil(10.5f, 12, 4, "Verde");
        Peixe peixe = new Peixe(1.5f, 2, 0, "Cinza");
        Ave ave = new Ave(5.6f, 14, 4, "Preto");

        Cachorro[] cachorros = new Cachorro[size];
        cachorros[0] = new Cachorro(20.5f, 6, 4, "Amarelo");

        mamifero.alimentar();
        reptil.locomover();
        peixe.emitirSom();
        peixe.soltarBolha();
        ave.fazerNinho();
        cachorros[0].abanarRabo();
    }
}