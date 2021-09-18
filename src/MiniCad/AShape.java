package MiniCad;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class AShape {
	protected Point location;
	protected Color color;
	protected int size;
	
	public AShape(int x, int y, Color color2,int size2) {
		this.location = new Point(x,y);
		this.color = color2;
		this.size = size2;
	}

	public abstract void  setSecondPoint(int x, int y);
	public abstract void draw(Graphics g);
}
