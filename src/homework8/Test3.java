package homework8;

public class Test3 {
    public static void main(String[] args) {

        Clothes[] manClothes = {new T_Shirt(Size.L,40,"White"),new Trousers(Size.L,100,"Black"),
                new Tie(Size.M,20,"Red")};

        Clothes[] womanClothes = {new T_Shirt(Size.XS,40,"White"),new Trousers(Size.XXS,100,"Black"),
                new Skirt(Size.XXS,90,"Black")};

        Studio s = new Studio();
        s.dressMan(manClothes);

        System.out.println();

        s.dressWoman(womanClothes);
    }
}
