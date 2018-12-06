package topica.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuaSoCuaTui extends JFrame {
	
	public CuaSoCuaTui(String tieude) {
		super(tieude);
		addControl();
		
	}
	
	private void addControl() {
		//lấy lớp chứa cửa sổ ra
		Container con = getContentPane();
		
		// tạo 1 lớp chứa cửa sổ
		JPanel pnMain = new JPanel();
		pnMain.setBackground(Color.BLUE);
		 
		JPanel pnFlow = new JPanel();
		pnFlow.setLayout( new FlowLayout());
		//
		JButton btn1 = new JButton("nut1");
		JButton btn2 = new JButton("nut2");
		JButton btn3 = new JButton("nut3");
		JButton btn4 = new JButton("nut4");
		JButton btn5 = new JButton("nut5");
		pnFlow.add(btn1);
		pnFlow.add(btn2);
		pnFlow.add(btn3);
		pnFlow.add(btn4);
		pnFlow.add(btn5);
		//thêm pnFlow vao pbMain
		pnMain.add(pnFlow);
		//thêm panel lên giao diện container:
		con.add(pnMain);
		
	}

	public  void showWindow() {
		this.setSize(400,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setVisible(true);
	}
	
}
