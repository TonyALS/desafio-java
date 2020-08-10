package exercise1;

import exercise1.utils.GetPrimeTest;
import exercise1.utils.Odd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Obter todos os números primos até: ");
        int count = sc.nextInt();
        List<Integer> listOdd = new ArrayList<>(Odd.listOdd(count));
        System.out.println("Lista de números primos: \n" + GetPrimeTest.listPrime(listOdd));
        System.out.println("O número 2 é o único número par que tbem é primo.");
    }
}
