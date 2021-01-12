package View;

import Model.Watches;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WatchesOutput implements View{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


    public void showWatches(Watches watches) {
        System.out.println("Введите один из параметров для сортировки. Мужские/женские. Япония/Германия/Италия. ");
        while (true) {
            String line = null;
            try {
                line = bf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line.isEmpty()) {
                break;
            } else {

                if (watches.getSex().equals(line)) {
                    System.out.println(watches);
                }
                if (watches.getBrand().equals(line)) {
                    System.out.println(watches);
                }
                if (watches.getCountryProducer().equals(line)) {
                    System.out.println(watches);
                }
                if (watches.getStyle().equals(line)) {
                    System.out.println(watches);
                }
                if (watches.getMaterialCorp().equals(line)) {
                    System.out.println(watches);
                }
            }
        }
    }
}
