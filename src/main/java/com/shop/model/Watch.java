package com.shop.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Watch {
    private String brand;
    private BigDecimal price;
    private String countryOfOrigin;
    private String occasion;
    private String glassMaterial;
    private String sex;
    private LocalDate date;

    public Watch(String brand, BigDecimal price, String countryOfOrigin, String occasion, String glassMaterial, String sex, LocalDate date) {
        this.brand = brand;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
        this.occasion = occasion;
        this.glassMaterial = glassMaterial;
        this.sex = sex;
        this.date = date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getGlassMaterial() {
        return glassMaterial;
    }

    public void setGlassMaterial(String glassMaterial) {
        this.glassMaterial = glassMaterial;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
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
                + ". The price is " + this.getPrice() + ".";
    }
}
