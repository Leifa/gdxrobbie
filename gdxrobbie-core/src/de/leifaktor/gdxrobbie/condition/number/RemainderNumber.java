package de.leifaktor.gdxrobbie.condition.number;

public class RemainderNumber extends Number {

	private Number dividend,divisor;
	
	public RemainderNumber(Number dividend, Number divisor) {
		super(Number.REMAINDER);
		this.dividend = dividend;
		this.divisor = divisor;
	}
	
	public Number getDividend() {
		return dividend;
	}
	
	public Number getDivisor() {
		return divisor;
	}
	
}
