package pl.sda.designpatterns.observer;

import java.util.Observable;

public class AccidentDispatcher extends Observable {
    private String accidentType;

    public void setAccidentType(String accidentType) {
        this.accidentType = accidentType;
        setChanged();
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(accidentType);
    }
}
