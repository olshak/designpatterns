package pl.sda.designpatterns.flyweight;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import pl.sda.designpatterns.flyweight.cars.Audi;
import pl.sda.designpatterns.flyweight.cars.Car;
import pl.sda.designpatterns.flyweight.cars.Mazda;
import pl.sda.designpatterns.flyweight.customizations.CarCustomization;
import pl.sda.designpatterns.flyweight.customizations.Stereo;
import pl.sda.designpatterns.flyweight.customizations.WindowTint;

public class CarIntegrationTest {

    @Test
    public void shouldReturnCorrectPriceForMazdaWithoutCustomizations() {
        //given
        Car mazda = new Mazda();

        //when
        int result = mazda.calculatePrice();

        //then
        Assertions.assertThat(result).isEqualTo(10000);
    }

    @Test
    public void shouldReturnCorrectPriceForMazdaWithCustomizations() {
        //given
        Car mazda = new Mazda();
        CarCustomization windowTint = new WindowTint();
        CarCustomization stereo = new Stereo();
        mazda.addCustomization(windowTint);
        mazda.addCustomization(stereo);

        //when
        int result = mazda.calculatePrice();

        //then
        Assertions.assertThat(result).isEqualTo(10700);
    }

    @Test
    public void shouldReturnCorrectPriceForAudiWithoutCustomizations() {
        //given
        Car audi = new Audi();

        //when
        int result = audi.calculatePrice();

        //then
        Assertions.assertThat(result).isEqualTo(15000);
    }

    @Test
    public void shouldReturnCorrectPriceForAudiWithCustomizations() {
        //given
        Car audi = new Audi();
        CarCustomization windowTint = new WindowTint();
        CarCustomization stereo = new Stereo();
        audi.addCustomization(windowTint);
        audi.addCustomization(stereo);

        //when
        int result = audi.calculatePrice();

        //then
        Assertions.assertThat(result).isEqualTo(15700);
    }
}
