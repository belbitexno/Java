package homework10;

import java.io.Serializable;

public class Animal implements Cloneable, Serializable {
    private String color;
    private int age;
    private int weight;

    public Animal(){}

    public Animal(String color, int age, int weight) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
