package de.leifaktor.gdxrobbie.condition.number;

public class ProductNumber extends Number {

	private Number factor1,factor2;
	
	public ProductNumber(Number a, Number b) {
		super(Number.PRODUCT);
		this.factor1 = a;
		this.factor2 = b;
	}
	
	public Number getFirstFactor() {
		return factor1;
	}
	
	public Number getSecondFactor() {
		return factor2;
	}
	
}
