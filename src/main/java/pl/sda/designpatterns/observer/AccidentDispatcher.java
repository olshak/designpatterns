package pl.sda.designpatterns.observer;

import java.util.Observable;

public class AccidentDispatcher extends Observable {
    private String accidentType;

    public void accidentHappened(String accidentType) {
        this.accidentType = accidentType;
        setChanged();
        notifyObservers(accidentType);
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(accidentType);
    }
}
