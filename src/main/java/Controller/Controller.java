package Controller;

import Model.DBLayer;
import Model.ModelLayer;
import Model.Watches;
import View.View;
import View.WatchesOutput;


import java.io.IOException;

public class Controller {
    ModelLayer modelLayer = new DBLayer();
    View view = new WatchesOutput();
    void execute() throws IOException {
        Watches watches = modelLayer.getWatches();
        view.showWatches(watches);
    }
}
