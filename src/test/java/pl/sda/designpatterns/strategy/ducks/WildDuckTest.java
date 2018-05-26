package pl.sda.designpatterns.strategy.ducks;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.designpatterns.strategy.flying.NoFlying;
import pl.sda.designpatterns.strategy.flying.WingedFlying;
import pl.sda.designpatterns.strategy.quacking.NoQuacking;
import pl.sda.designpatterns.strategy.quacking.NormalQuacking;

public class WildDuckTest {
    private AdjustibleDuck adjustibleDuck;

    @Test
    public void shouldQuackAndFlyWhenReceivedQuackingStrategyAndFlying() {
        adjustibleDuck = new AdjustibleDuck(new NormalQuacking(), new WingedFlying());
        Assert.assertEquals("Quack quack!", adjustibleDuck.performQuack());
        Assert.assertEquals("Flying using wings.", adjustibleDuck.performFlight());
    }

    @Test
    public void shouldBeAdjustible() {
        adjustibleDuck = new AdjustibleDuck(new NormalQuacking(), new WingedFlying());
        Assert.assertEquals("Quack quack!", adjustibleDuck.performQuack());
        Assert.assertEquals("Flying using wings.", adjustibleDuck.performFlight());

        adjustibleDuck.setFlyingStrategy(new NoFlying());
        adjustibleDuck.setQuackingStrategy(new NoQuacking());
        Assert.assertEquals("Cannot quack!", adjustibleDuck.performQuack());
        Assert.assertEquals("Cannot fly.", adjustibleDuck.performFlight());
    }
}
