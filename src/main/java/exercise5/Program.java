package exercise5;

import exercise5.models.Account;
import exercise5.services.AccountServices;
import exercise5.util.FakeAccount;
import exercise5.util.MapAccounts;

import java.util.List;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        AccountServices accountServices = new AccountServices();
        List<Account> accountList = FakeAccount.fakeList();
        // System.out.println(accountList);
        System.out.println("******** GERANDO CONTAS ********");
        accountList.forEach(account -> {
            System.out.println("Tipo de conta: " + account);
            System.out.println("-----------------------------------------------");
        });



        Map<Long, Account> mapAccounts = MapAccounts.mapAccounts(accountList);

        System.out.println("******** OPERAÇÕES DE DEPÓSITO ********");
        accountList.forEach(account -> {
            try {
                System.out.println("Conta: " + account.getNumber() + " Saldo anterior: " + account.getBalance());
                double depositValue = FakeAccount.random(1000, 10);
                accountServices.deposit(mapAccounts, account.getNumber(), depositValue);
                System.out.println("Conta: " + account.getNumber() + " Valor do depósito: " + depositValue);
                System.out.println("Conta: " + account.getNumber() + " Saldo atual: " + account.getBalance());
            } catch (Exception e) {
                System.out.println("Ocorreu algum erro na operação");
            } finally {
                System.out.println("-----------------------------------------------");
            }
        });

        System.out.println();
        System.out.println("******** OPERAÇÕES DE TRANSFERÊNCIA ********");
        Long count = 1L;
        accountList.forEach(account -> {
            System.out.println("Conta: " + account.getNumber() + " Saldo anterior: " + account.getBalance());
            double transferValue = FakeAccount.random(1000, 0);
            long numberDestAccount = FakeAccount.randomLong();

            try {
                System.out.println("Valor a transferir: "
                        + transferValue + " para "
                        + mapAccounts.get(numberDestAccount).getClient() + " Nr conta: "
                        + mapAccounts.get(numberDestAccount).getNumber()
                );

                accountServices.transferBetweenAccounts(mapAccounts, account.getNumber(), numberDestAccount, transferValue);

                System.out.println("Conta: " + account.getNumber() + " Saldo atual: " + account.getBalance());
            } catch (NullPointerException nullPointerException) {
                System.out.println("ERRO: Conta destino não encontrada.");
            } finally {
                System.out.println("-----------------------------------------------");
            }
        });

        System.out.println();
        System.out.println("******** OPERAÇÕES DE SAQUE ********");
        accountList.forEach(account -> {
            try {
                System.out.println("Conta: " + account.getNumber() + " Saldo anterior: " + account.getBalance());
                double withdraw = mapAccounts.get(account.getNumber()).getBalance() * 0.9;
                System.out.println("Efetuando saque de 90% do total: " + withdraw);
                accountServices.withdraw(mapAccounts, account.getNumber(), withdraw);
                System.out.println("Conta: " + account.getNumber() + " Saldo atual: " + account.getBalance());
            } catch (Exception e) {
                System.out.println("Ocorreu algum erro na operação");
            } finally {
                System.out.println("-----------------------------------------------");
            }
        });
    }
}
