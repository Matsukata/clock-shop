package Model;

import java.util.ArrayList;

public class DBLayer implements ModelLayer {
    ArrayList<Watches> list = new ArrayList<Watches>();

    public void db() {

        list.add(new Watches("Casio", 34990.00, "Япония",
                "спортивные", "минеральное", "мужские"));
        list.add(new Watches("Orient", 22000.00, "Япония",
                "классические", "сапфировое", "женские"));
        list.add(new Watches("Boccia", 13000.00, "Германия",
                "классические", "минеральное", "мужские"));
        list.add(new Watches("Diesel", 26000.00, "Италия",
                "спортивные", "минеральное", "мужские"));
        list.add(new Watches("Casio", 45000.00, "Япония",
                "спортивные", "минеральное", "мужские"));

    }


    public Watches getWatches() {
        db();
        Watches watches = null;
        for (int i = 0; i < list.size(); i++) {
            watches = list.get(i);
            return watches;
        }
        return watches;
    }

}
