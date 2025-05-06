package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class bt28 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt28 frame = new bt28();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bt28() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);

		// Dữ liệu sinh viên (Tên, Tuổi, Điểm)
		Object[][] data = {
			{"Nguyen A", 20, 8.5},
			{"Tran B", 21, 7.5},
			{"Le C", 22, 9.0},
			{"Pham D", 20, 6.0},
			{"Nguyen E", 23, 7.0}
		};
		
		// Tiêu đề cột
		String[] columnNames = {"Tên", "Tuổi", "Điểm"};
		
		// Tạo bảng với dữ liệu và tiêu đề cột
		JTable table = new JTable(data, columnNames);
		
		// Đặt bảng vào JScrollPane
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane);
	}
}
