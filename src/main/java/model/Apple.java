package model;

import model.contants.Color;

public class Apple extends Food {
    private final Color color;
    private final double DISCOUNT_FOR_RED_APPLE = 0.60;
    private final double WITHOUT_DISCOUNT = 0.0;


    public Apple(int amount, double price, Color color) {
        super.amount = amount;
        super.price = price;
        super.isVegetarian = true;
        this.color = color;
    }

    @Override
    public double getDiscount() {
        return color.equals(Color.RED) ? DISCOUNT_FOR_RED_APPLE : WITHOUT_DISCOUNT;
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
