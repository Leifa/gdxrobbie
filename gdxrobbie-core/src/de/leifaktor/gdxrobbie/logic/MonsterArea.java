package de.leifaktor.gdxrobbie.logic;

/**
 * Die Klasse stellt einen Bereich dar, in dem beim Betreten eines Raumes Monster spawnen können.
 * @author leif
 *
 */

public class MonsterArea {
	
	/**
	 * X-Koordinate der oberen linken Ecke
	 */

	public int x;
	
	/**
	 * Y-Koordinate der oberen linken Ecke
	 */
	
	public int y;
	
	/**
	 * Breite des Bereichs
	 */
	
	public int width;
	
	/**
	 * Höhe des Bereichs
	 */
	
	public int height;
	
	/**
	 * Die Mindestzahl an Monstern, die gespawnt werden
	 */
	
	public int minNumber;
	
	/**
	 * Die Höchstanzahl an Monstern, die gespawnt werden
	 */
	
	public int maxNumber;
	
}
