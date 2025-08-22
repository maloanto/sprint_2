package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

     public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getPriceAllProductWithoutDiscount() {
        double sum = 0;
        for (Food i : foods) {
            sum += i.getAllPrice();
        }
        return sum;
    }

    public double getVegetableFoodsPrice() {
        double sum = 0;
        for (Food i : foods) {
            if (i.isVegetarian()) {
                sum += i.getAllPrice();
            }
        }
        return sum;
    }

    public double getPriceWithDiscount() {
        double sum = 0;
        for (Food i : foods) {
            sum += i.getAllPriceWithDiscount();
        }
        return sum;
    }
}
