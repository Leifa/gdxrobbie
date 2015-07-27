package de.leifaktor.gdxrobbie.condition.number;

/**
 * This class describes a game variable or a number that can be calculated from those.
 * @author leif
 *
 */

public class Number {
	
	public static final int PLAYER_X = 0; 			// The Players X-Coordinate
	public static final int PLAYER_Y = 1;			// The Players Y-Cooddinate
	public static final int GOLD = 2; 				// The Players Gold count
	public static final int SCORE = 3; 				// The Players score
	public static final int ROOMS_SEEN = 4;			// The number of rooms the player has entered
	public static final int ITEM_NUMBER = 5;		// How many of a specific item does the player hold?
	public static final int PLAYER_DEATHS = 6;		// How many times did the player die?
	public static final int PLAYER_KILLS = 7;		// How many monsters did the player kill?
	public static final int TICKS_IN_THIS_ROOM = 8; // How long has the player been in this room?
	public static final int CONSTANT = 9; 			// A constant
	public static final int SUM = 10; 				// A sum of two numbers
	public static final int DIFFERENCE = 11; 		// A difference of two numbers
	public static final int PRODUCT = 12; 			// A product of two numbers
	public static final int QUOTIENT = 13; 			// A quotient of two numbers
	public static final int REMAINDER = 14; 		// The remainder of the division of two numbers	
	public static final int BACKPACK_WEIGHT = 15;	// The weight of the players backpack
	public static final int MONSTERS_ALIVE = 16;	// The number of monsters alive in the current room
	
	/**
	 * The kind of variable this object points to
	 */
	
	private int variableID;	
	
	/**
	 * Creates a number that can be used in a condition
	 */
	
	public Number(int variableID) {
		this.variableID = variableID;
	}
	
	/**
	 * returns the variableID
	 * @return
	 */
	
	public int getVariableID() {
		return variableID;
	}

	
}
