package ru.egor_che.eight_chapter;
import ru.egor_che.eight_chapter.ExponentCalculator;

import java.util.Scanner;

// PowerCalculator.java - главный класс с точкой входа
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Если аргументы не переданы - запрашиваем ввод
        if (args.length < 2) {
            System.out.println("Введите основание степени:");
            String xStr = scanner.nextLine();

            System.out.println("Введите показатель степени:");
            String yStr = scanner.nextLine();

            calculateAndPrint(xStr, yStr);
        } else {
            // Используем аргументы командной строки
            calculateAndPrint(args[0], args[1]);
        }

        scanner.close();
    }

    private static void calculateAndPrint(String xStr, String yStr) {
        try {
            double result = ExponentCalculator.calculate(xStr, yStr);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат чисел");
        }
    }
}