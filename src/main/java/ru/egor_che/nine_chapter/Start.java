package ru.egor_che.nine_chapter;

public class Start {
    public static void main(String[] args) {

        System.out.println("Точки"); // Точки
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);
        Point p3 = p1.clone();

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1 == p2);      // false
        System.out.println(p1.equals(p3)); // true
        System.out.println(p1 == p3);      // false


        System.out.println("Линии"); // Линии
        Point p4 = new Point(1, 1);
        Point p5 = new Point(4, 5);
        Line line1 = new Line(p4, p5);
        Line line2 = new Line(p4.clone(), p5.clone());
        Line line3 = line1.clone();

        System.out.println(line1.equals(line2)); // true
        System.out.println(line1 == line2);      // false
        System.out.println(line1.equals(line3)); // true
        System.out.println(line1 == line3);      // false

        // Проверка глубокого копирования
        line3.start.x = 10;
        System.out.println(line1.start.x); // останется 1, так как была сделана глубокая копия


        System.out.println("Ломаная линия"); // Ломаная линия
        Point p6 = new Point(1, 1);
        Point p7 = new Point(2, 3);
        Point p8 = new Point(4, 5);

        PolyLine line4 = new PolyLine(p6, p7, p8);
        PolyLine line5 = new PolyLine(p6.clone(), p7.clone(), p8.clone());
        PolyLine line6 = line4.clone();

        System.out.println(line4.equals(line5)); // true
        System.out.println(line4.equals(line6)); // true
        System.out.println(line4.points[0] == line6.points[0]); // false - проверка глубокого копирования
    }
}
