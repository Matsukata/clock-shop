package com.shop.view;

import java.io.IOException;

public class View {
    private final InputHandler inputHandler = new InputHandler();
    private final MessagePrinter messagePrinter = new MessagePrinter();

    public InputHandler getInputHandler() {
        return inputHandler;
    }

    public MessagePrinter getMessagePrinter() {
        return messagePrinter;
    }

    public String inputString() throws IOException {
        return inputHandler.inputString();
    }

    public void printMessage(String message) {
        messagePrinter.printMessage(message);
    }
}

