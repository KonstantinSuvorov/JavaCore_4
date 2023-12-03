package ru.geekbrains.example1;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        System.out.println("Недостаточно средств");
    }

}
