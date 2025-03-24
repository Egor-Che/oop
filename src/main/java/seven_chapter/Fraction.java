package seven_chapter;
public class Fraction {
    int numerator;
    int denominator;
    private float fraction;

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

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction sum(Fraction fraction)
    {
        Fraction tempSum = new Fraction(0,0);
        if(this.getDenominator() == fraction.getDenominator())
        {
            tempSum.setNumerator(this.getNumerator() + fraction.getNumerator());
            tempSum.setDenominator(this.getDenominator());
        }
        else
        {
            tempSum.setNumerator(this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator());
            tempSum.setDenominator(this.getDenominator() * fraction.getDenominator());
        }
        return tempSum;
    }    public Fraction minus(Fraction fraction)
    {
        Fraction tempMinus = new Fraction(0,0);
        if(this.getDenominator() == fraction.getDenominator())
        {
            tempMinus.setNumerator(this.getNumerator() - fraction.getNumerator());
            tempMinus.setDenominator(this.getDenominator());
        }
        else
        {
            tempMinus.setNumerator(this.getNumerator() * fraction.getDenominator() - fraction.getNumerator() * this.getDenominator());
            tempMinus.setDenominator(this.getDenominator() * fraction.getDenominator());
        }
        return tempMinus;
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
