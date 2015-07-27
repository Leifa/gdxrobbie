package de.leifaktor.gdxrobbie.logic.tiles;

import de.leifaktor.gdxrobbie.entity.Entity;

public class Mauer extends Tile {

	public Mauer(int id) {
		super(id);
	}

	@Override
	public boolean isWalkableFor(Entity a) {
		return false;
	}

	
	
}
