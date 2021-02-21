package com.shop.model;

public enum Color {
    RED("red"),
    GOLD("gold"),
    BLUE("blue"),
    BROWN("brown"),
    GREEN("green"),
    YELLOW("yellow"),
    SILVER("SILVER"),
    BLACK("black");

    private String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
