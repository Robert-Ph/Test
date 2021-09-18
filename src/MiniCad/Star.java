package MiniCad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Star extends AShape{
	Point secondPoint;
	int x1,x2,x3,x4,x5,x6,x7,x8,x9;
	int y1,y2,y3,y4,y5,y6,y7,y8,y9;
	public Star(int x, int y, Color color,int size) {
		super(x, y, color,size);
	
		secondPoint = new Point(x, y);
	}

	
	@Override
	public void setSecondPoint(int x, int y) {
		
		this.secondPoint.setLocation(x,y);
		
	}

	@Override
	public void draw(Graphics g) {
	
		Graphics2D g2D = (Graphics2D) g;
		g2D.setPaint(color);
		g2D.setStroke(new BasicStroke(size));
		x9=location.x;
		y9=(int) Math.abs(location.y + (secondPoint.y - location.y)/3);
		
		x1 = (int) Math.abs(x9 + (secondPoint.x - y9)/5);
		y1 = secondPoint.y;
		
		x2 = (int) Math.abs(secondPoint.x + (secondPoint.x - y9)/5);
		y2 = y9;
		
		x3 = (int) Math.abs(x9 + ((x2 - x9)/6)*3);
		y3 = (int) Math.abs(y9 - (secondPoint.y - y9)/2);
		
		x4=(int) Math.abs(x3 - (x3 - x9)/4);
		y4=(int) y9 ;
		
		x5=(int) Math.abs(x3 + (x3 - x9)/4);;
		y5=(int) y9 ;
		
		x6=(int) Math.abs(secondPoint.x - ((secondPoint.x - x3)/5)*2);
		y6=(int) Math.abs(y9 + ((secondPoint.y - y9)/48)*19 );
		
		x7=x3;
		y7=(int) Math.abs(secondPoint.y - ((secondPoint.y - y9)/48)*19);
		
		x8=(int)  Math.abs(x1 + ((secondPoint.x - x3)/5)*2);
		y8=(int) Math.abs(y9 + ((secondPoint.y - y9)/48)*19 );
		
		
		g2D.drawLine(x9, y9, x8, y8);
		g2D.drawLine(x9, y9, x4, y4);
		g2D.drawLine(secondPoint.x, secondPoint.y, x6, y6);
		g2D.drawLine(secondPoint.x, secondPoint.y, x7, y7);
		
		g2D.drawLine(x1, y1, x8, y8);
		g2D.drawLine(x1, y1, x7, y7);
		
		g2D.drawLine(x3, y3, x4, y4);
		g2D.drawLine(x3, y3, x5, y5);
		g2D.drawLine(x2, y2, x5, y5);
		g2D.drawLine(x2, y2, x6, y6);
		
	}


	

}
