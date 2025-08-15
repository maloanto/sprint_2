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

        System.out.println("Общая сумма за продукты: ");
        System.out.println(shoppingCart.getPriceAllProductWithoutDiscount());

        System.out.println("Сумма за продукты со скидками: ");
        System.out.println(shoppingCart.getPriceWithDiscount());


        System.out.println("Сумма за веганские продукты: ");
        System.out.println(shoppingCart.getVegetableFoodsPrice());
    }
}
