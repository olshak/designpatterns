package pl.sda.designpatterns.strategy.ducks;

import org.junit.Assert;
import org.junit.Test;

public class RocketDuckTest {
    private RocketDuck rocketDuck = new RocketDuck();

    @Test
    public void shouldQuackWhenPerformQuackCalled() {
        Assert.assertEquals("Quack quack!", rocketDuck.performQuack());
    }

    @Test
    public void shouldFlyWithWingsWhenPerformFlightCalled() {
        Assert.assertEquals("Flying using rocket engine.", rocketDuck.performFlight());
    }
}
