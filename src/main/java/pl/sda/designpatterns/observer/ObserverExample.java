package pl.sda.designpatterns.observer;

import java.util.Observer;

public class ObserverExample {

    public static void main(String[] args) {
        AccidentDispatcher accidentDispatcher = new AccidentDispatcher();
        Observer ambulance = new Ambulance();
        Observer statistician = new Statistician();
        Observer agentAbw = new AgentAbw();

        accidentDispatcher.addObserver(ambulance);
        accidentDispatcher.addObserver(statistician);
        accidentDispatcher.addObserver(agentAbw);

        System.out.println("First accident (three observers):");
        accidentDispatcher.setAccidentType("Intersection accident.");
        accidentDispatcher.notifyObservers();
        System.out.println("\nSecond accident (three observers):");
        accidentDispatcher.setAccidentType("Woman hit by a car.");
        accidentDispatcher.notifyObservers();

        ((Statistician) statistician).printAllStats();

        accidentDispatcher.deleteObserver(statistician);
        accidentDispatcher.deleteObserver(agentAbw);
        accidentDispatcher.setAccidentType("Truck hit a tree.");
        System.out.println("\nThird accident (statistician and agentAbw removed):");
        accidentDispatcher.notifyObservers();
    }
}
