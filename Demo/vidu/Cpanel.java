package vidu;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class Cpanel extends JPanel {
	public Cpanel() {
		this.setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);
		JScrollBar bar1 = new JScrollBar(JScrollBar.HORIZONTAL);
		JScrollBar bar2 = new JScrollBar(JScrollBar.VERTICAL);
		
		bar1.setMaximum(1000);
		bar1.setMinimum(10);
		bar2.setMaximum(1000);
		bar2.setMinimum(10);
		
		this.add(bar2, BorderLayout.EAST);
		this.add(bar1, BorderLayout.SOUTH);
		
	}
}
