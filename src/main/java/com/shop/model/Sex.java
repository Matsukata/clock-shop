package com.shop.model;

public enum Sex {
    MEN("men"),
    WOMEN("women");

    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}
