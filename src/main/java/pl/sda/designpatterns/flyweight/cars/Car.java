package pl.sda.designpatterns.flyweight.cars;

import pl.sda.designpatterns.flyweight.customizations.CarCustomization;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    private int price;
    private List<CarCustomization> carCustomizationList = new ArrayList<>();

    public Car(int price) {
        this.price = price;
    }

    public void addCustomization(CarCustomization carCustomization) {
        carCustomizationList.add(carCustomization);
    }

    public int calculatePrice() {
        return price + carCustomizationList.stream()
                .mapToInt(CarCustomization::getPrice)
                .sum();
    }
}
