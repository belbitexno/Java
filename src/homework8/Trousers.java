package homework8;

public class Trousers extends Clothes {

    public Trousers(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны, размер: " + getSize().getDescription() + ", цена: " + getCost() + ", цвет: " + getColor());
    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны, размер: " + getSize().getDescription() + ", цена: " + getCost() + ", цвет: " + getColor());
    }
}
