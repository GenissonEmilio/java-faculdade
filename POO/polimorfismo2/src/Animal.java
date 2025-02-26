public abstract class Animal {
    protected int age;
    protected float weight;
    protected int members;

    public Animal(int age, int members, float weight) {
        this.age = age;
        this.members = members;
        this.weight = weight;
    }

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

    public void setCorPelo(String corPelo) {
        this.members = members;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
