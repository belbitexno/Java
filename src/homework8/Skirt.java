package homework8;

public class Skirt extends Clothes {

    public Skirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Юбка, размер: " + getSize() + ", цена: " + getCost() + ", цвет: " + getColor());
    }

    @Override
    public void dressWoman() {
        System.out.println("Юбка, размер: " + getSize() + ", цена: " + getCost() + ", цвет: " + getColor());
    }
}
