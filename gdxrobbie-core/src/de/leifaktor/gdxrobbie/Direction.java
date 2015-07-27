package de.leifaktor.gdxrobbie;

public class Direction {

	public static final int DIR_X[] = {0,1,0,-1,1,1,-1,-1};
	public static final int DIR_Y[] = {-1,0,1,0,-1,1,1,-1};
	
	// Wenn man in Richtung (x,y) geht, welche Richtung ist das?
	public static int coordinatesToDirection(int x, int y) {
		switch (x * 3 + y) {
		case -4: return 7;
		case -3: return 3;
		case -2: return 6;
		case -1: return 0;		
		case 1: return 2;
		case 2: return 4;
		case 3: return 1;
		case 4: return 5;
		default: return -1;
		}
	}
	
}