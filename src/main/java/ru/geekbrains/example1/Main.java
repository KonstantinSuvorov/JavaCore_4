package ru.geekbrains.example1;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный баланс: ");
        double initialBalance = scanner.nextDouble();

        Account account = null;

        try {
            account = new Account(initialBalance);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        while (true) {
            System.out.println(" ");
            System.out.println("1. Вклад денег на депозит");
            System.out.println("2. Съем денег");
            System.out.println("3. Проверить баланс");
            System.out.println("4. Выход");
            System.out.print("Выберите действие:");

            int option = scanner.nextInt();
            if (option == 1) {
                System.out.print("Введите сумму депозита: ");
                double depositAmount = scanner.nextDouble();
                try {
                    account.deposit(depositAmount);
                    System.out.println("Депозит успешно внесен");
                    System.out.println("Текущий баланс  " + account.getBalance());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (option == 2) {
                System.out.print("Введите сумму вывода: ");
                double withdrawalAmount = scanner.nextDouble();
                try {
                    account.withdraw(withdrawalAmount);
                    System.out.println("Вывод денег завершен");
                    System.out.println("Текущий баланс  " + account.getBalance());
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }
            } else if (option == 3) {
                System.out.println("Баланс: " + account.getBalance());
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Недопустимый вариант. Пожалуйста, повторите выбор");
            }
        }
    }
}
