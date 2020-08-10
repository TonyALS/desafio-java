package exercise1.utils;

import java.util.ArrayList;
import java.util.List;

public class Odd {

    public static List listOdd (int count) {
        List<Integer> list = new ArrayList<>();
        //  Crio uma lista contendo somente números ímpares (pares são divisíveis por 2, logo
        //  não são primos) dessa forma reduzo o tamanho da lista em aprox 50%:
        int i = 3;
        while (i <= count) {
            if (i % 2 != 0) {
                list.add(i);
            }
            i++;
        }
        return list;
    }
}
