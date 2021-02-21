package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class Comparators {
    public static final Comparator<Watch> BY_COLOR_COMPARATOR = Comparator.comparing(Watch::getColor);
    public static final Comparator<Watch> BY_DATE_COMPARATOR = Comparator.comparing(Watch::getDate);
    public static final Comparator<Watch> BY_GLASS_MATERIAL_COMPARATOR = Comparator.comparing(Watch::getGlassMaterial);
    public static final Comparator<Watch> BY_OCCASION_COMPARATOR = Comparator.comparing(Watch::getOccasion);
    public static final Comparator<Watch> BY_ORIGIN_COUNTRY_COMPARATOR = Comparator.comparing(Watch::getOriginCountry).reversed();
    public static final Comparator<Watch> BY_PRICE_COMPARATOR = Comparator.comparing(Watch::getPrice).reversed();
    public static final Comparator<Watch> BY_SEX_COMPARATOR = Comparator.comparing(Watch::getSex);
}
