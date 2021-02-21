package com.shop.model.comparator;

import com.shop.model.GlassMaterial;
import com.shop.model.Occasion;
import com.shop.model.OriginCountry;
import com.shop.model.Sex;
import com.shop.model.Watch;

import java.util.Comparator;

public class Comparators {
    public static final Comparator<Watch> BY_COLOR_COMPARATOR = Comparator.comparing(Watch::getColor);
    public static final Comparator<Watch> BY_DATE_COMPARATOR = Comparator.comparing(Watch::getDate);
    public static final Comparator<Watch> BY_PRICE_COMPARATOR = Comparator.comparing(Watch::getPrice).reversed();
    public static final Comparator<Watch> BY_ORIGIN_COUNTRY_AND_GLASS_MATERIAL_COMPARATOR = Comparator
            .comparing(Watch::getOriginCountry, Comparator.comparing(OriginCountry::toString).reversed())
            .thenComparing(Watch::getGlassMaterial, Comparator.comparing(GlassMaterial::toString));
    public static final Comparator<Watch> BY_SEX_AND_OCCASION_COMPARATOR = Comparator
            .comparing(Watch::getSex, Comparator.comparing(Sex::toString))
            .thenComparing(Watch::getOccasion, Comparator.comparing(Occasion::toString).reversed());

}
