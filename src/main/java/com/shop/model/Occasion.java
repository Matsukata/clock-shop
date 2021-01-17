package com.shop.model;

public enum Occasion {
    SPORTS("Sports"),
    CASUAL("Casual"),
    FORMAL("Formal");

    private String occasion;

    Occasion(String occasion) {
        this.occasion = occasion;
    }

    @Override
    public String toString() {
        return occasion;
    }
}
