package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class WatchByGlassMaterialComparator implements Comparator<Watch> {
    @Override
    public int compare(Watch watch1, Watch watch2) {
        return watch1.getGlassMaterial().compareTo(watch2.getGlassMaterial());
    }
}
