package com.shop.model;

import com.shop.util.Constants;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DBProvider {
    private List<Watch> watches = new ArrayList<>();
    private List<Watch> dataBaseWatches = new ArrayList<>();
    private DataBaseByUser dataBaseByUser = new DataBaseByUser();

    public List<Watch> getDataBaseWatches() {
        dataBaseWatches.add(new Watch(Brand.CASIO.toString(), new BigDecimal("24000.00"), CountryOfOrigin.JAPAN.toString(),
                Color.BLACK.toString(), Occasion.SPORTS.toString(), GlassMaterial.MINERAL.toString(), Constants.MEN, LocalDate.of(2020, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.ORIENT.toString(), new BigDecimal("22000.00"), CountryOfOrigin.JAPAN.toString(),
                Color.GOLD.toString(), Occasion.FORMAL.toString(), GlassMaterial.SAPPHIRE.toString(), Constants.WOMAN, LocalDate.of(2020, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.BOCCIA.toString(), new BigDecimal("13000.00"), CountryOfOrigin.GERMANY.toString(),
                Color.BLACK.toString(), Occasion.FORMAL.toString(), GlassMaterial.MINERAL.toString(), Constants.MEN, LocalDate.of(2020, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.DIESEL.toString(), new BigDecimal("26000"), CountryOfOrigin.ITALY.toString(),
                Color.RED.toString(), Occasion.SPORTS.toString(), GlassMaterial.MINERAL.toString(), Constants.MEN, LocalDate.of(2020, 8, 12)));
        dataBaseWatches.add(new Watch(Brand.CASIO.toString(), new BigDecimal("45000"), CountryOfOrigin.JAPAN.toString(),
                Color.BLACK.toString(), Occasion.SPORTS.toString(), GlassMaterial.MINERAL.toString(), Constants.MEN, LocalDate.of(2020, 8, 12)));
        return dataBaseWatches;
    }

    public List<Watch> getData() throws IOException {
        watches.addAll(getDataBaseWatches());
        watches.addAll(dataBaseByUser.getDataBaseByUser());
        return watches;
    }
}




