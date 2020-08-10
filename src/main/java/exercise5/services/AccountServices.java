package exercise5.services;

import exercise5.exceptions.OperationExceptions;
import exercise5.interfaces.AccountServicesInterface;
import exercise5.models.Account;

import java.util.Map;

public class AccountServices implements AccountServicesInterface {

    @Override
    public void deposit(Map<Long, Account> mapAccounts, Long numberAccount, double value) {
        Account account = mapAccounts.get(numberAccount);
        account.deposit(value);
    }

    @Override
    public boolean withdraw(Map<Long, Account> mapAccounts, Long numberAccount, double value) {
        Account account = mapAccounts.get(numberAccount);
        try {
            account.withDraw(value);
            return true;
        } catch (OperationExceptions op) {
            System.out.println(op.getMessage());
            return false;
        }
    }

    @Override
    public boolean transferBetweenAccounts(
            Map<Long, Account> mapAccounts, Long numberSourceAccount,
            Long numberDestAccount, double value) {
        Account sourceAccount = mapAccounts.get(numberSourceAccount);
        Account destinyAccount = mapAccounts.get(numberDestAccount);

        try {
            if (sourceAccount.equals(destinyAccount)) {
                System.out.println("Conta de origem e destino devem ser diferentes.");
                return false;
            }
            sourceAccount.transferBetweenAccounts(value);
            destinyAccount.deposit(value);
            return true;
        } catch (OperationExceptions op) {
            System.out.println(op.getMessage());
            return false;
        } catch (NullPointerException nullPointerException) {
            System.out.println("Conta destino não encontrada");
            return false;
        }
    }
}
