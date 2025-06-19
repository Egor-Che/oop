package ru.egor_che.eight_chapter;
import ru.egor_che.eight_chapter.Point; // Импорт класса Point из моего пакета
import java.awt.*; // Импорт всего пакета java.awt

public class PointDemo {
    public static void main(String[] args) {
        // Создаю точку из моего пакета (используется полное имя класса)
        ru.egor_che.eight_chapter.Point myPoint = new ru.egor_che.eight_chapter.Point(3, 5);

        // Создаю точку из пакета java.awt (используется простое имя)
        Point awtPoint = new Point(10, 20);

        System.out.println("Точка из ru.egor_che.eight_chapter: " + myPoint);
        System.out.println("Точка из java.awt: " + awtPoint);
    }
}
