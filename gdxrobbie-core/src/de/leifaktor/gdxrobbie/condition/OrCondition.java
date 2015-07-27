package de.leifaktor.gdxrobbie.condition;

public class OrCondition extends Condition {

	private Condition a, b;	

	public OrCondition(Condition a, Condition b) {
		this.a = a;
		this.b = b;
	}
	
	public Condition getA() {
		return a;
	}
	
	public Condition getB() {
		return b;
	}	

	
}
