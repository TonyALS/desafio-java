package exercise5.accounts;

import exercise5.exceptions.OperationExceptions;
import exercise5.models.Account;
import exercise5.models.Client;

public class CommonPerson extends Account {
    private final double transactionFee = 2.50;

    public CommonPerson(Long number, double balance, Client client) {
        super(number, balance, client);
    }

    public void deposit(double value) {
        super.balance += value;
    }

    public boolean withDraw(double value) throws OperationExceptions {
        double valueWithFee = value + this.transactionFee;
        if (super.getBalance() < valueWithFee) {
            throw new OperationExceptions("Saldo insuficiente");
        }
        super.balance -= valueWithFee;
        return true;
    }

    public boolean transferBetweenAccounts(double value) throws OperationExceptions {
        if (super.getBalance() < value) {
            throw new OperationExceptions("Saldo insuficiente");
        }
        super.balance -= value;
        return true;
    }

    @Override
    public String toString() {
        return "Conta Comum { "+
                "Cliente: " + super.getClient() +
                ", balance: " + balance +
                " Nr Conta: " + super.getNumber() +
                '}';
    }
}
