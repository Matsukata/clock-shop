package com.shop.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Watch {
    private Brand brand;
    private BigDecimal price;
    private CountryOfOrigin countryOfOrigin;
    private Color color;
    private Occasion occasion;
    private GlassMaterial glassMaterial;
    private Sex sex;
    private LocalDate date;

    public Watch(Brand brand, BigDecimal price, CountryOfOrigin countryOfOrigin, Color color,
                 Occasion occasion, GlassMaterial glassMaterial, Sex sex, LocalDate date) {
        this.brand = brand;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
        this.color = color;
        this.occasion = occasion;
        this.glassMaterial = glassMaterial;
        this.sex = sex;
        this.date = date;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CountryOfOrigin getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(CountryOfOrigin countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    public void setOccasion(Occasion occasion) {
        this.occasion = occasion;
    }

    public GlassMaterial getGlassMaterial() {
        return glassMaterial;
    }

    public void setGlassMaterial(GlassMaterial glassMaterial) {
        this.glassMaterial = glassMaterial;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Watch by " + this.getBrand() + " for " + this.getSex() + " is produced in " + this.getCountryOfOrigin()
                + ". Its color is " + this.getColor() + ". The price is " + this.getPrice() + ".";
    }
}
