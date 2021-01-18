package com.shop.controller;

import com.shop.model.Model;
import com.shop.model.Watches;
import com.shop.util.Constants;
import com.shop.view.InputHandler;
import com.shop.view.View;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run(ArrayList<Watches> watches, String inputLine) throws IOException {
        inputLine = new InputHandler().inputString();

        if (!inputLine.isEmpty()) {
            for (Watches watch : watches) {

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
    }
}