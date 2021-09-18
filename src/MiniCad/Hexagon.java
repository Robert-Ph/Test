package MiniCad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Hexagon extends AShape {
	Point secondPoint;
	int x1,x2,x3,x4,y1,y2,y3,y4,x5,y5;
	public Hexagon(int x, int y, Color color,int size) {
		super(x, y, color, size);
		secondPoint = new Point(x,y);
		
	}

	@Override
	public void setSecondPoint(int x, int y) {
		
		this.secondPoint.setLocation(x, y);
	}

	@Override
	public void draw(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.setPaint(color);
		g2D.setStroke(new BasicStroke(size));
		
		x1=location.x;
		y1=(int) Math.abs(location.y + (secondPoint.y - location.y)/3);
		
		x2 = location.x;
		y2 = secondPoint.y;
		
		x3 = secondPoint.x;
		y3 = (int) Math.abs(location.y + (secondPoint.y - location.y)/3);
		
		x4 = (int) Math.abs(location.x+(x3 - location.x)/2);
		y4 = (int) location.y ;
		
		x5 = x4;
		y5 = (int) Math.abs(y2 +  (secondPoint.y - y1)/2);
		
		
		g2D.drawLine(x1, y1, x2, y2);
		g2D.drawLine(secondPoint.x, secondPoint.y, x3, y3);
		g2D.drawLine(x1, y1, x4, y4);
		g2D.drawLine(x3, y3, x4, y4);
		g2D.drawLine(secondPoint.x, secondPoint.y, x5, y5);
		g2D.drawLine(x2, y2, x5, y5);
	}

}
