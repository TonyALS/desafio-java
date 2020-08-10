package exercise1.utils;

import java.util.List;
import java.util.stream.Collectors;

//  Implementação da classe GetPrime com While

public class GetPrimeTest {
    public static List listPrime (List<Integer> listOdd) {
        int count = 0;
        while (count < listOdd.size()) {
            for (int j = 3; j < listOdd.size(); j++) {
                if ((listOdd.get(count) != j) && (listOdd.get(count) % j == 0)) {
                    listOdd.set(count, 0);
                    //  listOdd.remove(count);
                }
            }
            count ++;
        }
        listOdd.add(0, 2);
        List<Integer> listPrime = listOdd.stream().filter(n -> n != 0).collect(Collectors.toList());
        return listPrime;
    }
}
