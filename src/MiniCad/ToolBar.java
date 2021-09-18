package MiniCad;
import java.awt.Color;import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ToolBar extends JToolBar{
	DrawingPanel drawingPanel;
	public ToolBar(DrawingPanel drawingPanel) {
		JButton button, buttoncolor;
		this.drawingPanel = drawingPanel;
		
		ActionListener action = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				String com = e.getActionCommand();
				drawingPanel.setShapeType(com);
			}
		};
		button = new JButton(new ImageIcon("ImageIcon\\past.png"));
		button.setToolTipText("Pasts" ) ;
		button.addActionListener(action);
		button.setActionCommand("");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\pencil.png"));
		button.setToolTipText("Pencil" ) ;
		button.addActionListener(action);
		button.setActionCommand("I");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\line.png"));
		button.setToolTipText("line");
		button.addActionListener(action);
		button.setActionCommand("L");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\pentagon.png"));
		button.setToolTipText("Pentagon");
		button.addActionListener(action);
		button.setActionCommand("P");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\rectangle.png"));
		button.setToolTipText(" Rectangle ");
		button.addActionListener(action);
		button.setActionCommand("R");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\circle.png"));
		button.setToolTipText(" circle ");
		button.addActionListener(action);
		button.setActionCommand("C");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\triangle.png"));
		button.setToolTipText(" Triangle ");
		button.addActionListener(action);
		button.setActionCommand("T");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\hexagon.png"));
		button.setToolTipText(" Hexagon ");
		button.addActionListener(action);
		button.setActionCommand("H");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\oval.png"));
		button.setToolTipText(" Oval ");
		button.addActionListener(action);
		button.setActionCommand("O");
		add(button);
		
		button = new JButton(new ImageIcon("ImageIcon\\star.png"));
		button.setToolTipText(" Star ");
		button.addActionListener(action);
		button.setActionCommand("F");
		add(button);
		
		JButton button1 = new JButton();
		button1.setBackground(Color.black);
		add(button1);
		
		
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(2,5));
		add(panel);
		
		JButton button_E1 = new JButton();
		button_E1.setBackground(new Color(0,0,0));
		button_E1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(0,0,0));
				drawingPanel.color = new Color(0,0,0);
			}
		});
		panel.add(button_E1);
		
		JButton button_W = new JButton();
		button_W.setBackground(new Color(128,128,128));
		button_W.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(128,128,128));
				drawingPanel.color = new Color(128,128,128);
			}
		});
		panel.add(button_W);
		
		JButton button_E = new JButton();
		button_E.setBackground(new Color(128,0,0));
		button_E.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(128,0,0));
				drawingPanel.color = new Color(128,0,0);
			}
		});
		panel.add(button_E);
		
		JButton button_R = new JButton();
		button_R.setBackground(new Color(255,0,0));
		button_R.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(255,0,0));
				drawingPanel.color = new Color(255,0,0);
			}
		});
		panel.add(button_R);
		JButton button_B = new JButton();
		button_B.setBackground(new Color(255,128,0));
		button_B.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(255,128,0));
				drawingPanel.color = new Color(255,128,0);
			}
		});
		panel.add(button_B);
		
		JButton button_R1 = new JButton();
		button_R1.setBackground(new Color(0,128,0));
		button_R1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(0,128,0));
				drawingPanel.color = new Color(0,128,0);
			}
		});
		panel.add(button_R1);
		
		JButton button_B1 = new JButton();
		button_B1.setBackground(new Color(0,0,255));
		button_B1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(0,0,255));
				drawingPanel.color = new Color(0,0,255);
			}
		});
		panel.add(button_B1);
		
		JButton button_R23 = new JButton();
		button_R23.setBackground(new Color(255,255,0));
		button_R23.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(255,255,0));
				drawingPanel.color = new Color(255,255,0);
			}
		});
		panel.add(button_R23);
		
		JButton button_R2 = new JButton();
		button_R2.setBackground(new Color(255,255,255));
		button_R2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(255,255,255));
				drawingPanel.color = new Color(255,255,255);
			}
		});
		panel.add(button_R2);
		
		JButton button_B2 = new JButton();
		button_B2.setBackground(new Color(192,192,192));
		button_B2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(192,192,192));
				drawingPanel.color = new Color(192,192,192);
			}
		});
		panel.add(button_B2);
		
		JButton button_F = new JButton();
		button_F.setBackground(new Color(128,64,64));
		button_F.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(128,64,64));
				drawingPanel.color = new Color(128,64,64);
			}
		});
		panel.add(button_F);
		
		JButton button_D = new JButton();
		button_D.setBackground(new Color(255,128,255));
		button_D.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(255,128,255));
				drawingPanel.color = new Color(255,128,255);
			}
		});
		panel.add(button_D);
		
		JButton button_A = new JButton();
		button_A.setBackground(new Color(255,155,55));
		button_A.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(255,155,55));
				drawingPanel.color = new Color(255,155,55);
			}
		});
		panel.add(button_A);
		
		JButton button_G = new JButton();
		button_G.setBackground(new Color(128,255,0));
		button_G.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(128,255,0));
				drawingPanel.color = new Color(128,255,0);
			}
		});
		panel.add(button_G);
		
		JButton button_E2 = new JButton();
		button_E2.setBackground(new Color(128,255,255));
		button_E2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(128,255,255));
				drawingPanel.color = new Color(128,255,255);
			}
		});
		panel.add(button_E2);
		
		JButton button_R33 = new JButton();
		button_R33.setBackground(new Color(255,255,120));
		button_R33.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button1.setBackground(new Color(255,255,120));
				drawingPanel.color = new Color(255,255,120);
			}
		});
		panel.add(button_R33);
		
		buttoncolor = new JButton(new ImageIcon("ImageIcon\\editcolor.png"));
		buttoncolor.setToolTipText("Color");
		buttoncolor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drawingPanel.color =JColorChooser.showDialog(buttoncolor, "color",getBackground());
				button1.setBackground(drawingPanel.color);
			}
		});
		add(buttoncolor);
		
		JLabel label = new JLabel("Size:   ");
		add(label);
		String[] size = {"1","3","5","7","10","15","20"};
		JComboBox setSize = new JComboBox(size);
		setSize.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String c = String.valueOf(setSize.getSelectedItem());
				drawingPanel.size = Integer.parseInt(c);
				
				
			}
		});
		add(setSize);
		
		button = new JButton(new ImageIcon("ImageIcon\\images.png"));
		button.setToolTipText("  ");
		add(button);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		JPanel panel_2 = new JPanel();
		add(panel_2);
		
	
	}

}
