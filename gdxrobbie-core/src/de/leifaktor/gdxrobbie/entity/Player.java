package de.leifaktor.gdxrobbie.entity;

import de.leifaktor.gdxrobbie.logic.Room;

public class Player extends Entity {

	public Player(Room r, int x, int y, int z) {
		super(r, x, y, z);
	}

	@Override
	public void update() {
		if (state == WALKING) {
			keepWalking();
		}
		if (state == WALKING_FINISHED) {
			
		}
		
	}


}
