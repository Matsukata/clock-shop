package com.shop.controller;

import com.shop.model.*;
import com.shop.util.Constants;
import com.shop.view.View;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
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
            String string = view.getInputHandler().inputString();
            if (string.equals("0")) {
                break;
            }
            if (string.equals("1")) {
                printWatchList();
                System.out.println();
                view.getMessagePrinter().printMessage(Constants.MAIN_MENU);
            }
            if (string.equals("2")) {
                subMenuForSorting();
                view.getMessagePrinter().printMessage(Constants.MAIN_MENU);
            }
            if (string.equals("3")) {
                view.getMessagePrinter().printMessage(Constants.MENU_FOR_ADDING);
                addWatchSubMenu();
                view.getMessagePrinter().printMessage(Constants.MAIN_MENU);
            }
        }
    }

    public void subMenuForSorting() throws IOException {

        while (true) {
            view.getMessagePrinter().printMessage(Constants.MENU_FOR_SORTING);
            String line = view.getInputHandler().inputString();
            if (line.equals("0")) {
                break;
            } else {
                switch (line) {
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
            view.getMessagePrinter().printMessage(Constants.ENTER_0_TO_EXIT);
        }
    }

    public void addWatchSubMenu() throws IOException {
        while (true) {
            String line = view.getInputHandler().inputString();
            if (line.equals("0")) {
                break;
            } else {
                Watch watch = parseWatchFromString(line);
                if (watch == null) {
                    view.getMessagePrinter().printMessage(Constants.INPUT_DATA_IS_NOT_PARSABLE);
                } else {
                    model.addWatch(watch);
                    view.getMessagePrinter().printMessage(Constants.THE_OPERATION_WAS_SUCCESSFULLY_COMPLETED);
                }
            }
            break;
        }
    }

    public Watch parseWatchFromString(String line) {
        List<String> watchList = new ArrayList<>();
        for (String subLine : line.split(" ")) {
            watchList.add(subLine);
        }
        Watch watch = new Watch(Brand.valueOf(watchList.get(0).toUpperCase()), new BigDecimal(watchList.get(1)),
                CountryOfOrigin.valueOf(watchList.get(2).toUpperCase()), Color.valueOf(watchList.get(3).toUpperCase()),
                Occasion.valueOf(watchList.get(4).toUpperCase()), GlassMaterial.valueOf(watchList.get(5).toUpperCase()),
                Sex.valueOf(watchList.get(6).toUpperCase()), LocalDate.parse(watchList.get(7)));
        return watch;
    }

    public void run() throws IOException {
        menu();
    }
}



