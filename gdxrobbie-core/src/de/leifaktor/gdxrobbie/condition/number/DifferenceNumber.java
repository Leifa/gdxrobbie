package de.leifaktor.gdxrobbie.condition.number;

public class DifferenceNumber extends Number {

	private Number minuend,subtrahend;
	
	public DifferenceNumber(Number minuend, Number subtrahend) {
		super(Number.DIFFERENCE);
		this.minuend = minuend;
		this.subtrahend = subtrahend;
	}
	
	public Number getMinuend() {
		return minuend;
	}
	
	public Number getSubtrahend() {
		return subtrahend;
	}
	
}
