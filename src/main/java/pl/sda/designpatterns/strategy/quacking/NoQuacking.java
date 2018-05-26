package pl.sda.designpatterns.strategy.quacking;

public class NoQuacking implements QuackingStrategy {
    @Override
    public String quack() {
        return "Cannot quack!";
    }
}
