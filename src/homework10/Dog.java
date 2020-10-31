package homework10;

public class Dog extends Animal{
    private String name;
    private String breed;
    private boolean isInExhibitions;

    public Dog(String color, int age, int weight, String name, String breed, boolean isInExhibitions) {
        super(color, age, weight);
        this.name = name;
        this.breed = breed;
        this.isInExhibitions = isInExhibitions;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", isInExhibitions=" + isInExhibitions +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isInExhibitions() {
        return isInExhibitions;
    }

    public void setInExhibitions(boolean inExhibitions) {
        isInExhibitions = inExhibitions;
    }
}
