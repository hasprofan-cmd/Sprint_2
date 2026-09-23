package service;

import model.Food;

public class ShoppingCart {

    private final Food[] food;

    public ShoppingCart(Food[] food) {  // помогал ии
        this.food = food;
    };

    public double getTotalPrice(){
    double total = 0;
    for (int i = 0; i < food.length; i++ ){//не упрощаю по рекомендации
        total = total + (food[i].price * food[i].amount);
    }
    return total;
    };

    public double getVegetarianTotalPrice() {
        double total = 0;
        for (Food item : food) { //шаг по длине массива; упрощено по рекомендации
            if (item.isVegetarian) { //проверка условия что тру
                total = total + (item.amount * item.price);
            }
        }
        return total;
    };

    public double getTotalPriceWithDiscount(){
        double total = 0;
        for (Food value : food) {
            total = total + (value.price * value.amount - value.getDiscount());
        }
        return total;
    };

}
/* Пакет service. В нём создай класс для корзины — ShoppingCart.
 Добавь в него поле — массив элементов из объектов типа Food.
 Понадобится конструктор с одним параметром — массивом элементов Food. С его помощью ты создашь объект корзины.
В классе ShoppingCart реализуй методы для работы с корзиной:
получить общую сумму товаров в корзине без скидки,
получить общую сумму товаров в корзине со скидкой,
получить общую сумму всех вегетарианских продуктов в корзине без скидки.

 */