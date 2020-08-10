package exercise4.exercisetwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int n;
        int i = 0;
        try {
            do {
                System.out.println("Digite até 10 números inteiros: ");
                n = sc.nextInt();
                vetor[i] = n;
                i++;
            }
            while (n != 0);
            for (Integer num : vetor) {
                System.out.println(num);
            }
            System.out.println("Fim do vetor");
        } catch (InputMismatchException input) {
            System.out.println("Digite apenas números inteiros.");
            input.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException arrayOut) {
            System.out.println("Digite no máximo 10 números inteiros.");
            arrayOut.printStackTrace();
        }
    }
}
