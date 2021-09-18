package MiniCad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.math.*;

public class Rectangle extends AShape {

		Point secondPoint;
		int widtht, heigtht,x1,y1;
	public Rectangle(int x, int y, Color color,int size) {
		super(x, y, color,size);
		secondPoint = new Point(x, y);
	}
	

	@Override
	public void setSecondPoint(int x, int y) {	
			widtht =(int) Math.abs(x - location.x);
			heigtht =(int)  Math.abs(y - location.y);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.setPaint(color);
		g2D.setStroke(new BasicStroke(size));
		g2D.drawRect(location.x,location.y, widtht, heigtht);
	}




}
