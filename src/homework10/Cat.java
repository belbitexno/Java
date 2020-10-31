package homework10;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

public class Cat extends Animal implements Externalizable {

    private String name;
    private String secretBreed;

    public Cat() {
    }

    public Cat(String color, int age, int weight, String name, String secretBreed) {
        super(color, age, weight);
        this.name = name;
        this.secretBreed = secretBreed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecretBreed() {
        return secretBreed;
    }

    public void setSecretBreed(String secretBreed) {
        this.secretBreed = secretBreed;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(this.name);
    out.writeObject(this.getAge());
    out.writeObject(this.getWeight());
    out.writeObject(this.getColor());
    out.writeObject(this.encryptString(this.getSecretBreed()));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    name = (String) in.readObject();
    setAge((Integer) in.readObject());
    setWeight((Integer) in.readObject());
    setColor((String) in.readObject());
    secretBreed = this.decryptString((String) in.readObject());

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", secretBreed='" + secretBreed + '\'' +
                '}';
    }

    private String encryptString(String breed){
        String encryptedBread = Base64.getMimeEncoder().encodeToString(breed.getBytes());
        System.out.println(encryptedBread);
        return encryptedBread;
    }

    private String decryptString(String breed){
        String decrypted = new String (Base64.getDecoder().decode(breed));
        System.out.println(decrypted);
        return decrypted;
    }
}
