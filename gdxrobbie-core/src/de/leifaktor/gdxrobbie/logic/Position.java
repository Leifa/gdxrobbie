package de.leifaktor.gdxrobbie.logic;

/**
 * Diese Klasse kapselt eine Position in der Spielwelt, unabhängig von den
 * Koordinaten des Raumes, sondern mit einer direkten Referenz auf den Raum.
 * Sie wird benutzt für Teleporter und die Startposition des Spielers.
 * @author leif
 *
 */

public class Position {
	
	public Room room;
	public int x;
	public int y;
	public int z;
	
	public Position(Room room, int x, int y, int z) {
		this.room = room;
		this.x = x;
		this.y = y;
		this.z = z;
	}


	
}
