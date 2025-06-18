package ru.egor_che.eight_chapter;

import java.util.ArrayList;
import java.util.List;

import static ru.egor_che.eight_chapter.Parrot.makeBirdsSing;

public class Start {
    // Метод для обработки набора измеряемых объектов
    public static void printLengths(Measurable... measurables) {
        for (Measurable m : measurables) {
            System.out.println("Длина: " + m.getLength());
        }
    }
    public static void main(String[] args) {
        System.out.println("Точка с тремя координатами:");
        //Point3D
        Point3D point = new Point3D(2, 4, 6);
        System.out.println("X: " + point.x + ", Y: " + point.y + ", Z: " + point.z);

        //ClosedPolyLine
        // Создаем точки для ломаных линий
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(3, 1);
        Point p4 = new Point(4, 3);

        System.out.println("Обычная ломаная линия:");
        PolyLine line = new PolyLine(p1, p2, p3, p4);
        line.draw();

        System.out.println("\nЗамкнутая ломаная линия:");
        ClosedPolyLine closedLine = new ClosedPolyLine(p1, p2, p3, p4);
        closedLine.draw();

        System.out.println("\nВывод длин обеих ломаных через интерфейс:");
        // Вызываем метод с обоими типами линий
        printLengths(line, closedLine);



        System.out.println(" ");
        System.out.println("Практика ООП. *Полиморфизм #7. Птицы - задание необязательное:");
        Bird[] birds = {
                new Sparrow(),
                new Cuckoo(),
                new Parrot("Попка не дуррррак!")
        };

        for (Bird bird : birds) {
            bird.sound();
        }


        System.out.println(" ");
        System.out.println("Практика ООП. * Полиморфизм #8. Птичий рынок - задание необязательное:");

        // Создаем список птиц
        List<Bird> manyBirds = new ArrayList<>();

        // Добавляем несколько воробьев
        manyBirds.add(new Sparrow());
        manyBirds.add(new Sparrow());

        // Добавляем несколько кукушек
        manyBirds.add(new Cuckoo());
        manyBirds.add(new Cuckoo());
        manyBirds.add(new Cuckoo());

        // Добавляем несколько попугаев с разными фразами
        manyBirds.add(new Parrot("Каррррамба!"));
        manyBirds.add(new Parrot("На аборрррдаж!"));
        manyBirds.add(new Parrot("Аррррива!"));

        // Вызываем метод для прослушивания пения птиц
        makeBirdsSing(manyBirds);

    }
}
