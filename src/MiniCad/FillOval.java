package MiniCad;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class FillOval extends AShape {
	int widtht, heigtht;
	public FillOval(int x, int y, Color color2, int size2) {
		super(x, y, color2, size2);
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
		g2D.fillOval(location.x,location.y, widtht, heigtht);
	}

}
