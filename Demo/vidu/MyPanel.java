package vidu;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	Wpanel epanel;
	Cpanel cpanel;
	Spanel spanel;
	public MyPanel() {
		this.setLayout(new BorderLayout());
		epanel = new Wpanel();
		cpanel = new Cpanel();
		spanel = new Spanel();
		
		this.add(cpanel, BorderLayout.CENTER);
		this.add(epanel, BorderLayout.WEST);
		this.add(spanel, BorderLayout.SOUTH);
		
	}
}
