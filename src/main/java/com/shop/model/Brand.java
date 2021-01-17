package com.shop.model;

public enum Brand {
    CASIO("Casio"),
    ORIENT("Orient"),
    BOCCIA("Boccia"),
    DIESEL("Diesel");

    private String brandTitle;

    Brand(String brandTitle) {
        this.brandTitle = brandTitle;
    }

    @Override
    public String toString() {
        return brandTitle;
    }
}
