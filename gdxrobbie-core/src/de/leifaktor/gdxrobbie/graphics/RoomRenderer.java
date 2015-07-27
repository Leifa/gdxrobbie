package de.leifaktor.gdxrobbie.graphics;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.leifaktor.gdxrobbie.logic.Room;

public class RoomRenderer {
	
	SpriteBatch sb;
	
	public RoomRenderer() {
		sb = new SpriteBatch();
	}
	
	public void render(Room r) {
		for (int x = 0; x < r.getWidth(); x++) {
			for (int y = 0; y < r.getHeight(); y++) {
				// RENDER
			}
		}
	}

}
