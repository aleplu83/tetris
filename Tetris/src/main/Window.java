package main;

import java.awt.Color;

import javax.swing.JFrame;

public class Window {

	private JFrame window;
	private Board board;
	
	public Window() {
		window = new JFrame("Tetris");
		board = new Board();
		window.add(board);
		board.setBackground(Color.BLACK);
		window.setSize(500, 800);
		window.setLocation(700, 100);
		window.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		new Window();
	}

}
