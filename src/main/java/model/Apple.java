package model;

import model.contants.Color;
import model.contants.Discount;

public class Apple extends Food {
    private final Color color;
    private final Discount discount = new Discount();

    public Apple(int amount, double price, Color color) {
        super.amount = amount;
        super.price = price;
        super.isVegetarian = true;
        this.color = color;
    }

    @Override
    public double getDiscount() {
        return color.equals(Color.RED) ? discount.discountForRedApple : discount.withoutDiscount;
    }

    @Override
    public double getAllPrice() {
        return super.price * super.amount;
    }

    @Override
    public double getAllPriceWithDiscount() {
        double discount = getDiscount();

        return super.price * super.amount * (1 - discount);
    }
}
