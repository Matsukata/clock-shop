package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class WatchBySexAndOccasionComparator implements Comparator<Watch> {
    @Override
    public int compare(Watch watch1, Watch watch2) {
        int watchComparator = watch1.getSex().compareTo(watch2.getSex());
        return ((watchComparator == 0) ? watch1.getOccasion().compareTo(watch2.getOccasion()) : watchComparator);
    }
}
