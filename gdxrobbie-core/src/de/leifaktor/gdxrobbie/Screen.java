package de.leifaktor.gdxrobbie;

public abstract class Screen {
	
	public abstract void update();
	
	/**
	 * @param alpha Der bereits vergangene Zeitanteil, seit dem letzten Tick bis zum nächsten.
	 */
	
	public abstract void render(float alpha);
	
	public abstract void dispose();

}
