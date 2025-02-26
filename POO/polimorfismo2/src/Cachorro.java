public class Cachorro extends Lobo {
    public Cachorro(int age, int members, float weight, String corPelo) {
        super(age, members, weight, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if (frase.equals("vem ca garoto")) {
            System.out.println("Abanando rabo...");
        } else if (frase.equals("sai fora")) {
            this.emitirSom();
        }
    }

    public void reagir(int hour) {
        if (hour < 12) {
            System.out.println("Abanando o rabo...");
        } else if (hour >= 18) {
            System.out.println("Ignorar...");
        } else {
            System.out.println("Abanando e latindo...");
        }
    }

    public void reagir(boolean isDono) {
        if (isDono) {
            System.out.println("Abanando...");
        } else {
            System.out.println("Rosnando e Latindo...");
        }
    }

    public void reagir(int age, float peso) {
        if (age < 5) {
            if (peso < 10) {
                System.out.println("Abanando...");
            } else {
                this.emitirSom();
            }
        } else {
            if (peso < 10) {
                this.emitirSom();
            } else {
                System.out.println("Ignorando...");
            }
        }
    }
}
