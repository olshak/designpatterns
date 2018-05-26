package pl.sda.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Statistician implements Observer {
    private List<String> accidentStatistics = new ArrayList<>();

    public void update(Observable o, Object arg) {
        accidentStatistics.add((String) arg);
        System.out.println("Adding to statistics: " + arg);
    }

    public void printAllStats() {
        System.out.println("\nPrinting statistics:");
        accidentStatistics.forEach(System.out::println);
    }
}
