package topica.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBorDerLayOut extends JFrame {
	public void HocBorDerLayOut(String tieude) {
		this.setTitle(tieude);
		addControls();
	}

	private void addControls() {
		// goi lop cua so
		Container con = new Container();
		//
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		//
		JPanel pnNorth = new JPanel();
		//
		pnBorder.add(pnNorth, BorderLayout.NORTH);
		// them border vao lop cua so
		con.add(pnBorder);
	}

	public void showWindow() {
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
