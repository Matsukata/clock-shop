package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class WatchByPriceComparator implements Comparator<Watch> {
    @Override
    public int compare(Watch watch1, Watch watch2) {
        return watch2.getPrice().compareTo(watch1.getPrice());
    }
}
