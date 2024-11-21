package org.example;

/*В восточном календаре принят 60-летний цикл, состоящий из 12-летних подциклов, обозначаемых названиями цвета: зеленый, красный, желтый, белый и черный. В каждом подцикле годы носят названия животных: крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки и свиньи. По номеру года определите его название, если 1984 год — начало цикла: «год зеленой крысы».*/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Work1 {
    private static final String[] COLORS = {"зеленый", "красный", "желтый", "белый", "черный"};
    private static final String[] ANIMALS = {"крыса", "корова", "тигр", "заяц", "дракон", "змея",
            "лошадь", "овца", "обезьяна", "курица", "собака", "свинья"};

    public static void run() {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int cycleIndex = (year - 1984) % 60;
        if (cycleIndex < 0) cycleIndex += 60;

        String color = COLORS[cycleIndex / 12];
        String animal = ANIMALS[cycleIndex % 12];

        System.out.println(year + " — это год " + color + " " + animal + ".");
    }
}
