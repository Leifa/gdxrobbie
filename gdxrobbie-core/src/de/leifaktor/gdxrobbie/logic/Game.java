package de.leifaktor.gdxrobbie.logic;

import de.leifaktor.gdxrobbie.entity.Player;

/**
 * The main class of the game logic.
 * @author leif
 *
 */

public class Game {

	private Episode episode;
	private Room currentRoom;
	private Player player;
	
	public Game(Episode e) {
		this.episode = e;
	}
	
	
	
	public void reset() {
		currentRoom = episode.getStartingPosition().room;
		player = new Player(currentRoom, episode.getStartingPosition().x, episode.getStartingPosition().y);
	}
	
	private void initRoom() {
		currentRoom.onEnter();
	}
	
	public void update() {

	}
	
	public void load() {
		
	}
	
	public void save() {
		
	}
	
}
