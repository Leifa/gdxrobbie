package de.leifaktor.gdxrobbie.condition.number;

public class QuotientNumber extends Number {

	private Number dividend,divisor;
	
	public QuotientNumber(Number a, Number b) {
		super(Number.QUOTIENT);
		this.dividend = a;
		this.divisor = b;
	}
	
	public Number getDividend() {
		return dividend;
	}
	
	public Number getDivisor() {
		return divisor;
	}
	
}
