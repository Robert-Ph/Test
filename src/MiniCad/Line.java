package MiniCad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Line extends AShape{
	Point secondPoint;
	int x1,y1;
	public Line(int x, int y, Color color,int size) {
		super(x, y, color,size);
		secondPoint = new Point(x, y);
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
		g2D.drawLine(location.x, location.y,secondPoint.x,secondPoint.y);
	}

	

}
