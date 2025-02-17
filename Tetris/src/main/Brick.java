package main;

import java.awt.Color;
import java.awt.Point;

public class Brick {

	private Point position;
	private Color color;
	private Color[] colors = {Color.YELLOW,Color.BLUE,Color.RED,Color.MAGENTA};
	private Shape[] shapes = {Shape.EShape,Shape.IShape,Shape.LShape,Shape.ZShape};
	private Shape shape;
	
	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}

	public Brick() {
		setColor(rndColor());
		setPosition(new Point(230,40));
		//setShape(shapes[((int)Math.random() * shapes.length)]);
		setShape(Shape.EShape);
		System.out.println(getShape().toString());
	}
	
	/**
	 * @param shape the shape to set
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Point position) {
		this.position = position;
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
		position.x-=20;
	}
	
	public void moveRight() {
		position.x+=20;
	}
	
	private Color rndColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	/**
	 * @return the position
	 */
	public Point getPosition() {
		return position;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	public void fall() {
		// TODO Auto-generated method stub
		position.y+=20;
	}
	
	

}
