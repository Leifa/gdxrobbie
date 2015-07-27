package de.leifaktor.gdxrobbie.logic.tiles;

import de.leifaktor.gdxrobbie.entity.Entity;

public class Door extends Tile {

	public Door(int id) {
		super(id);
	}

	@Override
	public boolean isWalkableFor(Entity a) {
		// TODO depends on the inventory
		return false;
	}

}
