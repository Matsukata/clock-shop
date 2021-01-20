package com.shop.controller;

import com.shop.model.Model;
import com.shop.model.Watch;
import com.shop.view.View;

import java.io.IOException;
import java.util.List;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void printSortedWatchList() {
        List<Watch> watches = model.getWatchList();
        for (Watch watch : watches) {
            view.getMessagePrinter().printMessage(watch.toString());
        }
    }

    public void run() throws IOException {
        view.printMenu();
        view.menu();
    }
   /*
        inputLine = new InputHandler().inputString();

        if (!inputLine.isEmpty()) {
            for (Watch watch : watches) {

                if (watch.getSex().equals(inputLine)) {
                    view.printMessage(watch.toString());
                } else if (watch.getBrand().equals(inputLine)) {
                    view.printMessage(watch.toString());
                } else if (watch.getCountryOfOrigin().equals(inputLine)) {
                    view.printMessage(watch.toString());
                } else if (watch.getOccasion().equals(inputLine)) {
                    view.printMessage(watch.toString());
                } else if (watch.getGlassMaterial().equals(inputLine)) {
                    view.printMessage(watch.toString());
                } else {
                    view.printMessage(Constants.NOTHING_WAS_FOUND);
                }
            }
        }
    }*/
}