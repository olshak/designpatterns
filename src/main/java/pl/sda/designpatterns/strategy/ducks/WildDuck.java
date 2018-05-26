package pl.sda.designpatterns.strategy.ducks;

import pl.sda.designpatterns.strategy.flying.WingedFlying;
import pl.sda.designpatterns.strategy.quacking.NormalQuacking;

public class WildDuck extends Duck {
    public WildDuck() {
        this.quackingStrategy = new NormalQuacking();
        this.flyingStrategy = new WingedFlying();
    }
}
