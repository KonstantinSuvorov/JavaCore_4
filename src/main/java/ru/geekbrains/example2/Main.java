package ru.geekbrains.example2;

public class Main {

    public static void main(String[] args) {

        DebitAccount account1 = new DebitAccount(1000); // Баланс счета 1
        CreditAccount account2 = new CreditAccount(500, 700); // Баланс счета 2

        System.out.println("Баланс счетов до транзакции");
        System.out.println("Счет аккаунта 1: " + account1.getBalance());
        System.out.println("Счет аккаунта 2: " + account2.getBalance());

        try{
            Transaction.transfer(account1, account2, 900); // Сумма перевода со счета 1 на счет 2

        } catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Баланс счетов после транзакции");
        System.out.println("Счет аккаунта 1: " + account1.getBalance());
        System.out.println("Счет аккаунта 2: " + account2.getBalance());
    }
}
