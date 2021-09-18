package MiniCad;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class DrawingPanel extends JPanel{
	StatusBar statusBar;
	String shapeType="";
	String tooltype = "";
	String ghi="";
	Color color = Color.BLACK;
	Color colordraw =  Color.WHITE;
	int size=1;
	AShape lastShape;
	static List<AShape> shapes;
	public DrawingPanel(StatusBar statusBar) {
		this.setBackground(colordraw);
		this.statusBar = statusBar;
		shapes = new ArrayList<AShape>();
		
		MouseAdapter  mouse= new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				switch (shapeType) {
				case "C": lastShape = new Circle(e.getX(),e.getY(), color, size);
					shapes.add(lastShape);
					break;
				case "L": lastShape = new Line(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "R": lastShape = new Rectangle(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "O": lastShape = new Oval(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "T": lastShape = new Triangle(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "H": lastShape = new Hexagon(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "P": lastShape = new Pentagon(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "F": lastShape = new Star(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "Rec": lastShape = new FillRec(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "Oval": lastShape = new FillOval(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "Cir": lastShape = new FillCir(e.getX(), e.getY(), color,size);
					shapes.add(lastShape);
					break;
				case "M": lastShape.setSecondPoint(e.getX(), e.getY());
				 
				}					
				repaint();
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				lastShape.setSecondPoint(e.getX(), e.getY());
				repaint();
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				boolean started=true;
				statusBar.setLabel("   "+e.getX() + "," + e.getY() + "px     ");
				setBackground(colordraw);
				repaint();
			}
		};
		
		addMouseListener(mouse);
		addMouseMotionListener(mouse);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(AShape sh:shapes) sh.draw(g);
	}
	
	public void setShapeType(String type) {
		this.shapeType = type;
		
		switch (type) {
		case "L": this.statusBar.setMessage("Line");
			break;
		case "C": this.statusBar.setMessage("Cricle");
			break;
		case "R": this.statusBar.setMessage("Rectangle");
			break;
		case "O": this.statusBar.setMessage("Oval");
			break;
		case "T": this.statusBar.setMessage("Triangle");
			break;
		case "H": this.statusBar.setMessage("Hexagon");
			break;
		case "P": this.statusBar.setMessage("Pentagon");
			break;
		case "M": this.statusBar.setMessage("Move");
		 	break;
		case "Rec": this.statusBar.setMessage("Fill Rectangle");
	 		break;
		case "Oval": this.statusBar.setMessage("Fill Oval");
	 		break;
		case "Cir": this.statusBar.setMessage("Fill Circle");
	 		break;
	 		
		}
	}
	
}
