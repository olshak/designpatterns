package pl.sda.designpatterns.strategy.ducks;

import pl.sda.designpatterns.strategy.flying.NoFlying;
import pl.sda.designpatterns.strategy.quacking.SqueakyQuacking;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.quackingStrategy = new SqueakyQuacking();
        this.flyingStrategy = new NoFlying();
    }
}
