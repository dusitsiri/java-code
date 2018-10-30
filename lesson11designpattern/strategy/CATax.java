package lesson11designpattern.strategy;

public class CATax implements TaxCalculator {

	@Override
	public double calculate(double purchase) {
		return purchase * 0.075;
		
	}

}
