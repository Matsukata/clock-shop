package com.shop.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomComparator {

    public List<Watch> getFilteredWatchesByColor(String line, List<Watch> watches) {
        List<Watch> watchesFilteredByColor = new ArrayList();
        for (Watch watch : watches) {
            if (watch.getColor().equals(line)) {
                watchesFilteredByColor.add(watch);
            }
        }
        return watchesFilteredByColor;
    }

    public List<Watch> getFilteredWatchesByPrice(String line, List<Watch> watches) {
        List<Watch> watchesFilteredByPrice = new ArrayList();
        for (Watch watch : watches) {
            if (watch.getPrice().equals(new BigDecimal(line))) {
                watchesFilteredByPrice.add(watch);
            }
        }
        return watchesFilteredByPrice;
    }

    public List<Watch> getFilteredWatchesByDate(String line, List<Watch> watches) {
        List<Watch> watchesFilteredByDate = new ArrayList();
        for (Watch watch : watches) {
            if (watch.getDate().equals(LocalDate.parse(line))) {
                watchesFilteredByDate.add(watch);
            }
        }
        return watchesFilteredByDate;
    }
}


