package de.leifaktor.gdxrobbie.editor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import de.leifaktor.gdxrobbie.logic.Room;

public class RoomView extends JPanel {	

	private Room currentRoom;
	private int tileSize = 16;

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());

		if (currentRoom != null) {
			// Draw Grid
			int width = currentRoom.getWidth();
			int height = currentRoom.getHeight();

			for (int i = 0; i < currentRoom.getWidth()+5; i++) {
				g.setColor(Color.GRAY);
				if (i == 2 || i == width + 5 - 3) g.setColor(Color.BLACK);
				g.drawLine(i*tileSize, 0, i*tileSize, (currentRoom.getHeight()+4)*tileSize);
			}
			for (int i = 0; i < height+5; i++) {
				g.setColor(Color.GRAY);
				if (i == 2 || i == height + 5 - 3) g.setColor(Color.BLACK);
				g.drawLine(0, i*tileSize, (currentRoom.getWidth()+4)*tileSize, i*tileSize);
			}
		}


	}	

	public void setRoom(Room r) {
		Dimension d = new Dimension(r.getWidth()*16, r.getHeight()*16);
		this.setPreferredSize(d);
		this.setMinimumSize(d);
		this.setMaximumSize(d);
		this.currentRoom = r;

	}



}
