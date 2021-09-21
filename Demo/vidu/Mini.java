package vidu;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Mini extends JFrame {
	MyMenu menu;
	MyPanel panel;
	public Mini() {
		menu = new MyMenu();
		panel = new MyPanel();
		
		this.add(menu, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		this.setSize(600, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Mini();
	}
}
