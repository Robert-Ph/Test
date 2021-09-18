package MiniCad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends AShape {
	int radius;
	public Circle(int x, int y, Color color, int size) {
		super(x, y, color,size);
		radius = 1;
	}
	

	@Override
	public void draw(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.setPaint(color);
		g2D.setStroke(new BasicStroke(size));
		g2D.drawOval(location.x-radius, location.y-radius, 2*radius,2*radius);
	}


	@Override
	public void setSecondPoint(int x, int y) {
		radius = (int) Math.sqrt((location.x-x)*(location.x-x) + (location.y-y)*(location.y-y));		
	}


	

}
