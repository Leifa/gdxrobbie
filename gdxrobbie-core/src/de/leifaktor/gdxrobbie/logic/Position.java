package de.leifaktor.gdxrobbie.logic;

/**
 * Diese Klasse kapselt eine Position in der Spielwelt, unabhängig von den
 * Koordinaten des Raumes, sondern mit einer direkten Referenz auf den Raum.
 * Sie wird benutzt für Teleporter und die Startposition des Spielers.
 * @author leif
 *
 */

public class Position {
	
	public Position(Room room, int x, int y) {
		this.room = room;
		this.x = x;
		this.y = y;
	}

	public Room room;
	public int x;
	public int y;
	
}
