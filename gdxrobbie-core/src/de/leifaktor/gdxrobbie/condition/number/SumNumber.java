package de.leifaktor.gdxrobbie.condition.number;

public class SumNumber extends Number {

	private Number summand1,summand2;
	
	public SumNumber(Number a, Number b) {
		super(Number.SUM);
		this.summand1 = a;
		this.summand2 = b;
	}
	
	public Number getFirstSummand() {
		return summand1;
	}
	
	public Number getSecondSummand() {
		return summand2;
	}
	
}
