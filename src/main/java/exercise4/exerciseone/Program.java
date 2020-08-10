package exercise4.exerciseone;

import exercise4.exerciseone.entity.ArithmeticOperation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro número: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            int n2 = sc.nextInt();
            System.out.println("Resultado: " + ArithmeticOperation.division(n1, n2));
        } catch (InputMismatchException input) {
            System.out.println("ERRO: Digite apenas números.");
            input.printStackTrace();
        } catch (ArithmeticException ar) {
            System.out.println("Divisão por zero não permitida.");
            ar.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro inesperado");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
