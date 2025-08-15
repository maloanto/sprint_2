package model;

public class Meat extends Food implements Discountable {

    public Meat(int amount, double price) {
        super.amount = amount;
        super.price = price;
        super.isVegetarian = false;
    }

    @Override
    public double getDiscount() {
        return 0;
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
