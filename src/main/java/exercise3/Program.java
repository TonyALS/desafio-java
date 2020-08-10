package exercise3;

import exercise3.models.Brand;
import exercise3.models.Car;
import exercise3.models.Owner;
import exercise3.utils.CarFilter;

import java.time.LocalDate;
import java.time.Year;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        Owner tonyAugusto = new Owner("Tony Augusto", LocalDate.of(1994, 3, 29));
        Owner anaMaria = new Owner("Ana Maria", LocalDate.of(1998, 4, 1));
        Owner joaquimTeixeira = new Owner("Joaquim Teixeira", LocalDate.of(2001, 5, 2));
        Owner willSmith = new Owner("Will Smith", LocalDate.of(1980, 6, 3));
        Owner matheusSouza = new Owner("Matheus Souza", LocalDate.of(1999, 7, 7));
        Owner klyffHarlley = new Owner("Klyff Harlley", LocalDate.of(1980, 8, 5));
        Owner haderAnicio = new Owner("Hader Anicio", LocalDate.of(1985, 9, 8));
        Owner viniciusRibeiro = new Owner("Vinicius Ribeiro", LocalDate.of(1981, 10, 15));

        Brand hyundai = new Brand("Hyundai", "001");
        Brand ford = new Brand("Ford", "002");
        Brand toyota = new Brand("Toyota", "003");
        Brand honda = new Brand("Honda", "004");
        Brand volks = new Brand("VolksWagen", "005");

        Car azera = new Car(hyundai, "Azera", Year.of(2015), tonyAugusto, 4);
        Car hb20 = new Car(hyundai, "HB20", Year.of(2016), anaMaria, 4);
        Car hb202 = new Car(hyundai, "HB20", Year.of(2016), tonyAugusto, 4);
        Car civic = new Car(honda, "Civic", Year.of(2020), klyffHarlley, 4);
        Car up = new Car(volks, "Up", Year.of(2019), viniciusRibeiro, 2);
        Car amarok = new Car(volks, "Amarok", Year.of(2016), haderAnicio, 4);
        Car ka = new Car(ford, "Ka", Year.of(2015), matheusSouza, 2);
        Car fiesta = new Car(ford, "Fiesta", Year.of(2010), willSmith, 4);
        Car etios = new Car(toyota, "Etios", Year.of(2015), joaquimTeixeira, 4);
        Car fusion = new Car(ford, "Fusion", Year.of(2020), tonyAugusto, 4);
        Car hilux = new Car(toyota, "Hilux", Year.of(2015), viniciusRibeiro, 4);

        List<Car> cars = Arrays.asList(azera, hb20, civic, up, amarok, ka, fiesta, etios, fusion, hilux, hb202);

        System.out.println("Resultado pesquisa por qualquer letra: " + CarFilter.findCars("K", cars));
        System.out.println("Resultado pesquisa por letra inicial: " + CarFilter.findFirstLetter("H", cars));
        System.out.println("Proprietários nascidos após 1990: " + CarFilter.findCarByOwnerBirth(1990, cars));

        System.out.println("MAP Cars");
        System.out.println(CarFilter.mapCars(cars));
        System.out.println(CarFilter.mapCars(cars).size());

        System.out.println("Agrupamento de carros");
        List<Car> cars1 = Arrays.asList(civic, up);
        List<Car> cars2 = Arrays.asList(etios, hb20);
        Map<String, List<Car>> map = cars.stream()
                .collect(Collectors.groupingBy(car -> car.getBrand().getName()));

        System.out.println(map);

        //  Isso seria a lista de lista?
        // List<List<Car>> listaDeLista = new ArrayList<>();

        // System.out.println(listaDeLista);
    }
}
