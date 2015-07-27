package de.leifaktor.gdxrobbie.graphics;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Art {
	
	public static TileSet tileset = new TileSet("tileset.png");
	
	public static final TextureRegion LEER = tileset.getTileImage(0,0);
	
	public static final TextureRegion[] MAUER = tileset.getTileImages(1,0,5);
	public static final TextureRegion[] STAHLMAUER = tileset.getTileImages(6,0,5);	
	public static final TextureRegion[] SAND = tileset.getTileImages(11,0,5);
	public static final TextureRegion TRAP = tileset.getTileImage(0,1);	
	public static final TextureRegion PFEILE_LR = tileset.getTileImage(1,1);
	public static final TextureRegion PFEILE_OU = tileset.getTileImage(2,1);	
	public static final TextureRegion GITTER = tileset.getTileImage(3,1);	
	public static final TextureRegion[] TUNNEL = tileset.getTileImages(4,1,4);	
	public static final TextureRegion[] WASSER = tileset.getTileImages(8,1,5);
	public static final TextureRegion SCORE_GATE = tileset.getTileImage(13, 1);	
	
	public static final TextureRegion[] DOORS = tileset.getTileImages(0,2,16);	
	public static final TextureRegion[] KEYS = tileset.getTileImages(0, 4, 16);
	
	public static final TextureRegion PLAYER = tileset.getTileImage(0, 7);
	public static final TextureRegion[] PLAYER_WALKING = tileset.getTileImages(1, 7, 2);
	public static final TextureRegion PLAYER_BLAU = tileset.getTileImage(3, 7);
	public static final TextureRegion[] PLAYER_BLAU_WALKING = tileset.getTileImages(4, 7, 2);
	
	public static final TextureRegion[][] ROBOT = tileset.getTileImageSeries(2, 6, 2, 7);
	public static final TextureRegion[] EXPLOSION = tileset.getTileImages(6, 7, 5);
	
	public static final TextureRegion[] WALD = tileset.getTileImages(0,8,7);
	public static final TextureRegion WALDBODEN = tileset.getTileImage(7,8);
	public static final TextureRegion KIES = tileset.getTileImage(8,8);
	public static final TextureRegion[] ROCKS = tileset.getTileImages(9,8,6);
	
	public static final TextureRegion[] PYRAMIDE = tileset.getTileImages(0, 9, 9);
	
	public static final TextureRegion LETTER_BACKGROUND = tileset.getTileImage(9, 9);	
	
	public static final TextureRegion ELEKTROZAUN = tileset.getTileImage(0, 10);
	public static final TextureRegion GOLD = tileset.getTileImage(1, 10);
	public static final TextureRegion SAEURE = tileset.getTileImage(2, 10);
	public static final TextureRegion BLAUMANN = tileset.getTileImage(3, 10);	
	public static final TextureRegion SCHLEUDER = tileset.getTileImage(4, 10);
	public static final TextureRegion PLATIN = tileset.getTileImage(5, 10);
	public static final TextureRegion[] ARROWS = tileset.getTileImages(6, 10,4);
	public static final TextureRegion[] MAGNETEN = tileset.getTileImages(10, 10,2);
	public static final TextureRegion NOTIZ = tileset.getTileImage(12, 10);
	public static final TextureRegion ISOLATOR = tileset.getTileImage(13, 10);
	public static final TextureRegion WALK_ISOLATOR = tileset.getTileImage(14, 10);
	public static final TextureRegion BUCH = tileset.getTileImage(15, 10);
	
	public static final TextureRegion[] BULLETS = tileset.getTileImages(0, 11,6);
	public static final TextureRegion AUSRUFEZEICHEN = tileset.getTileImage(6, 11);
	public static final TextureRegion LEBENSELEXIER = tileset.getTileImage(7, 11);
	public static final TextureRegion SPEICHERUHR = tileset.getTileImage(8, 11);
	public static final TextureRegion FRAGEZEICHEN = tileset.getTileImage(9, 11);
	public static final TextureRegion SKATEBOARD = tileset.getTileImage(11, 11);
	public static final TextureRegion TRAMPOLIN = tileset.getTileImage(12, 11);

}
