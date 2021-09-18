package MiniCad;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JToolBar;

public class WestToolBar extends JToolBar {
	DrawingPanel drawingPanel;
	public WestToolBar(DrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel;
		JButton button;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String com = e.getActionCommand();
				drawingPanel.setShapeType(com);
			}
		};
		
		
		
		button = new JButton(new ImageIcon("ImageIcon\\mous.png"));
		button.setToolTipText(" Move Tool ");
		button.addActionListener(action);
		button.setActionCommand("M");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\xoa.png"));
		button.setToolTipText(" ");
		button.addActionListener(action);
		button.setActionCommand("X");
		add(button);
		
		button = new JButton( new ImageIcon("ImageIcon\\cut.png"));
		button.setToolTipText("Cut ");
		button.addActionListener(action);
		button.setActionCommand("U");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\coppy.png"));
		button.setToolTipText("Copy ");
		button.addActionListener(action);
		button.setActionCommand("C");
		add(button);
		
		button = new JButton( new ImageIcon("ImageIcon\\del.png"));
		button.setToolTipText(" Delete ");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drawingPanel.shapes.clear();
			}
		});
		add(button);
		
		button = new JButton( new ImageIcon("ImageIcon\\button_zoomax.gif"));
		button.setToolTipText(" Zoom (+)");
		button.addActionListener(action);
		button.setActionCommand("+");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\button_zoomin.gif"));
		button.setToolTipText(" Zoom (-)");
		button.addActionListener(action);
		button.setActionCommand("-");
		add(button);
		
		
		
		
	}

}
