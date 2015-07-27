package de.leifaktor.gdxrobbie.logic;

/**
 * Diese Klasse stellt einen Floor dar. Ein Floor ist eine zweidimensionale
 * Anordnung von Rooms
 * @author leif
 */

public class Floor {
	
	/**
	 * Die Referenzen auf die Räume. Sie stehen zeilenweise von links nach rechts
	 * und von oben nach unten geordnet in dem Array.
	 */

	private Room[] rooms;
	
	/**
	 * Die Breite des Floors
	 */
	
	private int width;
	
	/**
	 * Die Höhe des Floors
	 */
	
	private int height;
	
	/**
	 * Erzeugt einen Floor
	 * @param width Anzahl der Räume in der Breite
	 * @param height Anzahl der Räume in der Höhe
	 */
	
	public Floor(int width, int height) {
		this.height = height;
		this.width = width;
		rooms = new Room[width*height];
	}
	
	public void setRoom(int x, int y, Room room) {
		if (0 <= x && x < width && 0 <= y && y < height) {
			rooms[y*width + x] = room;
		}
	}
	
	public void expandSouth() {
		Room[] newrooms = new Room[width*(height+1)];
		for (int i = 0; i < rooms.length; i++) {
			newrooms[i] = rooms[i];
		}
		rooms = newrooms;
		height++;
		updateRoomPositions();
	}
	
	public void expandNorth() {
		Room[] newrooms = new Room[width*(height+1)];
		for (int i = 0; i < rooms.length; i++) {
			newrooms[i+width] = rooms[i];
		}
		rooms = newrooms;
		height++;
		updateRoomPositions();
	}
	
	public void expandWest() {
		Room[] newrooms = new Room[(width+1)*height];
		for (int i = 0; i < rooms.length; i++) {
			newrooms[(width+1)*(i/width) + i%width] = rooms[i];
		}
		rooms = newrooms;
		width++;
		updateRoomPositions();
	}
	
	public void expandEast() {
		Room[] newrooms = new Room[(width+1)*height];
		for (int i = 0; i < rooms.length; i++) {
			newrooms[(width+1)*(i/width) + i%width + 1] = rooms[i];
		}
		rooms = newrooms;
		width++;
		updateRoomPositions();
	}
	
	private void updateRoomPositions() {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				rooms[i].setX(i % width);
				rooms[i].setY(i / width);
			}
		}
	}
	
	public Room[] getRooms() {
		return rooms;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

}
