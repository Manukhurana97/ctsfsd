package com.loyaltymember;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {

    Map<String, String> drinkCategories = new HashMap<>();
    public void addDrink(String drink, String category) {
        System.out.println("smoothee drink: "+category+" "+ drink);
        drinkCategories.put(drink, category);
    }

    public String getCategoryOf(String drink) {
        return drinkCategories.get(drink);
    }
}
