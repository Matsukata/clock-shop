package com.shop.model;

import com.shop.Constants;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class DBLayer implements Model {

    private ArrayList<Watches> watches = new ArrayList<Watches>();

    public void db() {

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

    }

    @Override
    public Watches getWatches() {
        db();
        Watches w = null;
        for (int i = 0; i < watches.size(); i++) {
            w = watches.get(i);
            return w;
        }
        return w;
    }

}
