package de.leifaktor.gdxrobbie.graphics;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Animation {
	
	/**
	 * Die Frames der Animation
	 */
	
	private TextureRegion[] frames;
	
	/**
	 * Das aktuelle Frame
	 */
	
	private int currentFrame;
	
	/**
	 * Anzahl ms die von einem Frame zum nächsten vergehen
	 */
	
	private float speed;
	
	/**
	 * Der Akkumulator zählt, wieviel Zeit seit dem letzten Frame vergangen ist
	 */
	
	private float accu;
	
	/**
	 * Erzeugt neue Animation
	 */
	
	public Animation(TextureRegion[] frames, float speed) {
		this.frames = frames;
		this.speed = speed;
		reset();
	}
	
	/**
	 * Die Animation wird fortgesetzt
	 * @param delta Zeit
	 */
	
	public void update(float delta) {
		accu += delta;
		while (accu >= speed) {
			accu -= speed;
			currentFrame++;
			currentFrame %= frames.length;
		}
	}
	
	/**
	 * Die Animation wird auf den Anfang gesetzt
	 */
	
	public void reset() {
		currentFrame = 0;
		accu = 0;
	}
	
	/**
	 * Das aktuelle Frame wird zurückgegeben
	 * @return
	 */
	
	public TextureRegion getCurrentFrame() {
		return frames[currentFrame];
	}

}
