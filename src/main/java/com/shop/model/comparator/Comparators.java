package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class Comparators {
    public static final Comparator<Watch> byColorComparator = Comparator.comparing(Watch::getColor);
    public static final Comparator<Watch> byDateComparator = Comparator.comparing(Watch::getDate);
    public static final Comparator<Watch> byGlassMaterialComparator = Comparator.comparing(Watch::getGlassMaterial);
    public static final Comparator<Watch> byOccasionComparator = Comparator.comparing(Watch::getOccasion);
    public static final Comparator<Watch> byOriginCountryComparator = Comparator.comparing(Watch::getOriginCountry);
    public static final Comparator<Watch> byPriceComparator = Comparator.comparing(Watch::getPrice);
    public static final Comparator<Watch> bySexComparator = Comparator.comparing(Watch::getSex);
}
