package de.leifaktor.gdxrobbie.condition;

public class MaxNumberCondition extends Condition {

	private int number;

	public MaxNumberCondition(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
}
