package ru.geekbrains.example2;

public class InsufficientFundsException extends Throwable {
    public InsufficientFundsException() {
        System.out.println("Недостаточно средств для перевода");
    }
}
