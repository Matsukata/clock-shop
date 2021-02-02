package com.shop.controller;

import com.shop.model.Brand;
import com.shop.model.Color;
import com.shop.model.CountryOfOrigin;
import com.shop.model.GlassMaterial;
import com.shop.model.Model;
import com.shop.model.Occasion;
import com.shop.model.Sex;
import com.shop.model.Watch;
import com.shop.view.View;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static com.shop.util.Constants.ADD_ANOTHER_OBJECT;
import static com.shop.util.Constants.ADD_COMMAND;
import static com.shop.util.Constants.CHOOSE_ANOTHER_CRITERIA;
import static com.shop.util.Constants.COLLECTION_COMMAND;
import static com.shop.util.Constants.COLOR_MENU;
import static com.shop.util.Constants.DATE_FORMAT_MENU;
import static com.shop.util.Constants.EMPTY_LINE;
import static com.shop.util.Constants.ENTER_ZERO_TO_EXIT;
import static com.shop.util.Constants.EXIT_COMMAND;
import static com.shop.util.Constants.INPUT_DATA_IS_NOT_PARSABLE;
import static com.shop.util.Constants.MAIN_MENU;
import static com.shop.util.Constants.MENU_FOR_ADDING;
import static com.shop.util.Constants.MENU_FOR_SORTING;
import static com.shop.util.Constants.NOTHING_WAS_FOUND;
import static com.shop.util.Constants.OPERATION_SUCCESSFULLY_COMPLETED;
import static com.shop.util.Constants.PRICE_MENU;
import static com.shop.util.Constants.SHOW_TOTAL_SUM;
import static com.shop.util.Constants.SORT_COMMAND;
import static com.shop.util.Constants.TOTAL_SUM_COMMAND;
import static com.shop.util.Constants.USD;
import static com.shop.util.Constants.WELCOME;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() throws IOException {
        showMenu();
    }

    private void showMenu() throws IOException {
        view.printMessage(WELCOME);
        view.printMessage(MAIN_MENU);
        while (true) {
            String string = view.inputString();
            if (string.equalsIgnoreCase(EXIT_COMMAND)) {
                break;
            }
            if (string.equalsIgnoreCase(COLLECTION_COMMAND)) {
                printWatchList();
                view.printMessage(EMPTY_LINE + MAIN_MENU);
            }
            if (string.equalsIgnoreCase(SORT_COMMAND)) {
                showSubMenuForSorting();
                view.printMessage(MAIN_MENU);
            }
            if (string.equalsIgnoreCase(ADD_COMMAND)) {
                view.printMessage(MENU_FOR_ADDING);
                showAddWatchSubMenu();
                view.printMessage(MAIN_MENU);
            }
            if (string.equalsIgnoreCase(TOTAL_SUM_COMMAND)) {
                String totalSum = showTotalSum(model.getWatchList());
                view.printMessage(SHOW_TOTAL_SUM + totalSum + USD);
                view.printMessage(MAIN_MENU);
            }
        }
    }

    private void showSubMenuForSorting() throws IOException {
        while (true) {
            view.printMessage(MENU_FOR_SORTING);
            String line = view.inputString();
            if (line.equalsIgnoreCase(EXIT_COMMAND)) {
                break;
            } else {
                switch (line) {
                    case ("color"):
                        view.printMessage(COLOR_MENU);
                        String inputLineForColor = view.inputString();
                        List<Watch> watchesByColor = model.getFilteredWatchesByColor
                                (inputLineForColor, model.getWatchList());
                        printWatchList(watchesByColor);
                        break;
                    case ("price"):
                        view.printMessage(PRICE_MENU);
                        String inputLineForPrice = view.inputString();
                        List<Watch> watchesByPrice = model.getFilteredWatchesByPrice
                                (inputLineForPrice, model.getWatchList());
                        printWatchList(watchesByPrice);
                        break;
                    case ("date"):
                        view.printMessage(DATE_FORMAT_MENU);
                        String inputLineForDate = view.inputString();
                        List<Watch> watchesSortedByDate = model.getFilteredWatchesByDate
                                (inputLineForDate, model.getWatchList());
                        printWatchList(watchesSortedByDate);
                        break;
                    default:
                        view.printMessage(NOTHING_WAS_FOUND);
                }
            }
            view.printMessage(EMPTY_LINE + ENTER_ZERO_TO_EXIT + CHOOSE_ANOTHER_CRITERIA);
        }
    }

    private void printWatchList() {
        printWatchList(model.getWatchList());
    }

    private void printWatchList(List<Watch> watches) {
        for (Watch watch : watches) {
            view.printMessage(watch.toString());
        }
    }

    private void showAddWatchSubMenu() throws IOException {
        String line;
        while (!(line = view.inputString()).equalsIgnoreCase(EXIT_COMMAND)) {
            Watch watch = parseWatchFromString(line);
            if (watch == null) {
                view.printMessage(INPUT_DATA_IS_NOT_PARSABLE);
            } else {
                model.addWatch(watch);
                view.printMessage(OPERATION_SUCCESSFULLY_COMPLETED);
                view.printMessage(ENTER_ZERO_TO_EXIT + ADD_ANOTHER_OBJECT);
            }
        }
    }

    private Watch parseWatchFromString(String line) {
        String[] attributes = line.split(" ");
        Watch watch = new Watch(Brand.valueOf(attributes[0].toUpperCase()),
                attributes[1],
                new BigDecimal(attributes[2]),
                CountryOfOrigin.valueOf(attributes[3].toUpperCase()),
                Color.valueOf(attributes[4].toUpperCase()),
                Occasion.valueOf(attributes[5].toUpperCase()),
                GlassMaterial.valueOf(attributes[6].toUpperCase()),
                Sex.valueOf(attributes[7].toUpperCase()),
                LocalDate.parse(attributes[8]));
        return watch;
    }

    private String showTotalSum(List<Watch> watches) {
        BigDecimal totalSum = new BigDecimal(0.00);
        for (Watch watch : watches) {
            totalSum = totalSum.add(watch.getPrice());
        }
        return totalSum.setScale(2, BigDecimal.ROUND_HALF_UP).toString();
    }
}








