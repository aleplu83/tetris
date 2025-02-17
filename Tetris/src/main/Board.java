package main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Board extends JPanel implements Runnable,KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Brick brick;
	private Thread thread;
	
	public Board() {
		// TODO Auto-generated constructor stub
		
		setFocusable(true);
		requestFocus();
		addKeyListener(this);
		//create first brick
		brick = new Brick();
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			brick.fall();
			repaint();
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		drawBrick(g);
	}

	private void drawBrick(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		switch (brick.getShape()) {
		case EShape:
			g2d.setColor(brick.getColor());
			g2d.fillRect(brick.getPosition().x,brick.getPosition().y, 20, 20);
			break;
		}
		
		
		g2d.dispose();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		switch (e.getKeyCode()) {
		case 39: // right-key
			brick.moveRight();
			break;
		case 37: // left-key
			brick.moveLeft();
			break;
		case 32: // rotate brick on spacebar press
			brick.rotate();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
