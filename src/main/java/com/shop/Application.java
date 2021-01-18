package com.shop;

import com.shop.controller.Controller;
import com.shop.model.Model;
import com.shop.view.InputHandler;
import com.shop.view.View;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.run(model.db(), new InputHandler().inputString());
    }
}
