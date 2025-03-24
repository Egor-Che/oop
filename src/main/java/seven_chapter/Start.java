package seven_chapter;
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
    }
}
