package com.shop.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DBProvider {
    private List<Watch> dataBaseWatches = new ArrayList<>();

    public List<Watch> getData() {
        dataBaseWatches.add(new Watch(Brand.CASIO, new BigDecimal("24000.00"), CountryOfOrigin.JAPAN,
                Color.BLACK, Occasion.SPORTS, GlassMaterial.MINERAL, Sex.MEN, LocalDate.of(2020, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.ORIENT, new BigDecimal("22000.00"), CountryOfOrigin.JAPAN,
                Color.GOLD, Occasion.FORMAL, GlassMaterial.SAPPHIRE, Sex.WOMEN, LocalDate.of(2020, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.BOCCIA, new BigDecimal("13000.00"), CountryOfOrigin.GERMANY,
                Color.BLACK, Occasion.FORMAL, GlassMaterial.MINERAL, Sex.MEN, LocalDate.of(2020, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.DIESEL, new BigDecimal("26000"), CountryOfOrigin.ITALY,
                Color.RED, Occasion.CASUAL, GlassMaterial.MINERAL, Sex.MEN, LocalDate.of(2020, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.CASIO, new BigDecimal("45000"), CountryOfOrigin.JAPAN,
                Color.BLACK, Occasion.SPORTS, GlassMaterial.MINERAL, Sex.MEN, LocalDate.of(2020, 8, 12)));
        return dataBaseWatches;
    }
}




