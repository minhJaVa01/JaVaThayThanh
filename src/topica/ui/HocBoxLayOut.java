package topica.ui;

import java.awt.Button;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBoxLayOut extends JFrame {
	public HocBoxLayOut(String tieude) {
		super(tieude);
		addControl();
	}

	private void addControl() {
		//
		Container con = getContentPane();
		//
		JPanel pnMain = new JPanel();
		
		JPanel pnBox = new JPanel();
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
		//
		Button btn1= new Button("Demo button 1");
		Button btn2= new Button("Demo button 2");
		Button btn3= new Button("Demo button 3");
		Button btn4= new Button("Demo button 4");
		//
		pnBox.add(btn1);
		pnBox.add(btn2);
		pnBox.add(btn3);
		pnBox.add(btn4);
		
		pnMain.add(pnBox);
		//
		con.add(pnMain);

	}

	public void showWindow() {
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
