package pl.sda.designpatterns.strategy.ducks;

import pl.sda.designpatterns.strategy.flying.RocketEngineFlying;
import pl.sda.designpatterns.strategy.quacking.NormalQuacking;

public class RocketDuck extends Duck {
    public RocketDuck() {
        this.quackingStrategy = new NormalQuacking();
        this.flyingStrategy = new RocketEngineFlying();
    }
}
