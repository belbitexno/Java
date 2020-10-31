package homework10;

public class Horse extends Animal {
    private String breed;
    private int height;
    private static final long serial = 1L;

    public Horse(String color, int age, int weight, String breed, int height) {
        super(color, age, weight);
        this.breed = breed;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                '}';
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
