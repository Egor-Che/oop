package ru.egor_che.eight_chapter;
// ExponentCalculator.java - класс для вычисления степени
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class ExponentCalculator {
    public static double calculate(String base, String exponent) {
        int x = parseInt(base);
        int y = parseInt(exponent);
        return pow(x, y);
    }
}