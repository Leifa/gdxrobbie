package de.leifaktor.gdxrobbie.condition;

public class EqualsNumberCondition extends Condition {

	private int number;

	public EqualsNumberCondition(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
}
