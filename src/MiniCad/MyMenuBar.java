package MiniCad;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MyMenuBar extends JMenuBar implements ActionListener {
	DrawingPanel drawingPanel;
	private JMenuItem itemExit;
	private JMenuItem itemNew;
	private JMenuItem itemOpen;
	private JMenuItem itemSave;
	private JMenuItem itemSaveas;
	private JMenuItem itemPrint;
	private JMenuItem itemAbout;
	 JMenuItem itemColorBackground;
	public MyMenuBar(DrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel;
		
		ActionListener action = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				String com = e.getActionCommand();
				drawingPanel.setShapeType(com);
			}
		};
	// Menu File
		JMenu menuFile = new JMenu("File");
		add(menuFile);
		itemNew = new JMenuItem("New", new ImageIcon("ImageIcon\\button_newpost.gif"));
		itemNew.setToolTipText("New (Ctrl +N) ");
		itemNew.addActionListener(this);
		menuFile.add(itemNew);
		
		itemOpen = new JMenuItem("Open", new ImageIcon("ImageIcon\\button_open.gif"));
		itemOpen.setToolTipText(" Open  (Ctrl + O) ");
		itemOpen.addActionListener(this);
		menuFile.add(itemOpen);
		
		itemSave = new JMenuItem("Save", new ImageIcon("ImageIcon\\button_save.gif"));
		itemSave.setToolTipText(" Save (Ctrl + S)");
		itemSave.addActionListener(this);
		menuFile.add(itemSave); 
		
		itemSaveas = new JMenuItem("Save as", new ImageIcon("ImageIcon\\saveas.png"));
		itemSaveas.setToolTipText(" Save as (F12) ");
		itemSaveas.addActionListener(this);
		menuFile.add(itemSaveas);
		menuFile.addSeparator();
		
		itemPrint = new JMenuItem("Print", new ImageIcon("ImageIcon\\print.png"));
		itemPrint.setToolTipText(" Print (Ctrl + P) ");
		itemPrint.addActionListener(this);
		menuFile.add(itemPrint);
		menuFile.addSeparator();
		
		itemAbout = new JMenuItem("About", new ImageIcon("ImageIcon\\info.gif"));
		itemAbout.addActionListener(this);
		menuFile.add(itemAbout);
		
		itemExit = new JMenuItem("Exit", new ImageIcon("ImageIcon\\exit.png"));
		itemExit.addActionListener(this);
		menuFile.add(itemExit);
		
		JMenu menuDraw = new JMenu("Draw");
		add(menuDraw);
		JMenuItem fillRec = new JMenuItem("Fill Rectangle");
		fillRec.addActionListener(action);
		fillRec.setActionCommand("Rec");
		menuDraw.add(fillRec);
		
		JMenuItem fillOval = new JMenuItem("Fill Oval");
		fillOval.addActionListener(action);
		fillOval.setActionCommand("Oval");
		menuDraw.add(fillOval);
		
		JMenuItem fillCir = new JMenuItem("Fill Circle");
		fillCir.addActionListener(action);
		fillCir.setActionCommand("Cir");
		menuDraw.add(fillCir);
		
	// Menu Edit
		JMenu menuEdit = new JMenu("Edit");
		add(menuEdit);
		
		itemColorBackground =new JMenuItem("Background Color");
		itemColorBackground.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				drawingPanel.colordraw = JColorChooser.showDialog(itemColorBackground, "color", getBackground());
			}
		});
		menuEdit.add(itemColorBackground);
		
		JMenu menuView = new JMenu("View");
		add(menuView);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JMenuItem item = (JMenuItem) e.getSource();
		if (item == itemExit) {
			System.exit(0);
		}
		if (item == itemColorBackground) {
			drawingPanel.colordraw = JColorChooser.showDialog(item, "color", getBackground());
		}
		if(item == itemAbout) {
			JOptionPane.showMessageDialog(null, "version: 1.0.1 \n Release Date: 4.7.2021","About",JOptionPane.CANCEL_OPTION);
		}
	}

}
