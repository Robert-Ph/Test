package vidu;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Spanel extends JPanel {
	public Spanel() {
//		this.setLayout(new GridLayout(2,10));
		this.setBackground(Color.BLUE);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,10));
		
		JButton b1 = new JButton("1");
		b1.setBackground(Color.BLACK);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "hello","hi", JOptionPane.YES_NO_OPTION);
				
			}
		});
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("10");
		JButton b11= new JButton("11");
		JButton b12 = new JButton("12");
		JButton b13 = new JButton("13");
		JButton b14 = new JButton("14");
		JButton b15 = new JButton("15");
		JButton b16 = new JButton("16");
		JButton b17 = new JButton("17");
		JButton b18 = new JButton("18");
		JButton b19 = new JButton("19");
		JButton b20 = new JButton("20");
		JButton b21 = new JButton("21");
		
		panel1.add(b21);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		panel2.add(b6);
		panel2.add(b7);
		panel2.add(b8);
		panel2.add(b9);
		panel2.add(b10);
		panel2.add(b11);
		panel2.add(b12);
		panel2.add(b13);
		panel2.add(b14);
		panel2.add(b15);
		panel2.add(b16);
		panel2.add(b17);
		panel2.add(b18);
		panel2.add(b19);
		panel2.add(b20);
		
		this.add(panel1);
		this.add(panel2);
	}
}
