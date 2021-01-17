package com.shop;

import com.shop.controller.Controller;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        controller.execute();
    }
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);

  controller.run();//Должно быть так в итоге

}
