package exercise4.exercisefive;

import exercise4.exercisefive.accounts.BankAccount;
import exercise4.exercisefive.exception.AccountException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(400, 50);
        System.out.println("O que deseja fazer? [1] - Saque | [2] - Depósito");
        int option = sc.nextInt();

        switch (option) {
            case 1: {
                System.out.println("Digite um valor para saque: ");
                double value = sc.nextDouble();
                try {
                    if (bankAccount.withDraw(value)) {
                        System.out.println("Saque realizado. Saldo atual: " + bankAccount.getBalanceWithLimit());
                    }
                } catch (AccountException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            case 2: {
                System.out.println("Digite um valor para depósito: ");
                double value = sc.nextDouble();
                try {
                    if (bankAccount.cashDeposit(value)) {
                        System.out.println("Depósito realizado. Saldo atual: " + bankAccount.getBalanceWithLimit());
                    }
                } catch (AccountException e) {
                    System.out.println(e.getMessage());
                }
                break;
            } default: {
                System.out.println("Opção inválida");
            }
        }
    }
}
