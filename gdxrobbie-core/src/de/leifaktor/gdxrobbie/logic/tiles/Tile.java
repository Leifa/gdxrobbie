package de.leifaktor.gdxrobbie.logic.tiles;

import de.leifaktor.gdxrobbie.entity.Entity;

/**
 * The super class for all tiles.
 * @author leif
 *
 */

public abstract class Tile {
	
	/**
	 * The global Tile array
	 */
	public static Tile[] tiles = new Tile[256];
	
	// The different kinds of Tiles
	public static final Tile EMPTY_TILE = new EmptyTile(0);

	private int id;
	
	public Tile(int id) {
		this.id = id;
		tiles[id] = this;
	}
	
	/**
	 * Returns this Tile with the given id
	 * @param i
	 * @return
	 */
	
	public static Tile get(int i) {		
		return tiles[i];
	}
	
	/**
	 * Returns the id of this Tile
	 * @return
	 */
	
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 */
	
	public abstract boolean isWalkableFor(Entity a);
	
}
