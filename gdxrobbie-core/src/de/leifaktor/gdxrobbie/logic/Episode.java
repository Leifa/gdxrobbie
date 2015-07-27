package de.leifaktor.gdxrobbie.logic;

import java.util.ArrayList;

public class Episode {
	
	/**
	 * Eine Liste von Floors, die in der Episode vorkommen.
	 */

	private ArrayList<Floor> floors;
	
	/**
	 * Der Name der Episode
	 */
	
	private String name;
	
	/**
	 * Die episodenweit konstante Raumbreite
	 */
	
	private int roomWidth;
	
	/**
	 * Die episodenweit konstante Raumhöhe
	 */
	
	private int roomHeight;
	
	/**
	 * Die Startposition des Spielers
	 */
	
	private Position startingPosition;
	
	/**
	 * Erzeugt eine neue Episode
	 * @param roomWidth Die Raumbreite
	 * @param roomHeight Die Raumhöhe
	 */
	
	public Episode(int roomWidth, int roomHeight) {
		this.roomHeight = roomHeight;
		this.roomWidth = roomWidth;
		this.floors = new ArrayList<Floor>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getStartingPosition() {
		return startingPosition;
	}

	public void setStartingPosition(Position startingPosition) {
		this.startingPosition = startingPosition;
	}

	public ArrayList<Floor> getFloors() {
		return floors;
	}

	public int getRoomWidth() {
		return roomWidth;
	}

	public int getRoomHeight() {
		return roomHeight;
	}

	public void setFloors(ArrayList<Floor> floors) {
		this.floors = floors;
		
	}

}
