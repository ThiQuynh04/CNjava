package BT;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class bt22 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt22 frame = new bt22();
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
	public bt22() {
		setTitle("Chọn trái cây");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200); // kích thước đúng yêu cầu
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Mảng các loại trái cây
		String[] fruits = {"Táo", "Cam", "Chuối", "Xoài", "Dưa hấu"};

		// Tạo JComboBox
		JComboBox<String> fruitComboBox = new JComboBox<>(fruits);
		fruitComboBox.setBounds(50, 30, 180, 30);
		contentPane.add(fruitComboBox);

		// Tạo JLabel để hiển thị lựa chọn
		JLabel resultLabel = new JLabel("Bạn chọn: ");
		resultLabel.setBounds(50, 80, 200, 30);
		contentPane.add(resultLabel);

		// Sự kiện khi chọn trái cây
		fruitComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedFruit = (String) fruitComboBox.getSelectedItem();
				resultLabel.setText("Bạn chọn: " + selectedFruit);
			}
		});
	}
}
