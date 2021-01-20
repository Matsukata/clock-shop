package com.shop.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String inputString() throws IOException {
        return reader.readLine();
    }
}
