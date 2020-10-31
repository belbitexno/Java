package homework8;

public class T_Shirt extends Clothes {

    public T_Shirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Майка, размер: " + getSize().euroSize + ", цена: " + getCost() + ", цвет: " + getColor());
    }

    @Override
    public void dressWoman() {
        System.out.println("Майка, размер: " + getSize().euroSize + ", цена: " + getCost() + ", цвет: " + getColor());
    }
}
