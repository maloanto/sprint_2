package model;

import model.contants.Color;
import model.contants.Discount;

public class Apple extends Food {
    private final Color color;


    public Apple(int amount, double price, Color color) {
        super.amount = amount;
        super.price = price;
        super.isVegetarian = true;
        this.color = color;
    }

    @Override
    public double getDiscount() {
        return color.equals(Color.RED) ? Discount.DISCOUNT_FOR_RED_APPLE : Discount.WITHOUT_DISCOUNT;
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
