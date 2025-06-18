package ru.egor_che.eight_chapter;
import java.util.List;
import java.util.Random;

// Базовый класс Птица
abstract class Bird {
    // Общий метод для всех птиц
    public abstract void sound();
}

// Класс Воробей
class Sparrow extends Bird {
    @Override
    public void sound() {
        System.out.println("чырык");
    }
}

// Класс Кукушка
class Cuckoo extends Bird {
    private static final Random random = new Random();

    @Override
    public void sound() {
        int count = 1 + random.nextInt(10); // случайное число от 1 до 10
        for (int i = 0; i < count; i++) {
            System.out.print("ку-ку ");
        }
        System.out.println();
    }
}

// Класс Попугай
class Parrot extends Bird {
    private static final Random random = new Random();
    private final String text;

    public Parrot(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Текст для попугая не может быть пустым");
        }
        this.text = text;
    }

    @Override
    public void sound() {
        int maxLength = Math.min(text.length(), 1 + random.nextInt(text.length()));
        int n = 1 + random.nextInt(maxLength); // минимум 1, максимум длина текста
        System.out.println(text.substring(0, n));
    }    // Метод, который принимает набор птиц и вызывает у каждой метод sound()


    public static void makeBirdsSing(List<Bird> birds) {
        System.out.println("Начинаем концерт птиц!");
        System.out.println("----------------------");

        for (Bird bird : birds) {
            bird.sound();
        }

        System.out.println("----------------------");
        System.out.println("Концерт окончен!");
    }
}