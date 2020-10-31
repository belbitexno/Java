package homework8;



public class Tie extends Clothes {

    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук, размер: " + getSize() + ", цена: " + getCost() + ", цвет: " + getColor());
    }

    @Override
    public void dressWoman() {
        System.out.println("Юбка, размер: " + getSize() + ", цена: " + getCost() + ", цвет: " + getColor());
    }
}
