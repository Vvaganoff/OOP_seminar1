package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink americano = new HotDrink("Американо", 150, 300, 75);
        HotDrink capuchino = new HotDrink("Капучино", 200, 300, 75);
        HotDrink latte = new HotDrink("Латте", 200, 300, 75);
        HotDrink tea = new HotDrink("Черный чай", 50, 400, 85);
        HotDrink teaWithLemon = new HotDrink("Черный чай с лимоном", 50, 400, 85);
        List<HotDrink> hotDrinkList= new ArrayList<>();
        hotDrinkList.add(americano);
        hotDrinkList.add(capuchino);
        hotDrinkList.add(latte);
        hotDrinkList.add(tea);
        hotDrinkList.add(teaWithLemon);
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine(hotDrinkList);
        System.out.println(hotDrinksVendingMachine.getProduct("Американо", 300, 75));
    }
}