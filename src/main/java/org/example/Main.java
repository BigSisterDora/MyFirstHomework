package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Выберите программу:");
            System.out.println("1 - Восточный календарь");
            System.out.println("2 - Проверка таблицы умножения");
            System.out.println("3 - Книги и авторы");
            System.out.println("0 - Выход");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> Work1.run();
                case 2 -> Work2.run();
                case 3 -> Work3.run();
                case 0 -> exit = true;
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        System.out.println("Выход из программы. До свидания!");
        scanner.close();
    }
}
