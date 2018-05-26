package pl.sda.designpatterns.strategy.ducks;

import pl.sda.designpatterns.strategy.flying.NoFlying;
import pl.sda.designpatterns.strategy.quacking.NoQuacking;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.quackingStrategy = new NoQuacking();
        this.flyingStrategy = new NoFlying();
    }
}
