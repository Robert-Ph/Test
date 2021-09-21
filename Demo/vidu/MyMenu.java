package vidu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu extends JMenuBar {
	public MyMenu() {
		JMenu file = new JMenu("File");
		JMenu about = new JMenu("About");
		
		JMenuItem jnew = new JMenuItem("New");
		file.add(jnew);
		JMenuItem help = new JMenuItem("Help");
		about.add(help);
		
		this.add(file);
		this.add(about);
	}
}
