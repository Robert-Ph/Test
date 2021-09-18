package MiniCad;


import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MiniCad extends JFrame{
	ToolBar toolBar;
	DrawingPanel drawingPanel;
	StatusBar statusBar;
	
	public MiniCad() {
		setTitle("MiniCad");
		ImageIcon image = new ImageIcon("ImageIcon\\logo.jpg");
		
		statusBar = new StatusBar();
		drawingPanel = new DrawingPanel(statusBar);
		toolBar = new ToolBar(drawingPanel);
		
		getContentPane().add(new MyMenuBar(drawingPanel));
		setJMenuBar(new MyMenuBar(drawingPanel));
		getContentPane().add(toolBar, BorderLayout.NORTH);
		getContentPane().add(drawingPanel, BorderLayout.CENTER);
		getContentPane().add(statusBar, BorderLayout.SOUTH);
		getContentPane().add(new WestToolBar(drawingPanel), BorderLayout.WEST);
		
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setIconImage(image.getImage());
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new MiniCad();

	}

}
