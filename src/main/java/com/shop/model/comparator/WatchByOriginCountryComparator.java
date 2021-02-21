package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class WatchByOriginCountryComparator implements Comparator<Watch> {
    @Override
    public int compare(Watch watch1, Watch watch2) {
        return watch2.getOriginCountry().compareTo(watch1.getOriginCountry());
    }
}
