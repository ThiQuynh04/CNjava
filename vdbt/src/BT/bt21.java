package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class bt21 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt21 frame = new bt21();
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
	public bt21() {
		setTitle("Danh sách thành phố");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400); // Kích thước đúng yêu cầu
		contentPane = new JPanel();
		contentPane.setLayout(null); // Tự định vị thành phần
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Danh sách thành phố
		String[] cities = {
			"Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Hải Phòng", "Cần Thơ",
			"Huế", "Vũng Tàu", "Biên Hòa", "Nha Trang", "Buôn Ma Thuột"
		};

		// Tạo JList và JScrollPane
		JList<String> cityList = new JList<>(cities);
		JScrollPane scrollPane = new JScrollPane(cityList);
		scrollPane.setBounds(30, 30, 220, 250);
		contentPane.add(scrollPane);

		// Tạo JLabel hiển thị số lượng
		JLabel countLabel = new JLabel("Số lượng thành phố: " + cities.length);
		countLabel.setBounds(30, 300, 200, 30);
		contentPane.add(countLabel);
	}
}
