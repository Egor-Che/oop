package ru.egor_che.nine_chapter;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        double sum = 0;

        // Если есть аргументы командной строки - используем их
        if (args.length > 0) {
            sum = calculateSum(args);
            System.out.println((int)sum);
        }
        // Если нет аргументов - переходим в интерактивный режим
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите числа через пробел:");
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");

            sum = calculateSum(numbers);
            System.out.println("Сумма: " + (int)sum);

            scanner.close();
        }
    }

    private static double calculateSum(String[] values) {
        double sum = 0;
        for (String value : values) {
            try {
                sum += Double.parseDouble(value);
            } catch (NumberFormatException e) {
                System.out.println("Предупреждение: '" + value +
                        "' не является числом и будет проигнорировано");
            }
        }
        return sum;
    }
}