package com.shop.controller;

import com.shop.model.Brand;
import com.shop.model.Color;
import com.shop.model.CountryOfOrigin;
import com.shop.model.GlassMaterial;
import com.shop.model.Model;
import com.shop.model.Occasion;
import com.shop.model.Sex;
import com.shop.model.Watch;
import com.shop.util.Constants;
import com.shop.view.View;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static com.shop.util.Constants.EMPTY_LINE;
import static com.shop.util.Constants.MAIN_MENU;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() throws IOException {
        menu();
    }

    private void menu() throws IOException {
        view.printMessage(Constants.WELCOME);
        view.printMessage(MAIN_MENU);
        while (true) {
            String string = view.inputString();
            if (string.equals(Constants.EXIT_COMMAND)) {
                break;
            }
            if (string.equals(Constants.PRINT_COLLECTION__COMMAND)) {
                printWatchList();
                view.printMessage(EMPTY_LINE + MAIN_MENU);
            }
            if (string.equals(Constants.SORT_COMMAND)) {
                subMenuForSorting();
                view.printMessage(MAIN_MENU);
            }
            if (string.equals(Constants.ADD_COMMAND)) {
                view.printMessage(Constants.MENU_FOR_ADDING);
                addWatchSubMenu();
                view.printMessage(MAIN_MENU);
            }
        }
    }

    private void printWatchList() {
        List<Watch> watches = model.getWatchList();
        for (Watch watch : watches) {
            view.printMessage(watch.toString());
        }
    }

    private void subMenuForSorting() throws IOException {
        while (true) {
            view.printMessage(Constants.MENU_FOR_SORTING);
            String line = view.inputString();
            if (line.equals(Constants.EXIT_COMMAND)) {
                break;
            } else {
                switch (line) {
                    case ("color"):
                        view.printMessage(Constants.COLOR_MENU);
                        String inputLineForColor = view.inputString();
                        List<Watch> watchesByColor = model.getFilteredWatchesByColor(inputLineForColor, model.getWatchList());
                        watchesByColor.forEach(watch -> view.printMessage(watch.toString()));
                        break;
                    case ("price"):
                        view.printMessage(Constants.PRICE_MENU);
                        String inputLineForPrice = view.inputString();
                        List<Watch> watchesByPrice = model.getFilteredWatchesByPrice(inputLineForPrice, model.getWatchList());
                        watchesByPrice.forEach(watch -> view.printMessage(watch.toString()));
                        break;
                    case ("date"):
                        view.printMessage(Constants.DATE_FORMAT_MENU);
                        String inputLineForDate = view.inputString();
                        List<Watch> watchesSortedByDate = model.getFilteredWatchesByDate(inputLineForDate, model.getWatchList());
                        watchesSortedByDate.forEach(watch -> view.printMessage(watch.toString()));
                        break;
                    default:
                        view.printMessage(Constants.NOTHING_WAS_FOUND);
                }
            }
            view.printMessage(EMPTY_LINE + Constants.ENTER_ZERO_TO_EXIT);
        }
    }

    private void addWatchSubMenu() throws IOException {
        while (true) {
            String line = view.inputString();
            if (line.equals(Constants.EXIT_COMMAND)) {
                break;
            } else {
                Watch watch = parseWatchFromString(line);
                if (watch == null) {
                    view.printMessage(Constants.INPUT_DATA_IS_NOT_PARSABLE);
                } else {
                    model.addWatch(watch);
                    view.printMessage(Constants.THE_OPERATION_WAS_SUCCESSFULLY_COMPLETED);
                }
            }
            break;
        }
    }

    private Watch parseWatchFromString(String line) {
        String[] attributes = line.split(" ");
        Watch watch = new Watch(Brand.valueOf(attributes[0].toUpperCase()),
                attributes[1],
                new BigDecimal(attributes[1]),
                CountryOfOrigin.valueOf(attributes[2].toUpperCase()),
                Color.valueOf(attributes[3].toUpperCase()),
                Occasion.valueOf(attributes[4].toUpperCase()),
                GlassMaterial.valueOf(attributes[5].toUpperCase()),
                Sex.valueOf(attributes[6].toUpperCase()),
                LocalDate.parse(attributes[7]));
        return watch;
    }
}



