package model;

public abstract class Food implements Discountable{

    public double amount;
    public double price;
    public boolean isVegetarian;

    public Food(double amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return 0.0;

    }
}
