package exercise3.test;

import exercise3.models.Brand;
import exercise3.models.Car;
import exercise3.models.Owner;
import exercise3.utils.CarFilter;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Year;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CarFilterTest {
    Owner tonyAugusto = new Owner("Tony Augusto", LocalDate.of(1994, 3, 29));
    Owner anaMaria = new Owner("Ana Maria", LocalDate.of(1998, 4, 1));
    Owner joaquimTeixeira = new Owner("Joaquim Teixeira", LocalDate.of(2001, 5, 2));
    Owner viniciusRibeiro = new Owner("Vinicius Ribeiro", LocalDate.of(1981, 10, 15));

    Brand hyundai = new Brand("Hyundai", "001");
    Brand ford = new Brand("Ford", "002");
    Brand toyota = new Brand("Toyota", "003");

    Car hb20 = new Car(hyundai, "HB20", Year.of(2016), anaMaria, 2);
    Car etios = new Car(toyota, "Etios", Year.of(2015), joaquimTeixeira, 2);
    Car fusion = new Car(ford, "Fusion", Year.of(2020), tonyAugusto, 4);
    Car hilux = new Car(toyota, "Hilux", Year.of(2015), viniciusRibeiro, 4);

    @Test
    public void findCarTest() {
        //  Seria possível (ou necessário) verificar se o retorno de findCars se mantém como sendo lista?
        List<Car> cars = Arrays.asList(hb20, etios, fusion, hilux);
        List<Car> result = CarFilter.findCars("i", cars);
        Assert.assertEquals(result.get(0).getModel(), "Etios");
        Assert.assertEquals(result.get(1).getModel(), "Fusion");
        Assert.assertEquals(result.get(2).getModel(), "Hilux");
    }

    @Test
    public void findFirstLetterTest() {
        List<Car> cars = Arrays.asList(hb20, etios, fusion, hilux);
        List<Car> result = CarFilter.findFirstLetter("f", cars);
        Assert.assertEquals(result.get(0).getModel(), "Fusion");
    }

    @Test
    public void findCarByOwnerBirthTest() {
        List<Car> cars = Arrays.asList(hb20, etios, fusion, hilux);

        List<Car> result = CarFilter.findCarByOwnerBirth(2000, cars);
        Assert.assertEquals(result.size(), 1);

        List<Car> noResult = CarFilter.findCarByOwnerBirth(2015, cars);
        Assert.assertEquals(noResult.size(), 0);
    }

    @Test
    public void findCarBynumberOfDoors() {
        List<Car> cars = Arrays.asList(hb20, etios, fusion, hilux);
        List<Car> result = CarFilter.findCarBynumberOfDoors(2, cars);
        Assert.assertEquals(result.size(), 2);

        List<Car> noResult = CarFilter.findCarBynumberOfDoors(3, cars);
        Assert.assertEquals(noResult.size(), 0);
    }

    @Test
    public void mapCarsTest() {
        List<Car> cars = Arrays.asList(hb20, etios, fusion, hilux);
        Map<String, Car> result = CarFilter.mapCars(cars);
        Assert.assertEquals(result.size(), 4);
        Assert.assertEquals(result.get("HB20"), cars.get(0));
    }
}
