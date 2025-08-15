package model;

import model.contants.Color;

public class Apple extends Food implements Discountable{
    private final Color color;

    public Apple(int amount, double price, Color color) {
        super.amount = amount;
        super.price = price;
        super.isVegetarian = true;
        this.color = color;
    }

    @Override
    public double getDiscount() {
        if (color.equals(Color.RED)) {
            return 0.60;
        } else {
            return 0;
        }
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
