package com.shop.controller;

import com.shop.model.CustomComparator;
import com.shop.model.Model;
import com.shop.model.Watch;
import com.shop.util.Constants;
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

    public void printWatchList() {
        List<Watch> watches = model.getWatchList();
        for (Watch watch : watches) {
            view.getMessagePrinter().printMessage(watch.toString());
        }
    }

    public void menu() throws IOException {
        view.getMessagePrinter().printMessage(Constants.WELCOME);
        view.getMessagePrinter().printMessage(Constants.MAIN_MENU);
        while (true) {
            switch (view.getInputHandler().inputString()) {
                case ("1"):
                    printWatchList();
                    System.out.println();
                    view.getMessagePrinter().printMessage(Constants.MAIN_MENU);
                    break;
                case ("2"):
                    subMenu();
                    view.getMessagePrinter().printMessage(Constants.MAIN_MENU);
                    break;
                case ("0"):
                    break;
            }
        }
    }

    public void subMenu() throws IOException {
        view.getMessagePrinter().printMessage(Constants.MENU_FOR_SORTING);
        switch (view.getInputHandler().inputString()) {
            case ("color"):
                view.getMessagePrinter().printMessage(Constants.COLOR_MENU);
                List<Watch> watchesByColor = new CustomComparator().getFilteredWatchesByColor(view.getInputHandler().inputString(), model.getWatchList());
                watchesByColor.stream();
                watchesByColor.forEach(watch -> view.getMessagePrinter().printMessage(watch.toString()));
                System.out.println();
                break;
            case ("price"):
                view.getMessagePrinter().printMessage(Constants.PRICE_MENU);
                List<Watch> watchesByPrice = new CustomComparator().getFilteredWatchesByPrice(view.getInputHandler().inputString(), model.getWatchList());
                watchesByPrice.stream();
                watchesByPrice.forEach(watch -> view.getMessagePrinter().printMessage(watch.toString()));
                System.out.println();
                break;
            case ("date"):
                view.getMessagePrinter().printMessage(Constants.DATE_FORMAT_MENU);
                List<Watch> watchesSortedByDate = new CustomComparator().getFilteredWatchesByDate(view.getInputHandler().inputString(), model.getWatchList());
                watchesSortedByDate.stream();
                watchesSortedByDate.forEach(watch -> view.getMessagePrinter().printMessage(watch.toString()));
                System.out.println();
                break;
            default:
                view.getMessagePrinter().printMessage(Constants.NOTHING_WAS_FOUND);
        }
    }

    public void run() throws IOException {
        menu();
    }
}