package com.shop.view;

public class View {
    private InputHandler inputHandler = new InputHandler();
    private MessagePrinter messagePrinter = new MessagePrinter();

    public InputHandler getInputHandler() {
        return inputHandler;
    }

    public MessagePrinter getMessagePrinter() {
        return messagePrinter;
    }
}

