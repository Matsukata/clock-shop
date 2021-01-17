package com.shop.model;

public enum GlassMaterial {
    MINERAL("Mineral"),
    SAPPHIRE("Sapphire");

    private String glassMaterial;

    GlassMaterial(String glassMaterial) {
        this.glassMaterial = glassMaterial;
    }

    @Override
    public String toString() {
        return glassMaterial;
    }
}
