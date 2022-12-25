package model;

public class Meat extends Food {
    public boolean isVegetarian() {
        return false;
    }

    public Meat(int amount, int price) {
        super(amount, price);
    }
}