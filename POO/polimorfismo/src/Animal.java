public abstract class Animal {
    protected float weight;
    protected int age;
    protected int members;

    public Animal(float weight, int age, int members) {
        this.weight = weight;
        this.age = age;
        this.members = members;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
