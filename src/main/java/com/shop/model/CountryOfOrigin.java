package com.shop.model;

public enum CountryOfOrigin {
    JAPAN("Japan"),
    GERMANY("Germany"),
    ITALY("Italy");

    private String countryOfOrigin;

    CountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return countryOfOrigin;
    }
}
