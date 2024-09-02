package com.example.doubleactivity;

import java.util.ArrayList;
import java.util.List;

public class FoodExpert {

    List<String> getMenu(String meal) {
        List<String> Menu = new ArrayList<>();
        if (meal.equals("Breakfast")) {
            Menu.add("Bread");
            Menu.add("Dal");
            Menu.add("Egg");
            Menu.add("Sour Curd");
        }
        else if (meal.equals("Lunch")) {
            Menu.add("Rice");
            Menu.add("Chicken");
            Menu.add("Fish");
            Menu.add("Meat");
        }
        else {
            Menu.add("Rice");
            Menu.add("Vegetable");
            Menu.add("Chicken");
            Menu.add("Fish");
        }
        return Menu;
    }
}