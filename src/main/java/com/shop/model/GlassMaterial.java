package com.shop.model;

public enum GlassMaterial {
    MINERAL("mineral"),
    ACRYLIC("acrylic"),
    SAPPHIRE("sapphire");

    private String glassMaterial;

    GlassMaterial(String glassMaterial) {
        this.glassMaterial = glassMaterial;
    }

    @Override
    public String toString() {
        return glassMaterial;
    }
}
