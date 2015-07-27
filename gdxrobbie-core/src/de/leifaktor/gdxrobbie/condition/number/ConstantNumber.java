package de.leifaktor.gdxrobbie.condition.number;

public class ConstantNumber extends Number {

	private int constant;
	
	public ConstantNumber(int constant) {
		super(Number.CONSTANT);
		this.constant = constant;
	}
	
	public int getValue() {
		return constant;
	}

	
	
}
