package model;

public abstract class Food {

    private int amount;
    private double price;

    private boolean isVegetarian;

    private String colour;

    public Food(int amount, int price) {
        this.amount = amount;
        this.price = price;
    }
    public Food(int amount, int price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}