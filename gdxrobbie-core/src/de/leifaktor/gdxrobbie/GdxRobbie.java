package de.leifaktor.gdxrobbie;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import de.leifaktor.gdxrobbie.io.IO;
import de.leifaktor.gdxrobbie.logic.Episode;
import de.leifaktor.gdxrobbie.logic.Floor;
import de.leifaktor.gdxrobbie.logic.Room;

public class GdxRobbie extends ApplicationAdapter {
	
	FPSLogger fps = new FPSLogger();
	
	ScreenManager sm;
	
	Episode episode;
	Room room;
	
	float accumulator;
	float tickLength = 1f / 60f;
	

	SpriteBatch sb;
	
	@Override
	public void create () {
		Gdx.app.setLogLevel(Gdx.app.LOG_DEBUG);
		
		sm = new ScreenManager();
		sm.push(new PlayScreen());
		
		accumulator = 0f;
		
		// Just a dummy episode
		Episode episode = new Episode(16,9);
		episode.setName("MOIN");
		Floor f = new Floor(3,3);
		Floor f2 = new Floor(2,2);
		episode.getFloors().add(f);
		episode.getFloors().add(f2);
		room = new Room(episode.getRoomWidth(),episode.getRoomHeight(),f,2,2);
		room.setName("Die Kammer des Schreckens");
		f.setRoom(2, 2, room);
		
		// Test for saving and loading
		IO.saveToFile(episode, "test.txt");
		episode = IO.loadFromFile("test.txt");
		IO.saveToFile(episode, "test2.txt");
		
		sb = new SpriteBatch();
	}

	@Override
	public void render () {
		accumulator += Gdx.graphics.getDeltaTime();
		while (accumulator >= tickLength) {
			sm.peek().update();
			accumulator -= tickLength;
		}
		
		Gdx.gl20.glClearColor(0, 0, 0, 1);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
		
		sm.peek().render(Gdx.graphics.getDeltaTime());
		fps.log();		
	}
}
