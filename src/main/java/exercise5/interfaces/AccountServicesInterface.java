package exercise5.interfaces;

import exercise5.models.Account;

import java.util.Map;

public interface AccountServicesInterface {
    void deposit(Map<Long, Account> mapAccounts, Long numberAccount, double value);
    boolean withdraw(Map<Long, Account> mapAccounts, Long numberAccount, double value);
    boolean transferBetweenAccounts( Map<Long, Account> mapAccounts, Long numberSourceAccount,
                                     Long numberDestAccount, double value);
}
