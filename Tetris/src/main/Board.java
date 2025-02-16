package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Board extends JPanel implements Runnable,KeyListener {

	private Brick currentBrick;
	
	public Board() {
		// TODO Auto-generated constructor stub
		
		setFocusable(true);
		requestFocus();
		addKeyListener(this);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	private void drawBrick(Graphics g) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		switch (e.getKeyCode()) {
		case 39: // right-key
			//snake.goEast();
			break;
		case 37: // left-key
			//snake.goWest();
			break;
		case 32: // rotate brick on spacebar press
			currentBrick.rotate();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
