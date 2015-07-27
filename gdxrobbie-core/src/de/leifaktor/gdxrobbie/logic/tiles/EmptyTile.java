package de.leifaktor.gdxrobbie.logic.tiles;

import de.leifaktor.gdxrobbie.entity.Entity;

public class EmptyTile extends Tile {

	public EmptyTile(int id) {
		super(id);
	}
	
	/**
	 * The Empty tile is walkable for every actor
	 */

	@Override
	public boolean isWalkableFor(Entity a) {
		return true;
	}


}
