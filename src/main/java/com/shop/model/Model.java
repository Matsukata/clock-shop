package com.shop.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {
    private final List<Watch> watches;

    public Model() {
        this.watches = new ArrayList<>(new DBProvider().getData());
    }

    public void addWatch(Watch watch){
        watches.add(watch);
    }
    public List<Watch> getWatchList() {
        return Collections.unmodifiableList(watches);
    }

}

