package org.example;

/*Создайте программу-тест для проверки знаний таблицы умножения. С помощью случайных чисел создайте 5 примеров.

При правильном ответе — на экране пишется: "Правильно зеленым цветом".
При неправильном — "Ошибка красным цветом".
Также программа в зависимости от результата прохождения теста должна выставить оценку:
Если количество правильных ответов = 5, то "Молодец".
3 или 4 — "Надо бы еще поучить".
Меньше 2 — "Срочно нужно учить таблицу умножения".*/

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Work2 {
    public static void run() {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        Random random = new Random();
        int correctAnswers = 0;

        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(10) + 1;
            System.out.printf("Сколько будет %d * %d? ", a, b);
            int answer = scanner.nextInt();

            if (answer == a * b) {
                System.out.println("\u001B[32mПравильно!\u001B[0m"); // Зеленый цвет
                correctAnswers++;
            } else {
                System.out.println("\u001B[31mОшибка!\u001B[0m"); // Красный цвет
            }
        }

        switch (correctAnswers) {
            case 5 -> System.out.println("Молодец!");
            case 3, 4 -> System.out.println("Надо бы еще поучить.");
            default -> System.out.println("Срочно нужно учить таблицу умножения.");
        }
    }
}

