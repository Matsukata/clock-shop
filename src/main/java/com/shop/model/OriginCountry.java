package com.shop.model;

public enum OriginCountry {
    JAPAN("Japan"),
    GERMANY("Germany"),
    SPAIN("Spain"),
    CHINA("China"),
    RUSSIA("Russia"),
    UKRAINE("Ukraine"),
    ITALY("Italy");

    private String originCountry;

    OriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    @Override
    public String toString() {
        return originCountry;
    }
}
