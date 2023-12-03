package ru.geekbrains.example2;

public class Transaction {

    public static void transfer(Account from, Account to, double amount) throws InsufficientFundsException {
        if (from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Сумма перевода со счета 1 на счет 2: " + amount);
            System.out.println("Перевод осуществлен");
        } else {
            System.out.println("Сумма перевода со счета 1 на счет 2: " + amount);
            throw new InsufficientFundsException();
        }

    }

}
