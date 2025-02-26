public abstract class Pessoa {
    protected String name;
    protected int age;
    protected String sexo;
    protected int experience;

    public Pessoa(int age, int experience, String name, String sexo) {
        this.age = age;
        this.experience = 0;
        this.name = name;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sexo='" + sexo + '\'' +
                ", experience=" + experience +
                '}';
    }

    protected void ganharExp(int xp) {
        this.setExperience(this.getExperience() + xp);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experiencia) {
        this.experience = experiencia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
