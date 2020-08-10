package exercise3.test;

import exercise3.models.Address;
import exercise3.models.Car;
import exercise3.models.Owner;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    //  Verificar como melhorar essa abordagem de instanciação. Transformar os métodos
    //  da classe testada em static?
    Address address = new Address("street", "neighborhood", "city", "state", "zipcode");
    Owner owner = new Owner("Any", "000", "000", address);

    @Test
    public void speedUpTest() {
        Car car = new Car(owner);
        car.setCurrentSpeed(10);
        car.setMaximumSpeed(10);
        boolean speedUp = car.speedUp();
        Assert.assertFalse(speedUp);
        Assert.assertEquals(10, car.getCurrentSpeed(), 0);

        car.setCurrentSpeed(10);
        car.setMaximumSpeed(11);
        speedUp = car.speedUp();
        Assert.assertTrue(speedUp);
        Assert.assertEquals(11, car.getCurrentSpeed(), 0);
    }

    @Test
    public void brakeTest() {
        Car car = new Car(owner);
        car.setCurrentSpeed(10);
        car.brake();
        Assert.assertEquals(0, car.getCurrentSpeed(), 0);
    }

    @Test
    public void changeGearTest() {
        Car car = new Car(owner);
        car.setCurrentGear(2);
        Assert.assertEquals(2, car.getCurrentGear());
    }

    @Test
    public void downshift() {
        Car car = new Car(owner);
        car.setCurrentGear(4);
        car.downshift();
        Assert.assertEquals(3, car.getCurrentGear());
        car.setCurrentGear(0);
        car.downshift();
        Assert.assertEquals(0, car.getCurrentGear());
    }

    @Test
    public void reverseGearTest() {
        Car car = new Car(owner);
        car.setCurrentSpeed(0);
        car.setCurrentGear(2);
        boolean reverse = car.reverseGear();
        Assert.assertEquals(-1, car.getCurrentGear());
        Assert.assertTrue(reverse);

        car.setCurrentSpeed(1);
        car.setCurrentGear(3);
        reverse = car.reverseGear();
        Assert.assertEquals(3, car.getCurrentGear());
        Assert.assertFalse(reverse);
    }

    @Test
    public void autonomyTest() {
        Car car = new Car(owner);
        car.setFuelVolume(50);
        double autonomy = car.autonomy(10);
        Assert.assertEquals(500, autonomy, 0);
    }
}
