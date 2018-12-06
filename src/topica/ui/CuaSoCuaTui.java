package topica.ui;

import javax.swing.JFrame;

public class CuaSoCuaTui extends JFrame {
	
	public CuaSoCuaTui(String tieude) {
		super(tieude);
	}
	
	public  void showWindow() {
		this.setSize(400,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setVisible(true);
	}
	
}
