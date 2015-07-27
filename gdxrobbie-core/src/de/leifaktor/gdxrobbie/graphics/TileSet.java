package de.leifaktor.gdxrobbie.graphics;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TileSet {
	
	private Texture tileset;
	private int tileSize;
	
	public TileSet(String filename) {
		tileset = new Texture(filename);
		
		// The tileSize is determined by the width of the picture. There
		// are 16 Tiles from left to right.
		tileSize = tileset.getWidth() / 16;
	}
	
	/**
	 * Gibt das Bild an der Stelle (x,y) zurück
	 * @param x
	 * @param y
	 * @return
	 */
	
	public TextureRegion getTileImage(int x, int y) {
		return new TextureRegion(tileset,x*tileSize, y*tileSize, tileSize, tileSize);
	}
	
	/**
	 * Gibt number viele Bilder, angefangen bei (x,y) zurück
	 * @param x
	 * @param y
	 * @param number
	 * @return
	 */
	
	public TextureRegion[] getTileImages(int x, int y, int number) {
		int i = x;
		int j = y;
		TextureRegion[] result = new TextureRegion[number];
		for (int k = 0; k < number; k++) {
			result[k] = getTileImage(i,j);
			i++;
			if (i == 16) {
				i = 0;
				j++;
			}
		}
		return result;
	}
	
	/**
	 * Gibt number viele Arrays der Größe size zurück, angefangen bei (x,y)
	 * @param x
	 * @param y
	 * @param size
	 * @param number
	 * @return
	 */
	
	public TextureRegion[][] getTileImageSeries(int x, int y, int size, int number) {
		TextureRegion[][] images = new TextureRegion[number][];
		for (int i = 0; i < number; i++) {
			images[i] = getTileImages(x,y,size);
			x+=size;
			while (x >= 16) {
				x-=16;
				y++;
			}
		}
		return images;
	}

}
