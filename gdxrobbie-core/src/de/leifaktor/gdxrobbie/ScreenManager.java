package de.leifaktor.gdxrobbie;

import java.util.Stack;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ScreenManager {

	private Stack<Screen> screens;
	
	public ScreenManager() {
		screens = new Stack<Screen>();
	}
	
	public void push(Screen gs) {
		screens.push(gs);
	}
	
	public Screen peek() {
		return screens.peek();
	}
	
	public void pop() {
		screens.pop();
	}
	
	public void set(Screen gs) {
		screens.peek().dispose();
		screens.pop();
		screens.push(gs);
	}
	
	public void update() {
		screens.peek().update();
	}
	
	public void render(float alpha) {
		screens.peek().render(alpha);
	}
	
}
