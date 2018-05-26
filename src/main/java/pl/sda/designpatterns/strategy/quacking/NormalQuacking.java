package pl.sda.designpatterns.strategy.quacking;

public class NormalQuacking implements QuackingStrategy {
    @Override
    public String quack() {
        return "Quack quack!";
    }
}
