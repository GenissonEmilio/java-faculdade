public class Gafanhoto extends Pessoa {
    private String loggin;
    private int totWatched;


    public Gafanhoto(int age, int experience, String name, String sexo, String loggin) {
        super(age, experience, name, sexo);
        this.loggin = loggin;
        this.totWatched = 0;
    }

    public void viuMaisUm() {
        this.setTotWatched(this.getTotWatched() + 1);
    }


    public String getLoggin() {
        return loggin;
    }

    public void setLoggin(String loggin) {
        this.loggin = loggin;
    }

    public int getTotWatched() {
        return totWatched;
    }

    public void setTotWatched(int totWatched) {
        this.totWatched = totWatched;
    }
}
