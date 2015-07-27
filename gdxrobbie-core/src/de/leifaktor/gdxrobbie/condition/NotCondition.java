package de.leifaktor.gdxrobbie.condition;

public class NotCondition extends Condition {
	
	private Condition a;	

	public NotCondition(Condition a) {
		this.a = a;
	}
	
	public Condition getA() {
		return a;
	}	

}
