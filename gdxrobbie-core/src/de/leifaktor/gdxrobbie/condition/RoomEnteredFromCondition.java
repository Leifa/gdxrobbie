package de.leifaktor.gdxrobbie.condition;

public class RoomEnteredFromCondition extends Condition {

	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	public static final int TELEPORT = 4;
	
	private int from;
	
	public RoomEnteredFromCondition(int from) {
		this.from = from;
	}
	
	public int getFrom() {
		return from;
	}
	
}
