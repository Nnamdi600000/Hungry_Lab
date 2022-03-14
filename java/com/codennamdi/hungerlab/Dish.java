package com.codennamdi.hungerlab;

public class Dish {

    //The states
    String title;
    String description;
    int price;

    //The Dish class
    Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return title;
    }
}
