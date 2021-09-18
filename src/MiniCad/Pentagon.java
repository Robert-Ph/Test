package MiniCad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Pentagon extends AShape {
	Point secondPoint;
	int x1,x2,x3,y1,y2,y3,x4,y4;

	public Pentagon(int x, int y, Color color,int size) {
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
		x4=location.x;
		y4=(int) Math.abs(location.y + (secondPoint.y - location.y)/3);
		
		x1 = (int) Math.abs(x4 + (secondPoint.x - y4)/5);
		y1 = secondPoint.y;
		
		x2 = (int) Math.abs(secondPoint.x + (secondPoint.x - y4)/5);
		y2 = y4;
		
		x3 = (int) Math.abs(x4+((x2 - x4)/6)*3);
		y3 = (int) Math.abs(y4 - (secondPoint.y - y4)/2);
		
		g2D.drawLine(x4, y4, x1, y1);
		g2D.drawLine(secondPoint.x, secondPoint.y, x1, y1);
		g2D.drawLine(secondPoint.x, secondPoint.y, x2, y2);
		g2D.drawLine(x4, y4, x3, y3);
		g2D.drawLine(x2, y2, x3, y3);
		
		
		
		
	}


}
