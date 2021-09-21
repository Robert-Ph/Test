package vidu;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Wpanel extends JPanel {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	public Wpanel() {
		this.setLayout(new GridLayout(5,2,5,5));
		this.setBackground(Color.green);
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b10 = new JButton("10");
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b10);
		
	}
}
