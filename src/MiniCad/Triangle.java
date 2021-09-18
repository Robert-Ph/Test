package MiniCad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Triangle extends AShape {
	Point secondPoint;
	int x1,y1,x2,y2;
	public Triangle(int x, int y, Color color,int size) {
		super(x, y, color,size);
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
		x1= location.x;
		y1 = secondPoint.y;
		x2=(int) Math.abs(location.x + (secondPoint.x - location.x)/2);
		y2=location.y;
		int[] x = {x1,x2,secondPoint.x};
		int[] y = {y1,y2,secondPoint.y};
		
		g2D.drawPolygon(x, y, 3);
	}


}
