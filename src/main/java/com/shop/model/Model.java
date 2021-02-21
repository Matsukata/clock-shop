package com.shop.model;

import com.shop.model.comparator.Comparators;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private final List<Watch> watches;

    public Model() {
        this.watches = new ArrayList<>(new DBProvider().getData());
    }

    public List<Watch> getWatchList() {
        return Collections.unmodifiableList(watches);
    }

    public List<Watch> getFilteredWatchesByColor(Color color, List<Watch> watches) {
        return watches.stream()
                .filter(watch -> watch.getColor().equals(color))
                .collect(Collectors.toList());
    }

    public List<Watch> getFilteredWatchesByPrice(BigDecimal price, List<Watch> watches) {
        return watches.stream()
                .filter(watch -> watch.getPrice().compareTo(price) <= 0)
                .collect(Collectors.toList());
    }

    public List<Watch> getFilteredWatchesByDate(LocalDate date, List<Watch> watches) {
        return watches.stream()
                .filter(watch -> watch.getDate().isAfter(date))
                .collect(Collectors.toList());
    }

    public void addWatch(Watch watch) {
        watches.add(watch);
    }

    public List<Watch> getSortedByColor() {
        return sortWatches(Comparators.byColorComparator);
    }

    public List<Watch> getSortedByDate() {
        return sortWatches(Comparators.byDateComparator);
    }

    public List<Watch> getSortedByGlassMaterial() {
        return sortWatches(Comparators.byGlassMaterialComparator);
    }

    public List<Watch> getSortedByOccasion() {
        return sortWatches(Comparators.byOccasionComparator);
    }

    public List<Watch> getSortedByOriginCountry() {
        return sortWatches(Comparators.byOriginCountryComparator);
    }

    public List<Watch> getSortedByPrice() {
        return sortWatches(Comparators.byPriceComparator);
    }

    public List<Watch> getSortedBySex() {
        return sortWatches(Comparators.bySexComparator);
    }

    private List<Watch> sortWatches(Comparator<Watch> comparator) {
        return watches.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
