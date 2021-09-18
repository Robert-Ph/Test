package MiniCad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class FillRec extends AShape {
	Point secondPoint;
	int widtht, heigtht,x1,y1;
	public FillRec(int x, int y, Color color2, int size2) {
		super(x, y, color2, size2);
		this.secondPoint = new Point(x,y);
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
		g2D.fillRect(location.x,location.y, widtht, heigtht);
	}

}
