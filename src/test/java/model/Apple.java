package model;

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
        if ("red".equals(colour)) { // colour равно "red"
           return Discount.RED_APPLE;
        }
        return super.getDiscount();
    }
}
/*
Класс Apple — для яблок.
 У него есть ещё строковое поле colour — цвет яблок.
 Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
 */