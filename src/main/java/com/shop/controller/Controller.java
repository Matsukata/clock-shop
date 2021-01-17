package com.shop.controller;

import com.shop.model.DBLayer;
import com.shop.model.Watches;
import com.shop.view.WatchesOutput;

import java.io.IOException;

public class Controller {
    Model modelLayer = new DBLayer();
    View view = new WatchesOutput();
    public void execute() throws IOException {
        Watches watches = modelLayer.getWatches();
        view.showWatches(watches);
    }
    //It seems more like a controller
    public void showWatches(Watches watches, inputLine) {
        System.out.println("Введите один из параметров для сортировки. Мужские/женские. Япония/Германия/Италия. ");

            if (inputLine.isEmpty()) {
                break;
            } else {

                if (watches.getSex().equals(inputLine)) {
                    printMessage(watches);
                }
                if (watches.getSex().equals(line)) {
                    System.out.println(watches);
                }
                if (watches.getBrand().equals(line)) {
                    System.out.println(watches);
                }
                if (watches.getCountryProducer().equals(line)) {
                    System.out.println(watches);
                }
                if (watches.getStyle().equals(line)) {
                    System.out.println(watches);
                }
                if (watches.getMaterialCorp().equals(line)) {
                    System.out.println(watches);
                }
            }