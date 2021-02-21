package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class WatchByOriginCountryAndGlassMaterialComparator implements Comparator<Watch> {
    @Override
    public int compare(Watch watch1, Watch watch2) {
        int watchComparator = watch2.getOriginCountry().compareTo(watch1.getOriginCountry());
        return ((watchComparator == 0) ? watch1.getGlassMaterial().compareTo(watch2.getGlassMaterial()) : watchComparator);
    }
}
