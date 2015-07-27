package de.leifaktor.gdxrobbie.logic;

/**
 * Diese Klasse stellt einen Raum in einer Robbie-Episode dar.
 */

import java.util.ArrayList;

import de.leifaktor.gdxrobbie.entity.Entity;
import de.leifaktor.gdxrobbie.logic.tiles.Tile;

public class Room {

	/**
	 *  Der Floor, in dem der Raum sich befindet
	 */

	private Floor floor;
	
	/**
	 *  Position innerhalb des Floors (x von links nach rechts, y von oben nach unten)
	 */
	private int x;
	private int y;
	
	/**
	 * Die Größe des Raumes
	 */
	private int width;
	private int height;
	
	/**
	 * Der Name des Raumes
	 */
	private String name;
	
	/**
	 * Die Layer des Raumes
	 * Das Array hat Länge width*height, die Tiles werden zeilenweise, von links nach rechts,
	 * von oben nach unten aufgezählt.
	 */
	
	private ArrayList<RoomLayer> layers;
	
	/**
	 * Eine Liste von Actors in diesem Raum
	 */
	
	private ArrayList<Entity> actors;
	
	/**
	 * Eine Liste von MonsterAreas
	 */
	
	private ArrayList<MonsterArea> monsterAreas;
	
	/**
	 * @param width Die Breite des Raumes
	 * @param height Die Höhe des Raumes
	 * @param x Die x-Position innerhalb des Floors
	 * @param y Die y-Position innerhalb des Floors
	 * @param floor Der Floor, in dem der Raum sich befindet
	 */
	
	public Room(int width, int height, Floor floor, int x, int y) {
		this.width = width;
		this.height = height;
		this.floor = floor;
		this.x = x;
		this.y = y;
		this.layers = new ArrayList<RoomLayer>();				
		this.actors = new ArrayList<Entity>();
		emptyRoom();
	}
	
	/**
	 * Makes this room empty
	 */
	
	private void emptyRoom() {
		layers.clear();
		layers.add(new RoomLayer(width, height));
		this.actors.clear();
	}
	
	/**
	 * This method gets called when the room is entered
	 */
	
	public void onEnter() {
		// Place Monsters from monster areas
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Entity> getActors() {
		return actors;
	}
	
	public ArrayList<RoomLayer> getLayers() {
		return layers;
	}

}
