package com.shop.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String inputLine;

    public String inputString() throws IOException {
        {
            try {
                inputLine = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return inputLine;
    }
}
