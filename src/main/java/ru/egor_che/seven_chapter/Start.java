package ru.egor_che.seven_chapter;

import java.util.Arrays;

import static ru.egor_che.seven_chapter.Fraction.sumAll;

public class Start {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,5);
        Fraction f3 = new Fraction(7,8);
        Fraction f4 = new Fraction(5,1);
        f1.print("Fraction: "); //вывод первой дроби
        f2.print("Fraction: "); //вывод второй дроби
        f3.print("Fraction: "); //вывод третьей дроби
        Fraction fraction = f1.sum(f2).sum(f3).minus(f4);
        System.out.println(fraction);

        fraction.print("Fraction: "); //вывод финального значения задачи


        //Студент
        // Создание студента с начальными оценками
        Student student = new Student("Иван Петров", Arrays.asList(5, 4, 3));
        student.addGrade(2);
        student.addGrade(3);
        student.addGrade(4);
        student.addGrade(5);

        System.out.println(student);

        // Попытка добавить недопустимую оценку
        try {
            student.addGrade(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        // Попытка удалить оценку
        try {
            student.removeGrade(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Вывод информации о студенте
        System.out.println("Студент: " + student.getName());
        System.out.println("Оценки: " + student.getGrades());
        System.out.println("Средний балл: " + student.getAverageGrade());

        student.addGrade(3);
        student.addGrade(4);
        student.addGrade(5);
        System.out.println(student);



        // Полиморфизм 6 - Сложение
        System.out.println("");
        System.out.println("Вывод решения задания Полиморфизм 6 - Сложение");
        int f5 = 2;
        Fraction f6 = new Fraction(3, 5);
        Double f7 = 2.3;
        System.out.println("Сложение значений первой строки: " + String.format("%.4f", sumAll(f5, f6, f7)) + " - значение округлено до 4 знаков после запятой"); //первая строка
        Double f8 = 3.6;
        Fraction f9 = new Fraction(49, 12);
        int f10 = 3;
        Fraction f11 = new Fraction(3, 2);
        System.out.println("Сложение значений второй строки: " + String.format("%.4f", sumAll(f8, f9, f10, f11)) + " - значение округлено до 4 знаков после запятой"); //вторая строка
        Fraction f12 = new Fraction(1, 3);
        int f13 = 1;
        System.out.println("Сложение значений третьей строки: " + String.format("%.4f", sumAll(f12, f13)) + " - значение округлено до 4 знаков после запятой"); //третья строка
    }
}
