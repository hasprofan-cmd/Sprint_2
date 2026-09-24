package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food {

    public String colour;


    public Apple (double amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED_APPLE.equals(colour)) { // colour равно "red"
           return Discount.RED_APPLE;
        }
        return super.getDiscount();
    }
}
