package com.shop.view;

import com.shop.controller.Controller;
import com.shop.model.Model;

import java.io.IOException;

public class View {
    private InputHandler inputHandler;
    private MessagePrinter messagePrinter;
    private Controller controller;
    private Model model;

    public InputHandler getInputHandler() {
        return inputHandler;
    }

    public MessagePrinter getMessagePrinter() {
        return messagePrinter;
    }

    public MessagePrinter messagePrinter() {
        return new MessagePrinter();
    }

    public void printMenu() throws IOException {
        System.out.println("Welcome to ClockShop");
        System.out.println("Menu");
        System.out.println("Please, enter \"1\" to watch our collection");
        System.out.println("Please, enter \"0\" to exit");
    }

    public void menu() throws IOException {
        inputHandler = new InputHandler();
        model = new Model();
        controller = new Controller(model, this);
        while (true) {
            if (inputHandler.inputString().equals("1")) {
                controller.printSortedWatchList();
                System.out.println();
                printMenu();
            }
            if (inputHandler.inputString().equals("0")) {
                break;
            }
        }
    }
}

