package exercise5.models;

import exercise5.exceptions.OperationExceptions;

public class Account {
    private Long id;
    private Long number;
    protected double balance;
    private Client client;

    public Account(Long number, double balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean withDraw(double value) throws OperationExceptions {
        return false;
    }

    public boolean transferBetweenAccounts(double value) throws OperationExceptions {
        return false;
    }

    public void deposit(double value) {}


}
