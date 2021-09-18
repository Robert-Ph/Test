package MiniCad;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
public class StatusBar extends JPanel{
	JLabel status, label;
	public StatusBar() {
		setBackground(Color.LIGHT_GRAY);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setLayout(new BorderLayout());
		
		label = new JLabel("     0,0 px            ");
		add(label, BorderLayout.WEST);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		add(slider, BorderLayout.EAST);
		
		status = new JLabel("    ready...");
		add(status);

	}
	
	public void setMessage(String text) {
		this.status.setText(text);
	}
	
	public void setLabel(String text) {
		this.label.setText(text);
	}
	
}
