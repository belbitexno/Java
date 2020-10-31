package homework10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Dog dog = new Dog("grey",7,35,"Vasya","Doberman",true);
        System.out.println(dog.toString());
        copy(dog);

        Horse horse = new Horse("green",4,50,"poni",20);
        serialize(horse);
        deSerialize(horse);

        Cat cat = new Cat("green",7,6,"Petrovich","Secret cat");
        serialiseExternalize(cat);
        deSerialiseExternalize(cat);
    }

    public static void copy(Dog dog) throws CloneNotSupportedException { //Task 2
        dog = (Dog)dog.clone();
        System.out.println("Копия " + dog.toString());
    }

    public static void serialize(Horse horse) throws IOException { // Task1
        FileOutputStream outputStream = new FileOutputStream("File2");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(horse);
        objectOutputStream.close();
    }

    public static void deSerialize(Horse horse) throws IOException, ClassNotFoundException { // Task1
        FileInputStream fileInputStream = new FileInputStream("File2");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        horse = (Horse) objectInputStream.readObject();
        System.out.println(horse);
    }

    public static void serialiseExternalize(Cat cat) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("File3");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cat);
        objectOutputStream.close();
    }

    public static void deSerialiseExternalize(Cat cat) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("File3");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        cat = (Cat) objectInputStream.readObject();
        System.out.println(cat);
        objectInputStream.close();
    }
}
