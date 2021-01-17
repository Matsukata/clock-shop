package com.shop.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputString() throws IOException {
        String inputLine = reader.readLine();
        return inputLine;
    }
}
