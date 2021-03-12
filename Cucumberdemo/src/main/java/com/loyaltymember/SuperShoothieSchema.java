package com.loyaltymember;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class SuperShoothieSchema {
    Map<String, Integer> pointspercategory = new HashMap<>();
    public DrinkCatalog catalog;


    public SuperShoothieSchema(DrinkCatalog catalog) {
        this.catalog = catalog;
    }

    public void addCategory(String category, Integer points) {
        pointspercategory.put(category, points);
    }
    public int getpointsFor(String drink) {
        return pointspercategory.get(categoryOf(drink));
    }

    private String categoryOf(String drink) {
        return catalog.getCategoryOf(drink);
    }
}
