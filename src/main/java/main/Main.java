package main;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;


public class Main {

    public static void main (String[] args) {
        Food meat = new Meat(5,100);
        Food redApple = new Apple(10,50, Colour.RED_APPLE);
        Food greenApple = new Apple(8,60,Colour.GREEN_APPLE);

        Food[] products = { meat, redApple, greenApple };

        ShoppingCart cart = new ShoppingCart(products);
        System.out.println("Общая сумма товаров без скидки - " +  cart.getTotalPrice());
        System.out.println("Общая сумма товаров со скидкой - " +  cart.getTotalPriceWithDiscount());
        System.out.println("Общая вегетарианских товаров без скидки - " +  cart.getVegetarianTotalPrice());

    }
}

