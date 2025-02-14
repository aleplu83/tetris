package main;

import java.awt.Color;

import javax.swing.JFrame;

public class MainWindow {

	private JFrame window;
	private Board board;
	
	public MainWindow() {
		// TODO Auto-generated constructor stub
		window = new JFrame("Tetris");
		board = new Board();
		window.add(board);
		board.setBackground(Color.BLACK);
		window.setSize(500, 800);
		window.setLocation(700, 200);
		window.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainWindow();
	}

}
