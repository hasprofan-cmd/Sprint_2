package service;

import model.Food;

public class ShoppingCart {

    private final Food[] food;

    public ShoppingCart(Food[] food) {  // помогал ии
        this.food = food;
    };

    public double getTotalPrice(){
    double total = 0;
    for (int i = 0; i < food.length; i++ ){
        total = total + (food[i].price * food[i].amount);
    }
    return total;
    };

    public double getVegetarianTotalPrice() {
        double total = 0;
        for (Food item : food) {
            if (item.isVegetarian) {
                total = total + (item.amount * item.price);
            }
        }
        return total;
    };

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food value : food) {
            double itemTotal = value.price * value.amount;
            double discount = itemTotal * (value.getDiscount() / 100);
            total = total + itemTotal - discount;
        }
        return total;
    }

}