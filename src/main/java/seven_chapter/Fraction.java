package seven_chapter;
public class Fraction extends Number {
    private final int numerator;
    private final int denominator;
    private final float fraction;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным, или равным нулю");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        this.fraction = (float) numerator / (float) denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction fraction) {
        int numTmp;
        int denTmp;
        if (this.getDenominator() == fraction.getDenominator()) {
            numTmp = this.getNumerator() + fraction.getNumerator();
            denTmp = this.getDenominator();
        } else {
            numTmp = this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator();
            denTmp = this.getDenominator() * fraction.getDenominator();
        }
        return new Fraction(numTmp, denTmp);
    }

    public Fraction minus(Fraction fraction) {
        int numTmp;
        int denTmp;
        if (this.getDenominator() == fraction.getDenominator()) {
            numTmp = this.getNumerator() - fraction.getNumerator();
            denTmp = this.getDenominator();
        } else {
            numTmp = this.getNumerator() * fraction.getDenominator() - fraction.getNumerator() * this.getDenominator();
            denTmp = this.getDenominator() * fraction.getDenominator();
        }
        return new Fraction(numTmp, denTmp);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                ", fraction=" + fraction +
                '}';
    }

    public void print(String msg) {
        for (int i = 0; i <= msg.length(); ++i)
            System.out.print(" ");
        System.out.println(" " + numerator);
        System.out.println(msg + " --- = " + fraction);
        for (int i = 0; i <= msg.length(); ++i)
            System.out.print(" ");
        System.out.println(" " + denominator);
    }

    // Реализация абстрактных методов Number
    @Override
    public int intValue() {
        return (int) fraction;
    }

    @Override
    public long longValue() {
        return (long) fraction;
    }

    @Override
    public float floatValue() {
        return fraction;
    }

    @Override
    public double doubleValue() {
        return (double) fraction;
    }

    // Можно переопределить byteValue и shortValue для более точного представления
    @Override
    public byte byteValue() {
        return (byte) fraction;
    }

    @Override
    public short shortValue() {
        return (short) fraction;
    }
}