package seven_chapter;
public class Fraction {
    int numerator;
    int denominator;
    private final float fraction;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator > 0){
            this.denominator = denominator;
        }
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
            numTmp = this.getNumerator() + fraction.getNumerator();
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
    // The msg is optional here
    public void print(String msg) {
        // Print space for each character in the string
        for (int i = 0; i <= msg.length(); ++i)
            System.out.print(" ");
        System.out.println(" "+ numerator);
        System.out.println(msg + " --- = " + fraction);
        for (int i = 0; i <= msg.length(); ++i)
            System.out.print(" ");
        System.out.println(" "+ denominator);
    }
}
