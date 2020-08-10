package exercise4.exercisefive.accounts;

import exercise4.exercisefive.exception.AccountException;

public class BankAccount {
    private double balance;
    private double limit;

    public BankAccount(double balance, double limit) {
        this.balance = balance;
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getBalanceWithLimit() {
        return this.limit + this.balance;
    }

    public boolean withDraw(double value) throws AccountException {
        double totalBalance = this.balance + this.limit;
        if (value >= 500) {
            throw new AccountException("Permitido somente saques até R$ 500,00");
        }
        if (totalBalance - value < 0) {
            throw new AccountException("Saldo insuficiente. Saldo atual: " + totalBalance);
        }
        this.balance -= value;
        return true;
    }

    public boolean cashDeposit(double value) throws AccountException {
        if (value > 1000) {
            throw new AccountException("Depósitos acima de R$ 1.000,00 não são permitidos");
        }
        this.balance += value;
        return true;
    }
}
