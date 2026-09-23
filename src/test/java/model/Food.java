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
        //Все классы, реализующие этот интерфейс,
        // возвращают значение 0 в методе getDiscount, если в задании не указано иное.
    }
}


/*
Класс Food — абстрактный класс с полями:
amount — количество продукта в килограммах (целое число);
price — цена за единицу (вещественное число);
isVegetarian — флаг, который показывает, вегетарианский ли продукт.
Поля должны быть доступны только из классов-потомков.
 */