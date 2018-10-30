package lesson11designpattern.strategy;

public class NYTax implements TaxCalculator {
    @Override
    public double calculate(double purchase) {
        if (purchase <= 100)
            return 0;
        return purchase * 0.08;
    }
}
