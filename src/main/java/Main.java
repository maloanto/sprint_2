import model.Apple;
import model.Food;
import model.Meat;
import model.contants.Color;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Color.RED);
        Apple greenApple = new Apple(8, 60, Color.GREEN);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.printf("Общая сумма за продукты: %s%n",  shoppingCart.getPriceAllProductWithoutDiscount());

        System.out.printf("Сумма за продукты со скидками: %s%n", shoppingCart.getPriceWithDiscount());

        System.out.printf("Сумма за веганские продукты: %s%n", shoppingCart.getVegetableFoodsPrice());
    }
}
