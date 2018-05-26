package pl.sda.designpatterns.strategy.flying;

public class RocketEngineFlying implements FlyingStrategy {
    @Override
    public String fly() {
        return "Flying using rocket engine.";
    }
}
