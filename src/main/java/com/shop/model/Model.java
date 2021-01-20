package com.shop.model;

import java.util.Collections;
import java.util.List;

public class Model {
    private final List<Watch> watches = new DBProvider().getData();

    public List<Watch> getWatchList() {
        return Collections.unmodifiableList(watches);
    }
}

