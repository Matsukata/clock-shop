package com.shop.model;

import com.shop.util.Constants;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Model {

    private ArrayList<Watches> watches = new ArrayList<Watches>();

    public ArrayList db() {

        watches.add(new Watches(Brand.CASIO.toString(), new BigDecimal("24000.00"), CountryOfOrigin.JAPAN.toString(),
                Occasion.SPORTS.toString(), GlassMaterial.MINERAL.toString(), Constants.MEN, LocalDate.of(2020, 8, 12)));
        watches.add(new Watches(Brand.ORIENT.toString(), new BigDecimal("22000.00"), CountryOfOrigin.JAPAN.toString(),
                Occasion.FORMAL.toString(), GlassMaterial.SAPPHIRE.toString(), Constants.WOMAN, LocalDate.of(2020, 8, 12)));
        watches.add(new Watches(Brand.BOCCIA.toString(), new BigDecimal("13000.00"), CountryOfOrigin.GERMANY.toString(),
                Occasion.FORMAL.toString(), GlassMaterial.MINERAL.toString(), Constants.MEN, LocalDate.of(2020, 8, 12)));
        watches.add(new Watches(Brand.DIESEL.toString(), new BigDecimal("26000"), CountryOfOrigin.ITALY.toString(),
                Occasion.SPORTS.toString(), GlassMaterial.MINERAL.toString(), Constants.MEN, LocalDate.of(2020, 8, 12)));
        watches.add(new Watches(Brand.CASIO.toString(), new BigDecimal("45000"), CountryOfOrigin.JAPAN.toString(),
                Occasion.SPORTS.toString(), GlassMaterial.MINERAL.toString(), Constants.MEN, LocalDate.of(2020, 8, 12)));

        return watches;
    }
}
