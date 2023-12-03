package ru.geekbrains.example2;

public class CreditAccount extends Account {
    private final double creditLimit;

    //public CreditAccount(double balance, double creditLimit)
    public CreditAccount(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + creditLimit) {
            balance -= amount;
        } else {
            System.out.println("Превышен кредитный лимит");
        }
    }
}
