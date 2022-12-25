package model;

public class Apple extends Food{
    public boolean isVegetarian() {
        return true;
    }

    public Apple(int amount, int price, String colour) {
        super(amount, price, colour);
    }
}