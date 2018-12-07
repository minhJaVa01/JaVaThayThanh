package topica.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PhuongTrinhbacUi extends JFrame {
	public PhuongTrinhbacUi(String tieude) {
		super(tieude);
		addControl();
		
	}

	private void addControl() {
		Container con= getContentPane();
		JPanel pnMain= new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		JPanel pnTitle  = new JPanel();
		pnTitle.setLayout(new FlowLayout());
		JLabel lblTieuDe = new JLabel("Giai phuong trinh bac 1");
		pnTitle.add(lblTieuDe);
		pnMain.add(pnTitle);
		Font fontTieuDe = new Font("arial",Font.BOLD,20);
		
	}
	public void showWindow() {
		this.setSize(400,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}
