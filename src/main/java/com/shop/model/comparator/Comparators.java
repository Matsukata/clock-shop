package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class Comparators {
    public static final Comparator<Watch> byColorComparator = new WatchByColorComparator();
    public static final Comparator<Watch> byDateComparator = new WatchByDateComparator();
    public static final Comparator<Watch> byGlassMaterialComparator = new WatchByGlassMaterialComparator();
    public static final Comparator<Watch> byOccasionComparator = new WatchByOccasionComparator();
    public static final Comparator<Watch> byOriginCountryComparator = new WatchByOriginCountryComparator();
    public static final Comparator<Watch> byPriceComparator = new WatchByPriceComparator();
    public static final Comparator<Watch> bySexComparator = new WatchBySexComparator();
}
