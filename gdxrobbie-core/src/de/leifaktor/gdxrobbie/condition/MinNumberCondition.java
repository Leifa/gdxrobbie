package de.leifaktor.gdxrobbie.condition;

public class MinNumberCondition extends Condition {
	
	private int number;

	public MinNumberCondition(int number) {
		this.number = number;
	}
	
	public int getMinScore() {
		return number;
	}
	
}
