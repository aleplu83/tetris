package main;

import java.awt.Color;
import java.awt.Point;

public class Brick {

	private Point position;
	private Color color;
	private Color[] colors = {Color.YELLOW,Color.BLUE,Color.RED,Color.MAGENTA};
	
	public Brick() {
		color = rndColor();
		position = new Point(250,400);
	}
	
	public void rotate() {
		
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void moveLeft() {
		
	}
	
	public void moveRight() {
		
	}
	
	private Color rndColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

}
