package pl.sda.designpatterns.strategy.ducks;

import pl.sda.designpatterns.strategy.flying.FlyingStrategy;
import pl.sda.designpatterns.strategy.quacking.QuackingStrategy;

public class AdjustibleDuck extends Duck {
    public AdjustibleDuck(QuackingStrategy quackingStrategy, FlyingStrategy flyingStrategy) {
        this.quackingStrategy = quackingStrategy;
        this.flyingStrategy = flyingStrategy;
    }

    public void setQuackingStrategy(QuackingStrategy quackingStrategy) {
        this.quackingStrategy = quackingStrategy;
    }

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }
}
