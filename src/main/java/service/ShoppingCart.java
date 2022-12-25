package service;

import model.Food;
import model.constants.Colour;

public class ShoppingCart {
    Food[] shoppingCart = new Food[3];

    public void cart(Food[] food) {
        for (int i = 0; i < food.length; i++) {
            this.shoppingCart[i] = food[i];
        }
        getAllSum(this.shoppingCart);
        getAllSumWithDiscount(this.shoppingCart);
        getAllSumWithVegeterialsWithoutDiscount(this.shoppingCart);
    }

    public void getAllSum(Food[] shoppingCart) {
        double sum = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            sum = sum + shoppingCart[i].getPrice() * shoppingCart[i].getAmount();
        }
        System.out.println("Общая сумма товаров без скидки: " + sum);
    }

    public void getAllSumWithDiscount(Food[] shoppingCart) {
        double sum = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i].getColour() != null) {
                sum = (sum + (shoppingCart[i].getPrice() * Colour.string(shoppingCart[i].getColour())) * shoppingCart[i].getAmount());
            } else {
                sum = sum + shoppingCart[i].getPrice() * shoppingCart[i].getAmount();
            }
        }
        System.out.println("Общая сумма товаров со скидкой: " + sum);
    }

    public void getAllSumWithVegeterialsWithoutDiscount(Food[] shoppingCart) {
        double sum = 0;
        for (int i = 0; i < shoppingCart.length; i++) {
            if (shoppingCart[i].isVegetarian()) {
                sum = sum + shoppingCart[i].getPrice() * shoppingCart[i].getAmount();
            }
        }
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + sum);
    }
}