package com.shop.model;

public enum Occasion {
    SPORTS("sports"),
    CASUAL("casual"),
    FORMAL("formal");

    private String occasion;

    Occasion(String occasion) {
        this.occasion = occasion;
    }

    @Override
    public String toString() {
        return occasion;
    }
}
