package exercise1.utils;

import java.util.List;
import java.util.stream.Collectors;

public class GetPrime {

    //  Obter todos os números primos de 0 à 1000. Implementação de algoritmo usando a teoria do
    //  Crivo de Eratóstenes:
    public static List listPrime (List<Integer> listOdd) {
        //  O único número par que tbem é primo é 2. Adiciono manualmente à lista:
        listOdd.add(0, 2);

        //  O primeiro laço serve para obter um número da lista pelo índice:
        for (int i = 0; i < listOdd.size(); i++) {
            //  O segundo é a iteração dos números:
            for (int j = 3; j < listOdd.size(); j++) {
                //  1º Verificar se um número não é ele mesmo;
                //  2º Validar se tal número dividido por algum dos demais dá resto 0, se
                //  sim trata-se de um múltiplo do próprio número, portanto não é primo. Dessa
                //  forma gradativamente são identificados todos os números não-primos.
                if ((listOdd.get(i) != j) && (listOdd.get(i) % j == 0)) {
                    //  Se eu remover o item terei erro pois a lista dimuirá mais rápido que o count.
                    //  Verificar com os sêniores alternativas:
                    //  list.remove(i);

                    //  Substituo os números primos por 0 para conseguir filtrar depois (melhorar isso):
                    listOdd.set(i, 0);
                }
            }
        }

        //  Faço um filtro removendo todos os zeros, o que restar são os primos:
        List<Integer> listPrime = listOdd.stream().filter(n -> n != 0).collect(Collectors.toList());
        return listPrime;
    }
}
