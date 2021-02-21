package com.shop.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DBProvider {
    private List<Watch> dataBaseWatches = new ArrayList<>();

    public List<Watch> getData() {
        dataBaseWatches.add(new Watch(Brand.CASIO, "JTB -356", new BigDecimal("20000.00"), OriginCountry.JAPAN,
                Color.BLACK, Occasion.SPORTS, GlassMaterial.MINERAL, Sex.MEN, LocalDate.of(2020, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.ORIENT, "TY-234", new BigDecimal("20000.00"), OriginCountry.JAPAN,
                Color.GOLD, Occasion.FORMAL, GlassMaterial.SAPPHIRE, Sex.WOMEN, LocalDate.of(2019, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.BOCCIA, "RGH - 415", new BigDecimal("10000.00"), OriginCountry.GERMANY,
                Color.BLACK, Occasion.FORMAL, GlassMaterial.MINERAL, Sex.MEN, LocalDate.of(2020, 11, 12)));
        dataBaseWatches.add(new Watch(Brand.DIESEL, "SDK - 245", new BigDecimal("30000"), OriginCountry.ITALY,
                Color.RED, Occasion.CASUAL, GlassMaterial.MINERAL, Sex.MEN, LocalDate.of(2018, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.CASIO, "RTG - 563", new BigDecimal("40000"), OriginCountry.JAPAN,
                Color.BLACK, Occasion.SPORTS, GlassMaterial.MINERAL, Sex.MEN, LocalDate.of(2020, 8, 12)));
        return dataBaseWatches;
    }
}
