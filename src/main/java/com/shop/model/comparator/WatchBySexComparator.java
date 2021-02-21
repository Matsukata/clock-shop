package com.shop.model.comparator;

import com.shop.model.Watch;

import java.util.Comparator;

public class WatchBySexComparator implements Comparator<Watch> {
    @Override
    public int compare(Watch watch1, Watch watch2) {
        return watch1.getSex().compareTo(watch2.getSex());
    }
}
