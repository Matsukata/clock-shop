package com.shop.model;

public enum Color {
    RED("red"),
    GOLD("gold"),
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
