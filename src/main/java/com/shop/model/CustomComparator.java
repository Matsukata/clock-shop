package com.shop.model;

import com.shop.view.InputHandler;

import java.util.Comparator;

public class CustomComparator implements Comparator<Watch> {

    @Override
    public int compare(Watch watch1, Watch watch2) {
        int brandCompare = watch1.getBrand().compareTo(watch2.getBrand());
        int sexCompare = watch1.getSex().compareTo(watch2.getBrand());
        return 0;
    }
}


