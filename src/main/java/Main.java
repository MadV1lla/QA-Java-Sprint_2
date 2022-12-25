import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleGreen = new Apple(10, 50, "green");
        Apple appleRed = new Apple(8, 60, "red");
        ShoppingCart shoppingCart = new ShoppingCart();

        Food[] food = {meat, appleGreen, appleRed};
        shoppingCart.cart(food);
    }
}