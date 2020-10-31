package homework8;

public abstract class Clothes implements ManClothes, WomanClothes{
    private Size size;
    private int cost;
    private String color;

    public Clothes(Size size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }


}
