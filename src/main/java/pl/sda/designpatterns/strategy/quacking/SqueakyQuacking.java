package pl.sda.designpatterns.strategy.quacking;

public class SqueakyQuacking implements QuackingStrategy {
    @Override
    public String quack() {
        return "Squeak squeak!";
    }
}
