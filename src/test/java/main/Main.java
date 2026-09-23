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


/*
Мясо в количестве 5 кг по цене 100 рублей за кг;
Яблоки красные в количестве 10 кг по цене 50 рублей;
Яблоки зелёные в количестве 8 кг по цене 60 рублей.
Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
 общую сумму товаров без скидки,
 общую сумму товаров со скидкой,
 сумму всех вегетарианских продуктов без скидки.
 */