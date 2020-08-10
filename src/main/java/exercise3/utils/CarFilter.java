package exercise3.utils;

import exercise3.models.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarFilter {

    public static List<Car> findCars(String model, List<Car> carsList) {
        List<Car> result = carsList.stream()
                .filter(car -> car.getModel().contains(model.toLowerCase()))
                .collect(Collectors.toList());
        return result;
    }

    public static List<Car> findFirstLetter(String letter, List<Car> carsList) {
        String upperCase = letter.toUpperCase();
        char s = upperCase.charAt(0);
        List<Car> result = carsList.stream()
                .filter(car -> car.getModel().indexOf(s) == 0)
                .collect(Collectors.toList());
        return result;
    }

    public static List<Car> findCarByOwnerBirth(int year, List<Car> carsList) {
        List<Car> result = carsList.stream()
                .filter(birthOwner -> birthOwner.getOwner().getDateOfBirth().getYear() > year)
                .collect(Collectors.toList());
        return result;
    }

    public static List<Car> findCarBynumberOfDoors(int numberOfDoors, List<Car> carList) {
        List<Car> result = carList.stream()
                .filter(car -> car.getNumberOfDoors() == numberOfDoors)
                .collect(Collectors.toList());
        return result;
    }

    public static Map<String, Car> mapCars(List<Car> carList) {
        Map<String, Car> mapCars = new HashMap<>();
        carList.forEach(car -> mapCars.put(car.getModel(), car));

        return mapCars;
    }
}
