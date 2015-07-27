package de.leifaktor.gdxrobbie.editor;

import java.awt.Dimension;

import javax.swing.JFrame;

import de.leifaktor.gdxrobbie.logic.Episode;

public class MainWindow extends JFrame {
	
	private static final String TITLE = "ROBBIE - Der Robot-Editor";
	
	private Episode episode;

	public static void main(String[] args) {
		MainWindow w = new MainWindow();
		w.setVisible(true);
		Episode e = new Episode(16,9);
		w.setEpisode(e);		
	}
	
	public MainWindow() {
		this.add(new RoomView());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(TITLE);
		this.setPreferredSize(new Dimension(400,400));
		this.setMinimumSize(new Dimension(400,400));
		this.pack();
		this.setLocationRelativeTo(null);
		
	}
	
	public void setEpisode(Episode e) {
		this.episode = e;
	}
	
}
