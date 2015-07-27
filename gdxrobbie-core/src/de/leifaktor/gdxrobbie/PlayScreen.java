package de.leifaktor.gdxrobbie;

import de.leifaktor.gdxrobbie.entity.Entity;
import de.leifaktor.gdxrobbie.graphics.RoomRenderer;
import de.leifaktor.gdxrobbie.logic.Room;

public class PlayScreen extends Screen {
	
	private Room currentRoom;
	private RoomRenderer render;
	
	public PlayScreen() {
		render = new RoomRenderer();
	}

	@Override
	public void update() {
		for (Entity a: currentRoom.getActors()) {
			a.update();
		}
	}

	@Override
	public void render(float alpha) {
		render.render(currentRoom);
	}

	@Override
	public void dispose() {
		
	}

}
