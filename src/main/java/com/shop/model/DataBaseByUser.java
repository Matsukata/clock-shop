package com.shop.model;

import com.shop.view.View;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataBaseByUser {
    private View view = new View();
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<Watch> watchesAddedByUser = new ArrayList<>();

    public List<Watch> getDataBaseByUser() throws IOException {
        if ((view.getInputHandler().inputString() != null)) {
            for (String subLine : view.getInputHandler().inputString().split(" ")) {
                list.add(subLine);
            }
        }
        watchesAddedByUser.add(new Watch(list.get(0), new BigDecimal(list.get(1)), list.get(2), list.get(3),
                list.get(4), list.get(5), list.get(6), LocalDate.parse(list.get(7))));
        return watchesAddedByUser;
    }
}

