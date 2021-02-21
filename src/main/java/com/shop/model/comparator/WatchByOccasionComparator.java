package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class WatchByOccasionComparator implements Comparator<Watch> {
    @Override
    public int compare(Watch watch1, Watch watch2) {
        return watch1.getOccasion().compareTo(watch2.getOccasion());
    }
}
