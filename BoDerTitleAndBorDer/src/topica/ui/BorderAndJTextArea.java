package topica.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import javafx.scene.layout.Border;

public class BorderAndJTextArea extends JFrame {
	JTextField txtTen;
	JTextArea txtDiaChi;
	Button btnOk;

	public BorderAndJTextArea(String title) {
		super(title);
		addControl();
		addEvent();
	}

	private void addEvent() {

	}

	private void addControl() {
		Container con = getContentPane();

		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		// thiet ke panelThongTin
		JPanel pnThongTin = new JPanel();
		pnMain.add(pnThongTin);
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
		// pnTen( in -pnThongTin);
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout());
		pnThongTin.add(pnTen);

		JLabel lblTen = new JLabel("Nhập Tên:");
		txtTen = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		// pnDiaChi( in -pnThongTin)
		JPanel pnDiaChi = new JPanel();
		pnDiaChi.setLayout(new FlowLayout());
		pnThongTin .add(pnDiaChi);
		JLabel lblDiaChi = new JLabel("Đia chi");
		txtDiaChi = new JTextArea(5, 19);
		JScrollPane sc = new JScrollPane(txtDiaChi, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDiaChi.add(lblDiaChi);
		pnDiaChi.add(sc);
		
		javax.swing.border.Border borderThongTin = BorderFactory.createLineBorder(Color.RED);
		TitledBorder borderTitleThongTin = new TitledBorder(borderThongTin,"Thông Tin:");
		pnThongTin.setBorder(borderTitleThongTin);

		JPanel pnOK = new JPanel();
		pnOK.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnOk = new Button("OK");
		pnOK.add(btnOk);
		pnMain.add(pnOK);
		
		lblDiaChi.setPreferredSize(lblTen.getPreferredSize());
		
		
	}

	public void showMenu() {
		this.setSize(450, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}
