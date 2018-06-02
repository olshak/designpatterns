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
        accidentDispatcher.accidentHappened("Intersection accident.");
        System.out.println("\nSecond accident (three observers):");
        accidentDispatcher.accidentHappened("Woman hit by a car.");

        ((Statistician) statistician).printAllStats();

        accidentDispatcher.deleteObserver(statistician);
        accidentDispatcher.deleteObserver(agentAbw);
        System.out.println("\nThird accident (statistician and agentAbw removed):");
        accidentDispatcher.accidentHappened("Truck hit a tree.");
    }
}
