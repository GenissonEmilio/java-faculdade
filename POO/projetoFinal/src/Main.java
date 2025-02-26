public class Main {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        Gafanhoto[] gafanhotos = new Gafanhoto[2];

        videos[0] = new Video("Um novo emulador de swicth foi lançado");
        videos[1] = new Video("Estados Unidos flagra ovini pela centezima vez em New York");
        videos[2] = new Video("Novo anime Isekai sobre maquina de lavar é lançado");
        gafanhotos[0] = new Gafanhoto(19, 50, "Genisson", "M", "12344");
        Visualizacao visu = new Visualizacao(gafanhotos[0], videos[0]);
        visu.avaliar(55.6f);

        System.out.println(videos[0].toString());
        System.out.println(gafanhotos[0].toString());
        System.out.println(visu.toString());
    }
}